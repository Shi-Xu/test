package com.xt.feedback.service.impl;

import com.xt.feedback.common.annotation.BaseService;
import com.xt.feedback.common.base.BaseServiceImpl;
import com.xt.feedback.dao.mapper.FbPartDOMapper;
import com.xt.feedback.dao.model.FbPartDO;
import com.xt.feedback.dao.model.FbPartDOExample;
import com.xt.feedback.service.FbPartService;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* FbPartService实现
* Created by liteng on 2019/11/26.
*/
@Service
@Transactional
@BaseService
public class FbPartServiceImpl extends BaseServiceImpl<FbPartDOMapper, FbPartDO, FbPartDOExample> implements FbPartService {

    private static final Logger LOGGER = LoggerFactory.getLogger(FbPartServiceImpl.class);

    
    /**
     * @param
     * @return 查询带顺序（order升序）
     */
    @Override
    public List<FbPartDO> listFbPartDOsByOrder(int questionnaireId) {
    	FbPartDOExample partExample=new FbPartDOExample();
    	partExample.createCriteria().andQuestionnaireIdEqualTo(questionnaireId);
    	partExample.setOrderByClause("sort asc");
    	List<FbPartDO> partDOs = selectByExample(partExample);
		return partDOs;
    }

}