package com.xt.feedback.service.impl;

import com.xt.feedback.common.annotation.BaseService;
import com.xt.feedback.common.base.BaseServiceImpl;
import com.xt.feedback.common.util.BeanUtil;
import com.xt.feedback.dao.dto.FbTeachingDTO;
import com.xt.feedback.dao.dto.FbTeachingQuDTO;
import com.xt.feedback.dao.mapper.FbTeachingQuDOMapper;
import com.xt.feedback.dao.model.FbTeachingDO;
import com.xt.feedback.dao.model.FbTeachingQuDO;
import com.xt.feedback.dao.model.FbTeachingQuDOExample;
import com.xt.feedback.dao.model.FbTeachingQuDOExample.Criteria;
import com.xt.feedback.service.FbQuestionnaireService;
import com.xt.feedback.service.FbTeachingQuService;
import com.xt.feedback.service.FbTeachingService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* FbTeachingQuService实现
*
*/
@Service
@Transactional
@BaseService
public class FbTeachingQuServiceImpl extends BaseServiceImpl<FbTeachingQuDOMapper, FbTeachingQuDO, FbTeachingQuDOExample> implements FbTeachingQuService {

    private static final Logger LOGGER = LoggerFactory.getLogger(FbTeachingQuServiceImpl.class);

    @Autowired
    FbQuestionnaireService questionService;
    @Autowired
    FbTeachingService teachingService;
    
	@Override
	public FbTeachingQuDTO getTchQuAndQuestionnaire(int teachingId,Byte active) {
		FbTeachingQuDOExample example=new FbTeachingQuDOExample();
		Criteria criteria=example.createCriteria().andTeachingIdEqualTo(teachingId);
		if (active!=null) {
			criteria.andActiveEqualTo(active);
		}
		FbTeachingQuDO teachingQuDO=selectFirstByExample(example);
		if (teachingQuDO == null) {
			return null;
		}
		FbTeachingQuDTO teachingQuDTO=BeanUtil.copy(teachingQuDO, FbTeachingQuDTO.class);
		//添加试卷
		teachingQuDTO.setQuestionnaireDTO(questionService.getFbQuestionnaireDTO(teachingQuDTO.getQuestionnaireId()));
		return teachingQuDTO;
	}
	
	@Override
	public FbTeachingQuDTO getTchQuFull(int teachingId,Byte active) {
		FbTeachingQuDTO tchQuAndQuestionnaire = getTchQuAndQuestionnaire(teachingId, active);
		if (tchQuAndQuestionnaire==null) {
			return tchQuAndQuestionnaire;
		}
		FbTeachingDO fbTeachingDO=teachingService.selectByPrimaryKey(teachingId, null);
		tchQuAndQuestionnaire.setTeachingDTO(BeanUtil.copy(fbTeachingDO, FbTeachingDTO.class));
		return tchQuAndQuestionnaire;
	}

}