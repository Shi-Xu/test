package com.xt.feedback.dao.dto;

import java.io.Serializable;
import com.xt.feedback.dao.model.FbTeachingQuDO;


public class FbTeachingQuDTO extends FbTeachingQuDO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private FbQuestionnaireDTO questionnaireDTO;
	
	private FbTeachingDTO teachingDTO;

	public FbQuestionnaireDTO getQuestionnaireDTO() {
		return questionnaireDTO;
	}

	public void setQuestionnaireDTO(FbQuestionnaireDTO questionnaireDTO) {
		this.questionnaireDTO = questionnaireDTO;
	}

	public FbTeachingDTO getTeachingDTO() {
		return teachingDTO;
	}

	public void setTeachingDTO(FbTeachingDTO teachingDTO) {
		this.teachingDTO = teachingDTO;
	}

	
}