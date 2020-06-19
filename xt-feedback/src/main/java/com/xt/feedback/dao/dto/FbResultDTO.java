package com.xt.feedback.dao.dto;

import java.io.Serializable;
import com.xt.feedback.dao.model.FbResultDO;

public class FbResultDTO extends FbResultDO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	FbFixResultFromJsonDTO fixResultFromJsonDTO;

	public FbFixResultFromJsonDTO getFixResultFromJsonDTO() {
		return fixResultFromJsonDTO;
	}

	public void setFixResultFromJsonDTO(FbFixResultFromJsonDTO fixResultFromJsonDTO) {
		this.fixResultFromJsonDTO = fixResultFromJsonDTO;
	}
	
}