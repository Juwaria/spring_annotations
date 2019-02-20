package com.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BasketballConfig {
	
	@Bean
	public FortuneService staticFortuneService() {
		return new StaticFortuneService();
	}
	
	@Bean
	public BasketBallCoach basketballCoach() {
		return new BasketBallCoach(staticFortuneService());
	}

}
