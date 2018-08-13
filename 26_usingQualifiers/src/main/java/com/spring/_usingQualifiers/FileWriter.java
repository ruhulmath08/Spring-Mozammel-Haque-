package com.spring._usingQualifiers;

import org.springframework.beans.factory.annotation.Qualifier;

@Qualifier("demoWriter")
public class FileWriter implements LogWriter {

	public void write(String text) {
		System.out.println(text);
	}
}
