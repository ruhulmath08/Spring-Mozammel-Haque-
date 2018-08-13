package com.spring._resourceAnnotationJSR250;

import javax.annotation.Resource;

//import javax.annotation.Resource;

public class Logger {
	
	@Resource(name = "conWriter")
	private ConsoleWriter consoleWriter;
	@Resource
	private LogWriter fileWriter;

	
	public void setConsoleWriter(ConsoleWriter consoleWriter) {
		this.consoleWriter = consoleWriter;
	}

	
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
