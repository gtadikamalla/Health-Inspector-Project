package com.mfrp.model;

public class AloginModel {

	@Override
	public String toString() {
		return "AloginModel [id=" + id + ", password=" + password + "]";
	}
	private int id;
	private String password;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
