package com.spring._autowiringByConstructor;

public class ConsoleWriter implements LogWriter {

	public void write(String text) {
		System.out.println("This is from ConsoleWriter: "+text);
		
	}

}
