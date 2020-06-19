package com.xt.feedback.dao.dto;

import java.io.Serializable;

public class FbOptionDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	private String item;
	private String content;
	//选项总数
	private int total;
	
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
	
}
