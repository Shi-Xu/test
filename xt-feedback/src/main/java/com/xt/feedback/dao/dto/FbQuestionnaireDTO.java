package com.xt.feedback.dao.dto;

import java.io.Serializable;
import java.util.List;

import com.xt.feedback.dao.model.FbQuestionnaireDO;

public class FbQuestionnaireDTO extends FbQuestionnaireDO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int resultTotal;

	private List<FbPartDTO> partDOs;

	public int getResultTotal() {
		return resultTotal;
	}

	public void setResultTotal(int resultTotal) {
		this.resultTotal = resultTotal;
	}

	public List<FbPartDTO> getParts() {
		return partDOs;
	}

	public void setParts(List<FbPartDTO> partDOs) {
		this.partDOs = partDOs;
	}

}