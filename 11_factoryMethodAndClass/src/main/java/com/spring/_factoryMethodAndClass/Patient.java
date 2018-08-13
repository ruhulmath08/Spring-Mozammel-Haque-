package com.spring._factoryMethodAndClass;

public class Patient {
	private int id;
	private String name;

	public Patient() {
		
	}

	public Patient(int id, String name) {
		this.id = id;
		this.name = name;
	}

	//factory method
	public static Patient getInstance(int id, String name) {
		System.out.println("Factory method called");
		return new Patient(333, "Shamim");
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

	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + "]";
	}

}
