package com.spring.batchUpdate;

import java.util.ArrayList;
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
				"com/spring/batchUpdate/beans/beans.xml");
		NoticeDAO noticeDAO = (NoticeDAO) context.getBean("noticeDAO");
		try {
			//Update an existing notice in database.
			Notice noticef1 = new Notice(4, "Fahamida1", "fagamida1@gmail.com", "Hello I Love Baby111");
			Notice noticef2 = new Notice(2, "Fahamida2", "fagamida2@gmail.com", "Hello I Love Baby222");
			Notice noticef3 = new Notice(6, "Fahamida3", "fagamida3@gmail.com", "Hello I Love Baby333");
			
			List<Notice> noticeList = new ArrayList<Notice>();
			noticeList.add(noticef1);
			noticeList.add(noticef2);
			noticeList.add(noticef3);
			
			noticeDAO.createListNotice(noticeList);
			
			//Display all notices
			List<Notice> notices = noticeDAO.getNotices();
			for(Notice notice : notices) {
				System.out.println(notice);
			}
			
		} catch (DataAccessException ex) {
			System.out.println(ex.getMessage());
		}
		
		((ClassPathXmlApplicationContext)context).close();
	}
}
