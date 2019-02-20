package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		
		//loading spring config file
		ClassPathXmlApplicationContext context = new 
				ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retriening the bean
		Coach coach1 =  context.getBean("tennisCoach",Coach.class);
		
		Coach coach2 = context.getBean("tennisCoach",Coach.class);
		
		boolean result = (coach1==coach2);
		
		System.out.println("the two objects are same:" +result);
		
		System.out.println("Memory location of Coach 1: "+coach1);
		
		System.out.println("Memory location of Coach 2: "+coach2);
		
		context.close();
		

	}

}
