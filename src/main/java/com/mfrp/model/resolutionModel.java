package com.mfrp.model;

public class resolutionModel {
	int helpissue_id;

	public int getHelpissue_id() {
		return helpissue_id;
	}

	public void setHelpissue_id(int helpissue_id) {
		this.helpissue_id = helpissue_id;
	}

	public String getResolution() {
		return resolution;
	}

	public void setResolution(String resolution) {
		this.resolution = resolution;
	}

	@Override
	public String toString() {
		return "resolutionModel [helpissue_id=" + helpissue_id + ", resolution=" + resolution + "]";
	}

	String resolution;

}
