package com.spring._introducingSPEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/spring/_introducingSPEL/beans/beans.xml");
		Parrot parrot = (Parrot)context.getBean("parrot");
		parrot.speek();
		((ClassPathXmlApplicationContext)context).close();
	}
}
