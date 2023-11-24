package com.test1;

public class eLearnPlatform {
	private Integer learningId;
	private Integer courseCode;
	private String courseName;
	private String courseDesc;
	private String courseShortDesc;
	private String courseCategory;
	private boolean isActive;
	private String courseAuthor;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public eLearnPlatform() {

	}

	public eLearnPlatform(Integer learningId, Integer courseCode, String courseName, String courseDesc,
			String courseShortDesc, String courseCategory, boolean isActive, String courseAuthor, String creationDate,
			String modifiedDate, String entityState) {
		super();
		this.learningId = learningId;
		this.courseCode = courseCode;
		this.courseName = courseName;
		this.courseDesc = courseDesc;
		this.courseShortDesc = courseShortDesc;
		this.courseCategory = courseCategory;
		this.isActive = isActive;
		this.courseAuthor = courseAuthor;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getLearningId() {
		return learningId;
	}

	public void setLearningId(Integer learningId) {
		this.learningId = learningId;
	}

	public Integer getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(Integer courseCode) {
		this.courseCode = courseCode;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseDesc() {
		return courseDesc;
	}

	public void setCourseDesc(String courseDesc) {
		this.courseDesc = courseDesc;
	}

	public String getCourseShortDesc() {
		return courseShortDesc;
	}

	public void setCourseShortDesc(String courseShortDesc) {
		this.courseShortDesc = courseShortDesc;
	}

	public String getCourseCategory() {
		return courseCategory;
	}

	public void setCourseCategory(String courseCategory) {
		this.courseCategory = courseCategory;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public String getCourseAuthor() {
		return courseAuthor;
	}

	public void setCourseAuthor(String courseAuthor) {
		this.courseAuthor = courseAuthor;
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
