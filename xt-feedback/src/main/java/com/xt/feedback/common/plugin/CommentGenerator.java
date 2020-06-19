package com.xt.feedback.common.plugin;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.internal.DefaultCommentGenerator;

/**
 * 生成model中，字段增加注释
 *
 */
public class CommentGenerator extends DefaultCommentGenerator {

	@Override
	public void addFieldComment(Field field, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {
		super.addFieldComment(field, introspectedTable, introspectedColumn);
		/*if (introspectedColumn.getRemarks() != null && !"".equals(introspectedColumn.getRemarks())) {*/
			field.addJavaDocLine("/**");
			field.addJavaDocLine(" * 字段：" + introspectedColumn.getActualColumnName());
			field.addJavaDocLine(" * " + introspectedColumn.getRemarks());
			addJavadocTag(field, false);
			field.addJavaDocLine(" */");
		/*}*/
	}

}
