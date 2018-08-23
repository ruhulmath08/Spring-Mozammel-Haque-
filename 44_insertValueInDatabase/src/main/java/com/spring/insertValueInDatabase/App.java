package com.spring.insertValueInDatabase;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/spring/insertValueInDatabase/beans/beans.xml");
		NoticeDAO noticeDAO = (NoticeDAO) context.getBean("noticeDAO");

		//Insert Notice in Database
		
		
		System.out.println("--------------------------------------------");
		//Display all notices
		try {
			Notice noticeCreate = new Notice("MoMo", "momo@gmail.com", "I Love Boys!!!");
			if(noticeDAO.create(noticeCreate)) {
				System.out.println("Update success");
			}
			else {
				System.out.println("Update fail!!!");
			}
			
			List<Notice> notices = noticeDAO.getNotices();
			for (Notice notice : notices) {
				System.out.println(notice);
			}
		} catch (DataAccessException ex) {
			System.out.println(ex.getMessage());
		}
		
		System.out.println("--------------------------------------------");
		
		//Display a single notice
		Notice notice1 = noticeDAO.getNotice(2);
		System.out.println("Print Notice 2: "+notice1);

		((ClassPathXmlApplicationContext) context).close();
	}
}
