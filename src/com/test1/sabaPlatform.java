package com.test1;

public class sabaPlatform {
	private Integer couseId;
	private String courseName;
	private boolean mandatoryCouse;
	private Integer mandatoryLearningHrs;
	private String courseAuthor;
	private String managedBy;
	private Integer review;
	private Integer grade;
	private String category;
	private String subAuthor;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public sabaPlatform() {

	}

	public sabaPlatform(Integer couseId, String courseName, boolean mandatoryCouse, Integer mandatoryLearningHrs,
			String courseAuthor, String managedBy, Integer review, Integer grade, String category, String subAuthor,
			String creationDate, String modifiedDate, String entityState) {
		super();
		this.couseId = couseId;
		this.courseName = courseName;
		this.mandatoryCouse = mandatoryCouse;
		this.mandatoryLearningHrs = mandatoryLearningHrs;
		this.courseAuthor = courseAuthor;
		this.managedBy = managedBy;
		this.review = review;
		this.grade = grade;
		this.category = category;
		this.subAuthor = subAuthor;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getCouseId() {
		return couseId;
	}

	public void setCouseId(Integer couseId) {
		this.couseId = couseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public boolean isMandatoryCouse() {
		return mandatoryCouse;
	}

	public void setMandatoryCouse(boolean mandatoryCouse) {
		this.mandatoryCouse = mandatoryCouse;
	}

	public Integer getMandatoryLearningHrs() {
		return mandatoryLearningHrs;
	}

	public void setMandatoryLearningHrs(Integer mandatoryLearningHrs) {
		this.mandatoryLearningHrs = mandatoryLearningHrs;
	}

	public String getCourseAuthor() {
		return courseAuthor;
	}

	public void setCourseAuthor(String courseAuthor) {
		this.courseAuthor = courseAuthor;
	}

	public String getManagedBy() {
		return managedBy;
	}

	public void setManagedBy(String managedBy) {
		this.managedBy = managedBy;
	}

	public Integer getReview() {
		return review;
	}

	public void setReview(Integer review) {
		this.review = review;
	}

	public Integer getGrade() {
		return grade;
	}

	public void setGrade(Integer grade) {
		this.grade = grade;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getSubAuthor() {
		return subAuthor;
	}

	public void setSubAuthor(String subAuthor) {
		this.subAuthor = subAuthor;
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
