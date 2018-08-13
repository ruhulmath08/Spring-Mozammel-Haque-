package com.spring._setNullProperty;

import java.util.HashMap;
import java.util.Map;

public class ContactBook {
	private Patient patient;
	private Map<String, EmergencyContact> contacts = new HashMap<String, EmergencyContact>();

	public ContactBook() {
		patient = new Patient(10, "Dolly");
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Map<String, EmergencyContact> getContact() {
		return contacts;
	}

	public void setContact(Map<String, EmergencyContact> contact) {
		this.contacts = contact;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(patient == null? "patient is null" :patient.toString() + "\n");
		for (Map.Entry<String, EmergencyContact> contact : contacts.entrySet()) {
			sb.append(contact.toString() + "\n");
		}
		return sb.toString();
	}

}
