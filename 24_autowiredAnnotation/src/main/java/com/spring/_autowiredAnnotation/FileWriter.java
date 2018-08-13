package com.spring._autowiredAnnotation;

public class FileWriter implements LogWriter {

	public void write(String text) {
		System.out.println("Write from FileWriter : "+text);

	}

}
