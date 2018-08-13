package com.spring._automaticBeanDiscovery;

import org.springframework.stereotype.Component;

@Component("fileWriter1")
public class FileWriter implements LogWriter {

	public void write(String text) {
		System.out.println(text);
	}

}
