package com.xt.feedback.common.plugin;


public class ResultColumns {
	//Example类的set方法会强制修改alias（表别名）
	private  String alias; 
	private  String[] columns;

	public ResultColumns() {
	}
	
	public ResultColumns(String[] columns) {
		this.columns=columns;
	}
	
	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public  String[] getColumns() {
		return columns;
	}

	public  void setColumns(String[] columns) {
		this.columns = columns;
	}

}
