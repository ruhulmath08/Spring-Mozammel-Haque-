package com.spring.beanInitDestroy;

public class Patient {
	private int id;
	private String name;
	private int nationalId;
	
	public Patient() {
		
	}
	
	public void onCreate() {
		System.out.println("Patient Created");
	}
	
	public void onDestroy() {
		System.out.println("Patient Destroyed");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNationalId() {
		return nationalId;
	}

	public void setNationalId(int nationalId) {
		this.nationalId = nationalId;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", nationalId=" + nationalId + "]";
	}
}
