package com.xt.feedback.service;

import java.util.List;

import com.xt.feedback.common.base.FbQtype;
import com.xt.feedback.dao.dto.FbFixQuestionDTO;

public interface FbFixQuestionService {
	List<FbFixQuestionDTO> listFbFixQuestionDTOsByOrder(int partId);

}
