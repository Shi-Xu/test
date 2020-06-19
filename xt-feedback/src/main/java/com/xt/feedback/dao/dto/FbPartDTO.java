package com.xt.feedback.dao.dto;

import java.io.Serializable;
import java.util.List;

import com.xt.feedback.dao.model.FbPartDO;

public class FbPartDTO extends FbPartDO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private List<FbFixQuestionDTO> fixQuestionDTOs;

	public List<FbFixQuestionDTO> getFixQuestionDTOs() {
		return fixQuestionDTOs;
	}

	public void setFixQuestionDTOs(List<FbFixQuestionDTO> fixQuestionDTOs) {
		this.fixQuestionDTOs = fixQuestionDTOs;
	}

	
}