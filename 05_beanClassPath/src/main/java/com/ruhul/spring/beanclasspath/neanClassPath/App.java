package com.ruhul.spring.beanclasspath.neanClassPath;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/ruhul/spring/beanclasspath/neanClassPath/beans/beans.xml");
		Patient patient = (Patient) context.getBean("patient");
		patient.speak();
		((ClassPathXmlApplicationContext) context).close();
	}
}
