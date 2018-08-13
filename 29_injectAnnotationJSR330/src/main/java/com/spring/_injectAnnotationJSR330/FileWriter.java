package com.spring._injectAnnotationJSR330;

public class FileWriter implements LogWriter {

	public void write(String text) {
		System.out.println(text);
	}

}
