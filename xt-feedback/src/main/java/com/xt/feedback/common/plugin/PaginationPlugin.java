package com.xt.feedback.common.plugin;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.*;
import org.mybatis.generator.api.dom.xml.Attribute;
import org.mybatis.generator.api.dom.xml.Document;
import org.mybatis.generator.api.dom.xml.Element;
import org.mybatis.generator.api.dom.xml.TextElement;
import org.mybatis.generator.api.dom.xml.XmlElement;

import java.util.List;

/**
 * MySQL分页插件
 *
 */
public class PaginationPlugin extends PluginAdapter {
	private XmlElement oldBaseColumnListElement;
	private static final String RESULT_COLUMNS = "resultColumns";

	@Override
	public boolean validate(List<String> list) {
		return true;
	}

	/**
	 * 为每个Example类添加limit和offset属性和set、get方法
	 * 添加表字段添加别名的方法
	 */
	@Override
	public boolean modelExampleClassGenerated(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
		
		PrimitiveTypeWrapper integerWrapper = FullyQualifiedJavaType.getIntInstance().getPrimitiveTypeWrapper();
		FullyQualifiedJavaType StringWrapper = FullyQualifiedJavaType.getStringInstance();
		FullyQualifiedJavaType ObjectWrapper = FullyQualifiedJavaType.getObjectInstance();
		//生成表别名字段
		String tableAlias=introspectedTable.getBaseColumns().get(0).getTableAlias();
		Field tAlias = new Field();
		tAlias.setName("TALIAS");
		tAlias.setVisibility(JavaVisibility.PUBLIC);
		tAlias.setStatic(true);
		tAlias.setFinal(true);
		tAlias.setType(StringWrapper);
		tAlias.setInitializationString("\""+tableAlias+"\"");
		topLevelClass.addField(tAlias);
		
		//添加表别名字段方法
		Method addAliasByComma = new Method();
		addAliasByComma.setName("addAliasByComma");
		addAliasByComma.setStatic(true);
		addAliasByComma.setVisibility(JavaVisibility.PUBLIC);
		addAliasByComma.addParameter(new Parameter(StringWrapper, "columns"));
		addAliasByComma.setReturnType(StringWrapper);
		addAliasByComma.addBodyLine("if (columns == null) return null;");
		addAliasByComma.addBodyLine("String[] columnList=columns.split(\",\");");
		addAliasByComma.addBodyLine("columns=\"\";");
		addAliasByComma.addBodyLine("for (int i=0;i< columnList.length;i++) {");
		addAliasByComma.addBodyLine("String string=TALIAS+\".\"+columnList[i].trim();");
		addAliasByComma.addBodyLine("if (i!=0) { string=\",\"+string; }");
		addAliasByComma.addBodyLine("columns=columns+string;");
		addAliasByComma.addBodyLine("}");
		addAliasByComma.addBodyLine("return columns;");
		topLevelClass.addMethod(addAliasByComma);
		
		Field limit = new Field();
		limit.setName("limit");
		limit.setVisibility(JavaVisibility.PRIVATE);
		limit.setType(integerWrapper);
		topLevelClass.addField(limit);

		Method setLimit = new Method();
		setLimit.setVisibility(JavaVisibility.PUBLIC);
		setLimit.setName("setLimit");
		setLimit.addParameter(new Parameter(integerWrapper, "limit"));
		setLimit.addBodyLine("this.limit = limit;");
		topLevelClass.addMethod(setLimit);

		Method getLimit = new Method();
		getLimit.setVisibility(JavaVisibility.PUBLIC);
		getLimit.setReturnType(integerWrapper);
		getLimit.setName("getLimit");
		getLimit.addBodyLine("return limit;");
		topLevelClass.addMethod(getLimit);

		Field offset = new Field();
		offset.setName("offset");
		offset.setVisibility(JavaVisibility.PRIVATE);
		offset.setType(integerWrapper);
		topLevelClass.addField(offset);

		Method setOffset = new Method();
		setOffset.setVisibility(JavaVisibility.PUBLIC);
		setOffset.setName("setOffset");
		setOffset.addParameter(new Parameter(integerWrapper, "offset"));
		setOffset.addBodyLine("this.offset = offset;");
		topLevelClass.addMethod(setOffset);

		Method getOffset = new Method();
		getOffset.setVisibility(JavaVisibility.PUBLIC);
		getOffset.setReturnType(integerWrapper);
		getOffset.setName("getOffset");
		getOffset.addBodyLine("return offset;");
		topLevelClass.addMethod(getOffset);
		
		Field resultColumns = new Field();
		resultColumns.setName(RESULT_COLUMNS);
		resultColumns.setVisibility(JavaVisibility.PRIVATE);
		resultColumns.setType(ObjectWrapper);
		topLevelClass.addField(resultColumns);
		
		char c = RESULT_COLUMNS.charAt(0);
	    String camel = Character.toUpperCase(c) + RESULT_COLUMNS.substring(1);

		Method setResultColumns = new Method();
		setResultColumns.setVisibility(JavaVisibility.PUBLIC);
		setResultColumns.setName("set"+camel);
		setResultColumns.addParameter(new Parameter(ObjectWrapper, RESULT_COLUMNS));
		setResultColumns.addBodyLine("this."+RESULT_COLUMNS+" = "+RESULT_COLUMNS+";");
		topLevelClass.addMethod(setResultColumns);

		Method getResultColumns = new Method();
		getResultColumns.setVisibility(JavaVisibility.PUBLIC);
		getResultColumns.setReturnType(ObjectWrapper);
		getResultColumns.setName("get"+camel);
		getResultColumns.addBodyLine("return "+RESULT_COLUMNS+";");
		topLevelClass.addMethod(getResultColumns);

		return true;
	}

	
	/**
	 * 为Mapper.xml的selectByExample添加limit,offset
	 */
	@Override
	public boolean sqlMapSelectByExampleWithoutBLOBsElementGenerated(XmlElement element,
	                                                                 IntrospectedTable introspectedTable) {

		XmlElement ifLimitNotNullElement = new XmlElement("if");
		ifLimitNotNullElement.addAttribute(new Attribute("test", "limit != null"));

		XmlElement ifOffsetNotNullElement = new XmlElement("if");
		ifOffsetNotNullElement.addAttribute(new Attribute("test", "offset != null"));
		ifOffsetNotNullElement.addElement(new TextElement("limit ${offset}, ${limit}"));
		ifLimitNotNullElement.addElement(ifOffsetNotNullElement);

		XmlElement ifOffsetNullElement = new XmlElement("if");
		ifOffsetNullElement.addAttribute(new Attribute("test", "offset == null"));
		ifOffsetNullElement.addElement(new TextElement("limit ${limit}"));
		ifLimitNotNullElement.addElement(ifOffsetNullElement);

		element.addElement(ifLimitNotNullElement);

		return true;
	}

