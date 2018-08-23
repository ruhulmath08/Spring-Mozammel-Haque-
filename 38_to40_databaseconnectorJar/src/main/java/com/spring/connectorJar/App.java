package com.spring.connectorJar;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/connectorJar/beans/beans.xml");
		NoticesDAO noticesDAO = (NoticesDAO)context.getBean("noticesDAO");
		List<Notice> notices = noticesDAO.getNotices();
		for (Notice notice : notices) {
			System.out.println(notice);
		}
		((ClassPathXmlApplicationContext) context).close();
	}
}
