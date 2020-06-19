package com.xt.feedback.common;


import java.util.HashMap;
import java.util.Map;

import com.xt.feedback.common.util.MybatisGeneratorUtil;
import com.xt.feedback.common.util.PropertiesFileUtil;

/**
 * 代码生成类
 */
public class Generator {

	// 根据命名规范，只修改此常量值即可
	private static String MODULE = "xt-feedback";
	private static String DATABASE = "xt_feedback";
	private static String TABLE_PREFIX = "fb_";
	private static String PACKAGE_NAME = "com.xt.feedback";
	private static String JDBC_DRIVER = PropertiesFileUtil.getInstance("mybatis/generator/generator").get("generator.jdbc.driver");
	private static String JDBC_URL = PropertiesFileUtil.getInstance("mybatis/generator/generator").get("generator.jdbc.url");
	private static String JDBC_USERNAME = PropertiesFileUtil.getInstance("mybatis/generator/generator").get("generator.jdbc.username");
	private static String JDBC_PASSWORD = PropertiesFileUtil.getInstance("mybatis/generator/generator").get("generator.jdbc.password");
	// 需要insert后返回主键的表配置，key:表名,value:主键名
	private static Map<String, String> LAST_INSERT_ID_TABLES = new HashMap<>();
	public static Map<String, String> tableAlias = new HashMap<>();
	static {
		LAST_INSERT_ID_TABLES.put("fb_multiple", "multiple_id");
		LAST_INSERT_ID_TABLES.put("fb_part", "part_id");
		LAST_INSERT_ID_TABLES.put("fb_questionnaire", "questionnaire_id");
		LAST_INSERT_ID_TABLES.put("fb_result", "result_id");
		LAST_INSERT_ID_TABLES.put("fb_single", "single_id");
		LAST_INSERT_ID_TABLES.put("fb_teacher", "teacher_id");
		LAST_INSERT_ID_TABLES.put("fb_teaching", "teaching_id");
		LAST_INSERT_ID_TABLES.put("fb_teaching_qu", "teaching_qu_id");
		
		tableAlias.put("fb_multiple", "mp");
		tableAlias.put("fb_part", "pr");
		tableAlias.put("fb_questionnaire", "qu");
		tableAlias.put("fb_result", "rs");
		tableAlias.put("fb_single", "sg");
		tableAlias.put("fb_teacher", "tch");
		tableAlias.put("fb_teaching", "tc");
		tableAlias.put("fb_teaching_qu", "tq");
		
	}

	/**
	 * 自动代码生成
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		MybatisGeneratorUtil.generator(JDBC_DRIVER, JDBC_URL, JDBC_USERNAME, JDBC_PASSWORD, MODULE, DATABASE, TABLE_PREFIX, PACKAGE_NAME, LAST_INSERT_ID_TABLES, tableAlias);
	}
	

}
