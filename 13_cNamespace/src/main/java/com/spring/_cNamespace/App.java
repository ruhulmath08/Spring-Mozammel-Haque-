package com.spring._cNamespace;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/_cNamespace/beans/beans.xml");
    	Patient patient = (Patient)context.getBean("patient");
        System.out.println(patient);
        ((ClassPathXmlApplicationContext)context).close();
        
        /*String s = "Ruhul";
        char oldval=s.charAt(0);
        char newval=(char)(s.charAt(0)+2);
        
        System.out.println(s.replace(oldval, newval));*/
    }
}
