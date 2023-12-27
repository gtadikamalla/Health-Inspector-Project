package com.mfrp.model;

public class issue {

	int id;
	String issue;
	String description;
	String resolution;
	int userid;

	resolutionModel model;

	public resolutionModel getModel() {
		return model;
	}

	public void setModel(resolutionModel model) {
		this.model = model;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIssue() {
		return issue;
	}

	public void setIssue(String issue) {
		this.issue = issue;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getResolution() {
		return resolution;
	}

	public void setResolution(String resolution) {
		this.resolution = resolution;
	}

	@Override
	public String toString() {
		return "issue [id=" + id + ", issue=" + issue + ", description=" + description + ", resolution=" + resolution
				+ ", userid=" + userid + ", model=" + model + "]";
	}
	
	

}
