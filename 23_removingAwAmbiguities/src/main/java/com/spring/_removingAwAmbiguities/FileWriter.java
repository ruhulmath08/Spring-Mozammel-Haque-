package com.spring._removingAwAmbiguities;

public class FileWriter implements LogWriter {

	public void write(String text) {
		System.out.println("Write from FileWriter : "+text);

	}

}
