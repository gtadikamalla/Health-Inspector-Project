package com.mfrp.model;

public class appointmentModel {

	long appointmentId;
	public long getAppointmentId() {
		return appointmentId;
	}
	public void setAppointmentId(long appointmentId) {
		this.appointmentId = appointmentId;
	}
	String patient_name;
	String Patient_locality;
	String purpose_of_visit;
	int age;
	String gender;
	long contact_number;
	long clinic_id;
	String status;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getPatient_name() {
		return patient_name;
	}
	public void setPatient_name(String patient_name) {
		this.patient_name = patient_name;
	}
	public String getPatient_locality() {
		return Patient_locality;
	}
	public void setPatient_locality(String patient_locality) {
		Patient_locality = patient_locality;
	}
	public String getPurpose_of_visit() {
		return purpose_of_visit;
	}
	public void setPurpose_of_visit(String purpose_of_visit) {
		this.purpose_of_visit = purpose_of_visit;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public long getContact_number() {
		return contact_number;
	}
	public void setContact_number(long contact_number) {
		this.contact_number = contact_number;
	}
	public long getClinic_id() {
		return clinic_id;
	}
	public void setClinic_id(long clinic_id) {
		this.clinic_id = clinic_id;
	}
	
	
}
