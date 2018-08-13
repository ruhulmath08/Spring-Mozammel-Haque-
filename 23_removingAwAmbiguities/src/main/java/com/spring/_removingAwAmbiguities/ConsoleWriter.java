package com.spring._removingAwAmbiguities;

public class ConsoleWriter implements LogWriter {

	public void write(String text) {
		System.out.println("Write from ConsoleWrite : "+text);

	}

}
