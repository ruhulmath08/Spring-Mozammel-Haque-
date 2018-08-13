package com.spring._valuesThroughAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Cat {

	private int id = 0;
	private String speech = "Hellow Mithu";

	@Autowired
	public void setId(@Value("12345") int id) {
		
		this.id = id;
	}

	@Autowired
	public void setSpeech(@Value("Meaoooooo!!!") String speech) {
		this.speech = speech;
	}

	public void speek() {
		System.out.println("Id : " + id + "\nSpeech : " + speech);
	}
}
