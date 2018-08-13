package com.spring._autowiringByType;

public class ConsoleWriter implements LogWriter {

	public void write(String text) {
		System.out.println("Frome consoleWriter: "+text);
	}
}
