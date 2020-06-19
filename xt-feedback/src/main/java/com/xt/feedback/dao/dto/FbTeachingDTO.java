package com.xt.feedback.dao.dto;

import java.io.Serializable;

import com.xt.feedback.dao.model.FbTeachingDO;


public class FbTeachingDTO extends FbTeachingDO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String courseNoAndOrder;

	public String getCourseNoAndOrder() {
		setCourseNoAndOrder(getCourseNo()+"-"+getCourseOrder());
		return courseNoAndOrder;
	}

	public void setCourseNoAndOrder(String courseNoAndOrder) {
		this.courseNoAndOrder = courseNoAndOrder;
	}
	
   
}