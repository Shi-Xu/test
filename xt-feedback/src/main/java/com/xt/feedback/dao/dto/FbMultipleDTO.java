package com.xt.feedback.dao.dto;

import java.io.Serializable;


public class FbMultipleDTO extends FbFixQuestionDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
    /**
     * 字段：multiple_id
     * 
     *
     * @mbg.generated
     */
    private Integer multipleId;

	public Integer getMultipleId() {
		return multipleId;
	}

	public void setMultipleId(Integer multipleId) {
		this.multipleId = multipleId;
	}
    
}