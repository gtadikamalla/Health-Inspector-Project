package com.mfrp.model;

public class Pregister {

	String first_name;
	String last_name;
	String dob;

	String gender;
	Double contact_number;
	int id;
	String password;
	String email;

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Double getContact_number() {
		return contact_number;
	}

	public void setContact_number(Double contact_number) {
		this.contact_number = contact_number;
	}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Pregister [first_name=" + first_name + ", last_name=" + last_name + ", dob=" + dob + ", gender="
				+ gender + ", contact_number=" + contact_number + ", id=" + id + ", password=" + password + ", email="
				+ email + "]";
	}
	
	
}
