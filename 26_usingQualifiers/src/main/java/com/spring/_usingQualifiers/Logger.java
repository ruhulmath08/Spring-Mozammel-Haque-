package com.spring._usingQualifiers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Logger {
	private ConsoleWriter consoleWriter;
	private LogWriter fileWriter;

	public Logger() {

	}

	public ConsoleWriter getConsoleWriter() {
		return consoleWriter;
	}

	@Autowired
	@Qualifier("consoleWriter")
	public void setConsoleWriter(ConsoleWriter consoleWriter) {
		this.consoleWriter = consoleWriter;
	}

	public LogWriter getFileWriter() {
		return fileWriter;
	}

	@Autowired
	@Qualifier("demoWriter")
	public void setFileWriter(LogWriter fileWriter) {
		this.fileWriter = fileWriter;
	}

	public void writeConsole(String text) {
		consoleWriter.write(text);
	}

	public void writeFile(String text) {
		fileWriter.write(text);
	}
}
