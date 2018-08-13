package com.spring._printList;

import java.util.Iterator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/_printList/beans/beans.xml");
		Patient patient = (Patient) context.getBean("patient");
		for(String name:patient.getEmergencyContactNames()) {
			System.out.println(name);
		}
		((ClassPathXmlApplicationContext) context).close();
	}
}
