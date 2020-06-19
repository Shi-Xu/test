package com.xt.feedback.common.plugin;

import java.util.List;
import java.util.Map;


public class ResultUnionColumns {
	//联合查询，表别名与字段
	private  Map<String,List<String>> unionColumns;

	public Map<String, List<String>> getUnionColumns() {
		return unionColumns;
	}

	public void setUnionColumns(Map<String, List<String>> unionColumns) {
		this.unionColumns = unionColumns;
	}


	
}
