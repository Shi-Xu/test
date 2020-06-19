package com.xt.feedback.dao.dto;

public class SessionDTO {
	private String uname;
	private Integer teachingId;

	public Integer getTeachingId() {
		return teachingId;
	}

	public void setTeachingId(Integer teachingId) {
		this.teachingId = teachingId;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}
	
}
