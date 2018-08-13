package com.spring._autowiringByType;

public class FileWriter implements LogWriter {

	public void write(String text) {
		System.out.println("From fileWriter: "+text);
	}
}
