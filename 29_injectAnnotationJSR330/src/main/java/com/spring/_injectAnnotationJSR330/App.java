package com.spring._injectAnnotationJSR330;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/spring/_injectAnnotationJSR330/beans/beans.xml");
		Logger logger = (Logger) context.getBean("logger");
		logger.writeConsole("Hello ConsoleWriter");
		logger.writeFile("Hello FileWriter");
		((ClassPathXmlApplicationContext) context).close();
	}
}
