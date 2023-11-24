package com.test1;

public class pathwayCourse {
	private Integer courseId;
	private String courseName;
	private String pathwayName;
	private String pathwayContent;
	private Integer coursesInPathway;
	private Integer videosCount;
	private Integer confluenceCount;
	private String referencesList;
	private String pathwayAuthors;
	private Integer pathwayDuration;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public pathwayCourse() {

	}

	public pathwayCourse(Integer courseId, String courseName, String pathwayName, String pathwayContent,
			Integer coursesInPathway, Integer videosCount, Integer confluenceCount, String referencesList,
			String pathwayAuthors, Integer pathwayDuration, String creationDate, String modifiedDate,
			String entityState) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.pathwayName = pathwayName;
		this.pathwayContent = pathwayContent;
		this.coursesInPathway = coursesInPathway;
		this.videosCount = videosCount;
		this.confluenceCount = confluenceCount;
		this.referencesList = referencesList;
		this.pathwayAuthors = pathwayAuthors;
		this.pathwayDuration = pathwayDuration;
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

	public String getPathwayName() {
		return pathwayName;
	}

	public void setPathwayName(String pathwayName) {
		this.pathwayName = pathwayName;
	}

	public String getPathwayContent() {
		return pathwayContent;
	}

	public void setPathwayContent(String pathwayContent) {
		this.pathwayContent = pathwayContent;
	}

	public Integer getCoursesInPathway() {
		return coursesInPathway;
	}

	public void setCoursesInPathway(Integer coursesInPathway) {
		this.coursesInPathway = coursesInPathway;
	}

	public Integer getVideosCount() {
		return videosCount;
	}

	public void setVideosCount(Integer videosCount) {
		this.videosCount = videosCount;
	}

	public Integer getConfluenceCount() {
		return confluenceCount;
	}

	public void setConfluenceCount(Integer confluenceCount) {
		this.confluenceCount = confluenceCount;
	}

	public String getReferencesList() {
		return referencesList;
	}

	public void setReferencesList(String referencesList) {
		this.referencesList = referencesList;
	}

	public String getPathwayAuthors() {
		return pathwayAuthors;
	}

	public void setPathwayAuthors(String pathwayAuthors) {
		this.pathwayAuthors = pathwayAuthors;
	}

	public Integer getPathwayDuration() {
		return pathwayDuration;
	}

	public void setPathwayDuration(Integer pathwayDuration) {
		this.pathwayDuration = pathwayDuration;
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
