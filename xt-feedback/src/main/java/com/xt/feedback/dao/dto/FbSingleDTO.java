package com.xt.feedback.dao.dto;

import java.io.Serializable;

public class FbSingleDTO extends FbFixQuestionDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
    /**
     * 字段：single_id
     * 
     *
     * @mbg.generated
     */
    private Integer singleId;

	public Integer getSingleId() {
		return singleId;
	}

	public void setSingleId(Integer singleId) {
		this.singleId = singleId;
	}
	
}