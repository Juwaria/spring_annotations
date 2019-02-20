package com.springdemo;

import org.springframework.stereotype.Component;

//register the co]lass with spring
@Component
public class HapyyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is your lucky day!";
	}

}
