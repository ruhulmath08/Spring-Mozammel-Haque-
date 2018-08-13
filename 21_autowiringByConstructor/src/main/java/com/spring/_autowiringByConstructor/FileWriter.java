package com.spring._autowiringByConstructor;

public class FileWriter implements LogWriter {

	public void write(String text) {
		System.out.println("This is from FileWriter: "+text);
	}

}
