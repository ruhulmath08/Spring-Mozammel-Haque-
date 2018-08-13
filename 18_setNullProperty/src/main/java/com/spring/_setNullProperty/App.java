package com.spring._setNullProperty;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/spring/_setNullProperty/beans/beans.xml");
		ContactBook contacts = (ContactBook) context.getBean("contactbook");
		System.out.println(contacts);
		((ClassPathXmlApplicationContext) context).close();
	}
}
