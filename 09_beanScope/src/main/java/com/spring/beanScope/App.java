package com.spring.beanScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/beanScope/beans/beans.xml");
    	Patient patient1 = (Patient)context.getBean("patient");
    	Patient patient2 = (Patient)context.getBean("patient");
    	
    	patient1.setName("Shamim");
    	
    	System.out.println(patient2);
        ((ClassPathXmlApplicationContext)context).close();;
    }
}
