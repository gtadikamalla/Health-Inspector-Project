package com.mfrp.model;

public class prescriptionModel {

	int id;
	String symptoms;
	String diagnosis;
	String treatment_planned;
	String prescription;
	String revisit_required;
	String next_revisit_date;
	int frequency_revisit;
	long pappointmentid;
	public long getPappointmentid() {
		return pappointmentid;
	}
	public void setPappointmentid(long pappointmentid) {
		this.pappointmentid = pappointmentid;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSymptoms() {
		return symptoms;
	}
	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}
	public String getDiagnosis() {
		return diagnosis;
	}
	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}
	public String getTreatment_planned() {
		return treatment_planned;
	}
	public void setTreatment_planned(String treatment_planned) {
		this.treatment_planned = treatment_planned;
	}
	public String getPrescription() {
		return prescription;
	}
	public void setPrescription(String prescription) {
		this.prescription = prescription;
	}
	public String getRevisit_required() {
		return revisit_required;
	}
	public void setRevisit_required(String revisit_required) {
		this.revisit_required = revisit_required;
	}
	public String getNext_revisit_date() {
		return next_revisit_date;
	}
	public void setNext_revisit_date(String next_revisit_date) {
		this.next_revisit_date = next_revisit_date;
	}
	public int getFrequency_revisit() {
		return frequency_revisit;
	}
	@Override
	public String toString() {
		return "prescriptionModel [id=" + id + ", symptoms=" + symptoms + ", diagnosis=" + diagnosis
				+ ", treatment_planned=" + treatment_planned + ", prescription=" + prescription + ", revisit_required="
				+ revisit_required + ", next_revisit_date=" + next_revisit_date + ", frequency_revisit="
				+ frequency_revisit + "]";
	}
	public void setFrequency_revisit(int frequency_revisit) {
		this.frequency_revisit = frequency_revisit;
	}
}
