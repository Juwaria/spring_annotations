package com.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		
		//reading spring java class
		AnnotationConfigApplicationContext context =  new 
				AnnotationConfigApplicationContext(SportConfig.class);
		
		//Getting the bean from the container
		SwimCoach myCoach =  context.getBean("swimCoach",SwimCoach.class);
		
		//Volley Ball coach bean
		//Coach VBCoach =  context.getBean("volleyBallCoach",Coach.class);
		
		//calling a method on the tennis coach bean
		//System.out.println("Volley Ball: The workout for today is: "+VBCoach.getDailyWorkout());
		
		System.out.println("Team name: "+myCoach.getTeam());
		System.out.println("Email ID: "+myCoach.getEmail());
		
		//calling a method on the tennis coach bean
		System.out.println("Tennis: The workout for today is: "+myCoach.getDailyWorkout());
	
		//call method for daily fortune
		System.out.println(myCoach.getDailyFortune());
		
		
		context.close();
	}

}
