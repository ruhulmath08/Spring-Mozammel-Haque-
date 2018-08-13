package com.spring._autowiringByName;

public class ConsoleWriter implements LogWriter {

	public void write(String text) {
		System.out.println("From ConsoleWriter: " + text);

	}

}
