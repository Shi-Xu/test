package com.xt.feedback.common.util;

public class Table {
	private String table_name;
	private String model_name;
	private String do_name;
	private String LAST_INSERT_ID_TABLES;
	private String alias;
	public String getTable_name() {
		return table_name;
	}
	public void setTable_name(String table_name) {
		this.table_name = table_name;
	}
	public String getModel_name() {
		return model_name;
	}
	public void setModel_name(String model_name) {
		this.model_name = model_name;
	}
	public String getDo_name() {
		return do_name;
	}
	public void setDo_name(String do_name) {
		this.do_name = do_name;
	}
	public String getLAST_INSERT_ID_TABLES() {
		return LAST_INSERT_ID_TABLES;
	}
	public void setLAST_INSERT_ID_TABLES(String lAST_INSERT_ID_TABLES) {
		LAST_INSERT_ID_TABLES = lAST_INSERT_ID_TABLES;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	
}
