package com.spring._autowiringByName;

public class Logger {
	private LogWriter fileWriter;
	private LogWriter consoleWriter;

	public LogWriter getFileWriter() {
		return fileWriter;
	}

	public void setFileWriter(LogWriter fileWriter) {
		this.fileWriter = fileWriter;
	}

	public LogWriter getConsoleWriter() {
		return consoleWriter;
	}

	public void setConsoleWriter(LogWriter consoleWriter) {
		this.consoleWriter = consoleWriter;
	}

	public void writeFile(String text) {
		fileWriter.write(text);
	}

	public void writeConsole(String text) {
		fileWriter.write(text);
	}
}
