package com.investment.domain.objects;

public class Resource {
	private String classname;
	private ResourceFields fields;
	/**
	 * @return the classname
	 */
	public String getClassname() {
		return classname;
	}
	/**
	 * @param classname the classname to set
	 */
	public void setClassname(String classname) {
		this.classname = classname;
	}
	/**
	 * @return the fields
	 */
	public ResourceFields getFields() {
		return fields;
	}
	/**
	 * @param fields the fields to set
	 */
	public void setFields(ResourceFields fields) {
		this.fields = fields;
	}
}
