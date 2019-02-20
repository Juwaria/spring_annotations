package com.springdemo;

public class BasketBallCoach implements Coach {
	
	FortuneService fortuneService;
	
	public BasketBallCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice for 1 hour.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
