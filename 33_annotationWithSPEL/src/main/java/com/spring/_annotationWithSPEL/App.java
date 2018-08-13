package com.spring._annotationWithSPEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/spring/_annotationWithSPEL/beans/beans.xml");
		Parrot parrot = (Parrot)context.getBean("parrot");
		parrot.speek();
		((ClassPathXmlApplicationContext)context).close();
	}
}
