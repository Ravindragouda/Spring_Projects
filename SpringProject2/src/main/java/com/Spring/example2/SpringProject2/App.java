package com.Spring.example2.SpringProject2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	 ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
         Laptop s1=(Laptop)ctx.getBean("l1");
         Laptop s2=(Laptop)ctx.getBean("l2");
         Laptop s3=(Laptop)ctx.getBean("l3");
         System.out.println(s1);
         System.out.println(s2);
         System.out.println(s3);
    }
}
