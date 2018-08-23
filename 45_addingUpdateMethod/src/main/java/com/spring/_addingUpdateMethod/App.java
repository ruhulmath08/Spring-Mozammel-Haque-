package com.spring._addingUpdateMethod;

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
				"com/spring/_addingUpdateMethod/beans/beans.xml");
		NoticeDAO noticeDAO = (NoticeDAO) context.getBean("noticeDAO");
		try {
			//Update an existing notice in database.
			Notice noticeUpdate = new Notice(12, "Lira", "lira@gmail.com", "Hello I Love C#, .NOT");
			noticeDAO.update(noticeUpdate);
			//Display all notices
			List<Notice> notices = noticeDAO.getNotices();
			for(Notice notice : notices) {
				System.out.println(notice);
			}
			
			//Display one notice
			System.out.println("------------------------------------------");
			Notice notice1 = noticeDAO.getNotice(8);
			System.out.println(notice1);
			
			//Delete one notice
			//System.out.println(noticeDAO.delete(10));
			
			//Insert notice in database
			/*System.out.println("------------------------------------------");
			Notice noticeCreate = new Notice("Farhana", "farhana@gmail.com", "Hello I love PHP");
			System.out.println(noticeDAO.create(noticeCreate));*/
			
		} catch (DataAccessException ex) {
			System.out.println(ex.getMessage());
		}
		
		((ClassPathXmlApplicationContext)context).close();
	}
}
