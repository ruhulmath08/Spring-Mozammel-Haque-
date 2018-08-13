package com.spring._autowiredAnnotation;

public class ConsoleWriter implements LogWriter {

	public void write(String text) {
		System.out.println("Write from ConsoleWrite : "+text);

	}

}
