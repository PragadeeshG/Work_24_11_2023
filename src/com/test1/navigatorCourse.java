package com.test1;

public class navigatorCourse {
	private Integer courseId;
	private String courseName;
	private String courseTypes;
	private String filters;
	private String favourites;
	private Integer mandatoryLearningHrs;
	private String courseCombinations;
	private String references;
	private String refLinkProvided;
	private Integer referenceDuration;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public navigatorCourse() {

	}

	public navigatorCourse(Integer courseId, String courseName, String courseTypes, String filters, String favourites,
			Integer mandatoryLearningHrs, String courseCombinations, String references, String refLinkProvided,
			Integer referenceDuration, String creationDate, String modifiedDate, String entityState) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseTypes = courseTypes;
		this.filters = filters;
		this.favourites = favourites;
		this.mandatoryLearningHrs = mandatoryLearningHrs;
		this.courseCombinations = courseCombinations;
		this.references = references;
		this.refLinkProvided = refLinkProvided;
		this.referenceDuration = referenceDuration;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getCourseId() {
		return courseId;
	}

	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseTypes() {
		return courseTypes;
	}

	public void setCourseTypes(String courseTypes) {
		this.courseTypes = courseTypes;
	}

	public String getFilters() {
		return filters;
	}

	public void setFilters(String filters) {
		this.filters = filters;
	}

	public String getFavourites() {
		return favourites;
	}

	public void setFavourites(String favourites) {
		this.favourites = favourites;
	}

	public Integer getMandatoryLearningHrs() {
		return mandatoryLearningHrs;
	}

	public void setMandatoryLearningHrs(Integer mandatoryLearningHrs) {
		this.mandatoryLearningHrs = mandatoryLearningHrs;
	}

	public String getCourseCombinations() {
		return courseCombinations;
	}

	public void setCourseCombinations(String courseCombinations) {
		this.courseCombinations = courseCombinations;
	}

	public String getReferences() {
		return references;
	}

	public void setReferences(String references) {
		this.references = references;
	}

	public String getRefLinkProvided() {
		return refLinkProvided;
	}

	public void setRefLinkProvided(String refLinkProvided) {
		this.refLinkProvided = refLinkProvided;
	}

	public Integer getReferenceDuration() {
		return referenceDuration;
	}

	public void setReferenceDuration(Integer referenceDuration) {
		this.referenceDuration = referenceDuration;
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
