package com.springdemo;

import org.springframework.stereotype.Component;

@Component
public class VolleyBallCoach implements Coach {
	
	//default constructor
	public VolleyBallCoach() {
		System.out.println("Inside Volley Ball Coach deafult constructor");
	}

	@Override
	public String getDailyWorkout() {
		return "Practice for 1 hr.";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
