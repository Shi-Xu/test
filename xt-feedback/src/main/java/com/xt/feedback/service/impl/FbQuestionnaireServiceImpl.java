package com.xt.feedback.service.impl;

import com.xt.feedback.common.annotation.BaseService;
import com.xt.feedback.common.base.BaseServiceImpl;
import com.xt.feedback.common.util.BeanUtil;
import com.xt.feedback.dao.dto.FbFixQuestionDTO;
import com.xt.feedback.dao.dto.FbMultipleDTO;
import com.xt.feedback.dao.dto.FbPartDTO;
import com.xt.feedback.dao.dto.FbQuestionnaireDTO;
import com.xt.feedback.dao.dto.FbSingleDTO;
import com.xt.feedback.dao.mapper.FbQuestionnaireDOMapper;
import com.xt.feedback.dao.model.FbMultipleDO;
import com.xt.feedback.dao.model.FbPartDO;
import com.xt.feedback.dao.model.FbQuestionnaireDO;
import com.xt.feedback.dao.model.FbQuestionnaireDOExample;
import com.xt.feedback.dao.model.FbSingleDO;
import com.xt.feedback.service.FbFixQuestionService;
import com.xt.feedback.service.FbMultipleService;
import com.xt.feedback.service.FbPartService;
import com.xt.feedback.service.FbQuestionnaireService;
import com.xt.feedback.service.FbSingleService;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.ListUtils;
import org.aspectj.weaver.patterns.TypePatternQuestions.Question;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* FbQuestionnaireService实现
*
*/
@Service
@Transactional
@BaseService
public class FbQuestionnaireServiceImpl extends BaseServiceImpl<FbQuestionnaireDOMapper, FbQuestionnaireDO, FbQuestionnaireDOExample> implements FbQuestionnaireService {

    private static final Logger LOGGER = LoggerFactory.getLogger(FbQuestionnaireServiceImpl.class);

    @Autowired
    FbPartService partService;
    @Autowired
    FbFixQuestionService fixQuestionService;
    
    @Override
    public FbQuestionnaireDTO getFbQuestionnaireDTO (int questionnaireId) {
    	FbQuestionnaireDO questionnaireDO=selectByPrimaryKey(questionnaireId, null);
    	FbQuestionnaireDTO quetionDTO=BeanUtil.copy(questionnaireDO, FbQuestionnaireDTO.class);
    	//获取试卷各个part（部分）
    	List<FbPartDO> parts=partService.listFbPartDOsByOrder(questionnaireId);
    	List<FbPartDTO> partDTOs=BeanUtil.copyList(parts, FbPartDTO.class);
    	//获取试题
    	for (FbPartDTO part : partDTOs) {
    		List<FbFixQuestionDTO> fixQuestionDTOs = fixQuestionService.listFbFixQuestionDTOsByOrder(part.getPartId());
    		part.setFixQuestionDTOs(fixQuestionDTOs);
		}
    	quetionDTO.setParts(partDTOs);
    	return quetionDTO;
    }
    
    
    @Override
    public List<FbSingleDTO> getlistFbSingleDTO(FbQuestionnaireDTO questionnaireDTO){
    	List<FbSingleDTO> singleDTOs=new ArrayList<>();
    	List<FbPartDTO> parts = questionnaireDTO.getParts();
    	for (FbPartDTO fbPartDTO : parts) {
    		List<FbFixQuestionDTO> fixQuestionDTOs = fbPartDTO.getFixQuestionDTOs();
    		for (FbFixQuestionDTO fbFixQuestionDTO : fixQuestionDTOs) {
    			if (fbFixQuestionDTO instanceof FbSingleDTO) {
    				singleDTOs.add((FbSingleDTO)fbFixQuestionDTO);
    			}
			}
		}
		return singleDTOs;
    }
    
    @Override
    public List<FbMultipleDTO> getlistFbMultipleDTO(FbQuestionnaireDTO questionnaireDTO){
    	List<FbMultipleDTO> multipleDTOs=new ArrayList<>();
    	List<FbPartDTO> parts = questionnaireDTO.getParts();
    	for (FbPartDTO fbPartDTO : parts) {
    		List<FbFixQuestionDTO> fixQuestionDTOs = fbPartDTO.getFixQuestionDTOs();
    		for (FbFixQuestionDTO fbFixQuestionDTO : fixQuestionDTOs) {
    			if (fbFixQuestionDTO instanceof FbMultipleDTO) {
    				multipleDTOs.add((FbMultipleDTO)fbFixQuestionDTO);
    			}
			}
		}
		return multipleDTOs;
    }

}