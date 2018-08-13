package com.spring.dependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/spring/dependencyInjection/bean/beans.xml");
		Patient patient = (Patient) context.getBean("patient");
		// Address address = (Address)context.getBean("address");
		// System.out.println(address);
		System.out.println(patient);
		((ClassPathXmlApplicationContext) context).close();
	}
}
