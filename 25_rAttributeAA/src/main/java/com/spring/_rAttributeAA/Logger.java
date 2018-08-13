package com.spring._rAttributeAA;

import org.springframework.beans.factory.annotation.Autowired;

public class Logger {
	private ConsoleWriter consoleWriter;
	private FileWriter fileWriter;

	public Logger() {
		
	}
	
	@Autowired(required=false)
	public Logger(ConsoleWriter consoleWriter) {
		this.consoleWriter = consoleWriter;
	}

	public ConsoleWriter getConsoleWriter() {
		return consoleWriter;
	}

	public void setConsoleWriter(ConsoleWriter consoleWriter) {
		this.consoleWriter = consoleWriter;
	}

	public FileWriter getFileWriter() {
		return fileWriter;
	}

	@Autowired
	public void setFileWriter(FileWriter fileWriter) {
		this.fileWriter = fileWriter;
	}

	public void writeConsole(String text) {
		if (consoleWriter != null) {
			consoleWriter.write(text);
		}
	}

	public void writeFile(String text) {
		fileWriter.write(text);
	}
}
