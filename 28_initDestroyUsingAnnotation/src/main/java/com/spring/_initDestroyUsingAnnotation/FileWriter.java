package com.spring._initDestroyUsingAnnotation;

public class FileWriter implements LogWriter {

	public void write(String text) {
		System.out.println(text);
	}

}
