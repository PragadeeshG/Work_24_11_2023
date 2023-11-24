package com.test1;

public class learningTypes {
	private Integer systemId;
	private String lmsName;
	private String lmsMetrics;
	private String imsIntegrations;
	private String lmsType;
	private String externalSource;
	private boolean isActive;
	private Integer learningGoallnHrs;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public learningTypes() {

	}

	public learningTypes(Integer systemId, String lmsName, String lmsMetrics, String imsIntegrations, String lmsType,
			String externalSource, boolean isActive, Integer learningGoallnHrs, String creationDate,
			String modifiedDate, String entityState) {
		super();
		this.systemId = systemId;
		this.lmsName = lmsName;
		this.lmsMetrics = lmsMetrics;
		this.imsIntegrations = imsIntegrations;
		this.lmsType = lmsType;
		this.externalSource = externalSource;
		this.isActive = isActive;
		this.learningGoallnHrs = learningGoallnHrs;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getSystemId() {
		return systemId;
	}

	public void setSystemId(Integer systemId) {
		this.systemId = systemId;
	}

	public String getLmsName() {
		return lmsName;
	}

	public void setLmsName(String lmsName) {
		this.lmsName = lmsName;
	}

	public String getLmsMetrics() {
		return lmsMetrics;
	}

	public void setLmsMetrics(String lmsMetrics) {
		this.lmsMetrics = lmsMetrics;
	}

	public String getImsIntegrations() {
		return imsIntegrations;
	}

	public void setImsIntegrations(String imsIntegrations) {
		this.imsIntegrations = imsIntegrations;
	}

	public String getLmsType() {
		return lmsType;
	}

	public void setLmsType(String lmsType) {
		this.lmsType = lmsType;
	}

	public String getExternalSource() {
		return externalSource;
	}

	public void setExternalSource(String externalSource) {
		this.externalSource = externalSource;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public Integer getLearningGoallnHrs() {
		return learningGoallnHrs;
	}

	public void setLearningGoallnHrs(Integer learningGoallnHrs) {
		this.learningGoallnHrs = learningGoallnHrs;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
