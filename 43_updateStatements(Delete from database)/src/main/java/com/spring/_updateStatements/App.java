package com.spring._updateStatements;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/_updateStatements/beans/beans.xml");
		NoticeDAO noticeDAO = (NoticeDAO) context.getBean("noticeDAO");
		
		List<Notice> notices = noticeDAO.getNotices();
		for (Notice notice : notices) {
			System.out.println(notice);
		}
		
		System.out.println("-----------------------------");
		
		Notice notice = noticeDAO.getNotice(3);
		System.out.println("Notice for id 3 : "+notice);
		
		System.out.println("-----------------------------");
		
		//noticeDAO.delete(6);
		
		
		((ClassPathXmlApplicationContext) context).close();
	}
}
