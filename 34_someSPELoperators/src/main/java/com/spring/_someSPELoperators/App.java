package com.spring._someSPELoperators;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/spring/_someSPELoperators/beans/beans.xml");
		Parrot parrot = (Parrot)context.getBean("parrot");
		parrot.speak();
		((ClassPathXmlApplicationContext)context).close();
	}
}
