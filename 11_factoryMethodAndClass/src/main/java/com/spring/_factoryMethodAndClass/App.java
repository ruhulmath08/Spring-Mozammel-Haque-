package com.spring._factoryMethodAndClass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/spring/_factoryMethodAndClass/beans/beans.xml");
		Patient patient = (Patient) context.getBean("patient");
		System.out.println(patient);
		((ClassPathXmlApplicationContext) context).close();
	}
}
