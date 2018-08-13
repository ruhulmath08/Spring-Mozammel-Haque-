package com.spring._resourceAnnotationJSR250;

public class FileWriter implements LogWriter {

	public void write(String text) {
		System.out.println(text);
	}

}
