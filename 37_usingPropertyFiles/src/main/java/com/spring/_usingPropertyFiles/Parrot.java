package com.spring._usingPropertyFiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Parrot {
	private String id = "123";
	private String spech = "hi there";

	@Autowired
	public void setId(@Value("${jdbc.user}") String id) {
		this.id = id;
	}

	@Autowired	
	public void setSpech(@Value("${jdbc.password}") String spech) {
		this.spech = spech;
	}

	public void speak() {
		System.out.println(id+ " : " +spech);
	}
}
