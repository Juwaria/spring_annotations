package com.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BasketballConfigDemoApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new
				AnnotationConfigApplicationContext(BasketballConfig.class);

		Coach coach = context.getBean("basketballCoach",Coach.class);

		System.out.println("Basketball coach fortune: "+coach.getDailyFortune());

		context.close();
	}

}
