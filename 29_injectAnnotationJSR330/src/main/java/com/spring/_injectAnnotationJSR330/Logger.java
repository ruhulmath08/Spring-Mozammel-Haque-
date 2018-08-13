package com.spring._injectAnnotationJSR330;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;

//import javax.annotation.Resource;

public class Logger {

	private ConsoleWriter consoleWriter;
	private LogWriter fileWriter;

	@Inject
	@Named(value ="demoWriter1")
	public void setConsoleWriter(ConsoleWriter consoleWriter) {
		this.consoleWriter = consoleWriter;
	}

	@Inject
	public void setFileWriter(LogWriter fileWriter) {
		this.fileWriter = fileWriter;
	}

	public void writeConsole(String text) {
		consoleWriter.write(text);
	}

	public void writeFile(String text) {
		fileWriter.write(text);
	}

	// init method
	@PostConstruct
	public void init() {
		System.out.println("This is init() method");
	}

	// init method
	@PreDestroy
	public void destroy() {
		System.out.println("This is destroy() method");
	}
}
