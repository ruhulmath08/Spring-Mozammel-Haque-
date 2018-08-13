package com.spring.beanScope;

public class Address {
	private String street;
	private String zepcode;

	public Address() {

	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getZepcode() {
		return zepcode;
	}

	public void setZepcode(String zepcode) {
		this.zepcode = zepcode;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", zepcode=" + zepcode + "]";
	}
}
