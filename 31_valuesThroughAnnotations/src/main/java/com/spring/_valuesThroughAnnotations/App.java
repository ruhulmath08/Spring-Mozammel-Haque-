package com.spring._valuesThroughAnnotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/spring/_valuesThroughAnnotations/beans/beans.xml");
		Cat cat = (Cat)context.getBean("cat");
		cat.speek();
		((ClassPathXmlApplicationContext)context).close();
	}
}
