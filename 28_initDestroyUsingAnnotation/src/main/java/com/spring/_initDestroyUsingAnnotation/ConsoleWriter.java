package com.spring._initDestroyUsingAnnotation;

public class ConsoleWriter implements LogWriter {

	public void write(String text) {
		System.out.println(text);
	}

}
