package com.citiustech.mrr.excelrules;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class MainProcessBO implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("zipCode")
	private int zipCode;
	@org.kie.api.definition.type.Label("measure")
	private java.lang.String measure;
	@org.kie.api.definition.type.Label("provider")
	private java.lang.String provider;
	@org.kie.api.definition.type.Label("lastUser")
	private java.lang.String lastUser;
	@org.kie.api.definition.type.Label("user")
	private java.lang.String user;
	@org.kie.api.definition.type.Label("status")
	private java.lang.String status;

	@org.kie.api.definition.type.Label(value = "defaultRule")
	private java.lang.String defaultRule;

	public MainProcessBO() {
	}

	public int getZipCode() {
		return this.zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public java.lang.String getMeasure() {
		return this.measure;
	}

	public void setMeasure(java.lang.String measure) {
		this.measure = measure;
	}

	public java.lang.String getProvider() {
		return this.provider;
	}

	public void setProvider(java.lang.String provider) {
		this.provider = provider;
	}

	public java.lang.String getLastUser() {
		return this.lastUser;
	}

	public void setLastUser(java.lang.String lastUser) {
		this.lastUser = lastUser;
	}

	public java.lang.String getUser() {
		return this.user;
	}

	public void setUser(java.lang.String user) {
		this.user = user;
	}

	public java.lang.String getStatus() {
		return this.status;
	}

	public void setStatus(java.lang.String status) {
		this.status = status;
	}

	public java.lang.String getDefaultRule() {
		return this.defaultRule;
	}

	public void setDefaultRule(java.lang.String defaultRule) {
		this.defaultRule = defaultRule;
	}

	public MainProcessBO(int zipCode, java.lang.String measure,
			java.lang.String provider, java.lang.String lastUser,
			java.lang.String user, java.lang.String status,
			java.lang.String defaultRule) {
		this.zipCode = zipCode;
		this.measure = measure;
		this.provider = provider;
		this.lastUser = lastUser;
		this.user = user;
		this.status = status;
		this.defaultRule = defaultRule;
	}

}