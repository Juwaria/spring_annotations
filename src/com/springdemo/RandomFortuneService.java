package com.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	private String[] fortunes = {"Today is your lucky day",
			"You got this!","Today is going to be fun"};
	

	@Override
	public String getFortune() {
		Random rand = new Random();
		return fortunes[rand.nextInt(fortunes.length)];
	}

}
