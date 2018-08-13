package com.spring.pNamespace;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/pNamespace/beans/beans.xml");
		Patiemt patiemt = (Patiemt) context.getBean("patient");
		System.out.println(patiemt);
		((ClassPathXmlApplicationContext) context).close();
	}
}
