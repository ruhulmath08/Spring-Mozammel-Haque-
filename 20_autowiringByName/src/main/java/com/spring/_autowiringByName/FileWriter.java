package com.spring._autowiringByName;
public class FileWriter implements LogWriter {

	public void write(String text) {
		System.out.println("From FileWriter: "+text);
	}

}
