package com.mfrp.model;

public class clinicModel {

	String clinic_id;
	String clinic_name;
	String address;
	long contact_number;
	String facilities_available;
	String website;
	long pincode;
	public long getContact_number() {
		return contact_number;
	}

	public void setContact_number(long contact_number) {
		this.contact_number = contact_number;
	}

	public long getPincode() {
		return pincode;
	}

	public void setPincode(long pincode) {
		this.pincode = pincode;
	}

	String speciality;
	int id;
	String availability;

	public String getClinic_id() {
		return clinic_id;
	}

	public void setClinic_id(String clinic_id) {
		this.clinic_id = clinic_id;
	}

	public String getClinic_name() {
		return clinic_name;
	}

	public void setClinic_name(String clinic_name) {
		this.clinic_name = clinic_name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	

	public String getFacilities_available() {
		return facilities_available;
	}

	public void setFacilities_available(String facilities_available) {
		this.facilities_available = facilities_available;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
	}

	@Override
	public String toString() {
		return "clinicModel [clinic_id=" + clinic_id + ", clinic_name=" + clinic_name + ", address=" + address
				+ ", contact_number=" + contact_number + ", facilities_available=" + facilities_available + ", website="
				+ website + ", pincode=" + pincode + ", speciality=" + speciality + ", id=" + id + ", availability="
				+ availability + "]";
	}

}