	@Override
	public boolean sqlMapBaseColumnListElementGenerated(XmlElement element, IntrospectedTable introspectedTable) {
		//拷贝原来的BaseColumnList，方便添加在xml的最后
		oldBaseColumnListElement=new XmlElement(element);
		
		List<Element> elements=element.getElements();
		//清除原有的内容
		elements.clear();
		
		baseColumnListElementGenerated(element, introspectedTable);
		return true;
	}
	
	
	private void baseColumnListElementGenerated(XmlElement element, IntrospectedTable introspectedTable){
		String tableAlias=introspectedTable.getBaseColumns().get(0).getTableAlias();
		XmlElement ifResultColumnsNotNullElement = new XmlElement("if");
		ifResultColumnsNotNullElement.addAttribute(new Attribute("test", RESULT_COLUMNS+" != null"));
		
		//foreachColumns:start
		XmlElement foreachColumns = new XmlElement("foreach");
		foreachColumns.addAttribute(new Attribute("item", "item"));
		foreachColumns.addAttribute(new Attribute("collection", RESULT_COLUMNS+".columns"));
		foreachColumns.addAttribute(new Attribute("separator", ","));
		
		String item=tableAlias+".${item} as "+tableAlias+"_${item}";
		TextElement column=new TextElement(item);
		foreachColumns.addElement(column);
		//foreachColumns:end
		ifResultColumnsNotNullElement.addElement(foreachColumns);
		
		XmlElement ifResultColumnsNullElement = new XmlElement("if");
		ifResultColumnsNullElement.addAttribute(new Attribute("test", RESULT_COLUMNS+" == null"));
		
		for (Element element2 : oldBaseColumnListElement.getElements()) {
			ifResultColumnsNullElement.addElement((TextElement)element2);
		}
		
		element.addElement(ifResultColumnsNotNullElement);
		element.addElement(ifResultColumnsNullElement);
	}
	
	@Override
	public boolean sqlMapDocumentGenerated(Document document, IntrospectedTable introspectedTable) {
		List<Attribute> attributes=oldBaseColumnListElement.getAttributes();
		attributes.clear();
		attributes.add(new Attribute("id", "All_Column_List"));
		document.getRootElement().addElement(oldBaseColumnListElement);
		return true;
	}
	
	@Override
	//修改Example
	public boolean clientSelectByPrimaryKeyMethodGenerated(Method method, Interface interfaze,
			IntrospectedTable introspectedTable) {
		List<Parameter> parameters=method.getParameters();
		parameters.get(0).addAnnotation("@Param(\""+parameters.get(0).getName()+"\")");
		FullyQualifiedJavaType Object = FullyQualifiedJavaType.getObjectInstance();
		method.addParameter(new Parameter(Object, "resultColumns", "@Param(\"resultColumns\")"));
		return true;
	}
	
	@Override
	//修改mapper
	public boolean sqlMapSelectByPrimaryKeyElementGenerated(XmlElement element, IntrospectedTable introspectedTable) {
		Attribute attribute=getAttrubute(element, "parameterType");
		java.lang.reflect.Field field;
		try {
			field = attribute.getClass().getDeclaredField("value");
			field.setAccessible(true);
			field.set(attribute, "map");
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}
		return true;
	}
	
	@Override
	public boolean sqlMapDeleteByExampleElementGenerated(XmlElement element, IntrospectedTable introspectedTable) {
		String tableAlias=introspectedTable.getBaseColumns().get(0).getTableAlias();
		TextElement element2=(TextElement) element.getElements().get(0);
		String content = element2.getContent();
		content=content.replaceFirst("delete from", "delete "+tableAlias+" from");
		element2=new TextElement(content);
		element.getElements().set(0, element2);
		return super.sqlMapDeleteByExampleElementGenerated(element, introspectedTable);
	}
	
	private Attribute getAttrubute(XmlElement element,String name){
		List<Attribute> attributes=element.getAttributes();
		for (Attribute attribute : attributes) {
			if (attribute.getName().equals(name)) {
				return attribute;
			}
		}
		return null;
	}
	
}
