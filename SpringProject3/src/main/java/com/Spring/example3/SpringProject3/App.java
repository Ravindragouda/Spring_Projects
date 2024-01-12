package com.Spring.example3.SpringProject3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
    	 Employee e1 = (Employee)ctx.getBean("emp1");
    	 System.out.println(e1);
    }
}
