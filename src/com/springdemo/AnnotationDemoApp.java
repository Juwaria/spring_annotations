package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;
//jk
public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		//reading spring config file
		ClassPathXmlApplicationContext context =  new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Getting the bean from the container
		Coach myCoach =  context.getBean("tennisCoach",Coach.class);
		
		//Volley Ball coach bean
		//Coach VBCoach =  context.getBean("volleyBallCoach",Coach.class);
		
		//calling a method on the tennis coach bean
		//System.out.println("Volley Ball: The workout for today is: "+VBCoach.getDailyWorkout());
		
		//calling a method on the tennis coach bean
		System.out.println("Tennis: The workout for today is: "+myCoach.getDailyWorkout());
	
		//call method for daily fortune
		System.out.println(myCoach.getDailyFortune());
		context.close();
	}

}
