package com.xt.feedback.service;

import java.util.List;

import com.xt.feedback.common.base.BaseService;
import com.xt.feedback.dao.dto.FbMultipleDTO;
import com.xt.feedback.dao.dto.FbQuestionnaireDTO;
import com.xt.feedback.dao.dto.FbSingleDTO;
import com.xt.feedback.dao.model.FbQuestionnaireDO;
import com.xt.feedback.dao.model.FbQuestionnaireDOExample;

/**
* FbQuestionnaireService接口
*
*/
public interface FbQuestionnaireService extends BaseService<FbQuestionnaireDO, FbQuestionnaireDOExample> {

	FbQuestionnaireDTO getFbQuestionnaireDTO(int questionnaireId);

	List<FbSingleDTO> getlistFbSingleDTO(FbQuestionnaireDTO questionnaireDTO);

	List<FbMultipleDTO> getlistFbMultipleDTO(FbQuestionnaireDTO questionnaireDTO);

}