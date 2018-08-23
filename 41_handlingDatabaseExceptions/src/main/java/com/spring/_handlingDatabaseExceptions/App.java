package com.spring._handlingDatabaseExceptions;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.CannotGetJdbcConnectionException;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/spring/_handlingDatabaseExceptions/beans/beans.xml");
		NoticesDAO noticesDAO = (NoticesDAO) context.getBean("noticesDAO");

		try {
			List<Notice> notices = noticesDAO.getNotices();
			for (Notice notice : notices) {
				System.out.println(notice);
			}
		} 
		catch (CannotGetJdbcConnectionException ex) {
			System.out.println(ex.getMessage());
			System.out.println(ex.getClass());
		}
		catch (DataAccessException ex) {
			System.out.println(ex.getMessage());
			System.out.println(ex.getClass());
		}

		((ClassPathXmlApplicationContext) context).close();
	}
}
