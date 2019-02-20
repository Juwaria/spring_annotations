package com.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


//Bean id so that the class is identified when scanned and registered
@Component
@Scope("singleton")
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("fileFortuneService")
	private FortuneService fortuneService;
	
	public TennisCoach() {
		System.out.println(">> Tennis Coach: Inside default constructor");
	}
	
	//No need to annote if only one costructor is declared
	//Must annotate if more then one is declared so that the container
	//knows which one to use
	//Contructor injection using annotation
	//@Autowired
	/*public TennisCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}*/

	@Override
	public String getDailyWorkout() {
		return "Practice back hand volley";
	}
	
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	
	//defining init method
	@PostConstruct
	public void doMyStartUpStuff() {
		System.out.println(">> TennisCoach: inside of doMyStartUpStuff()");
	}
	
	//defining destroy method
	@PreDestroy
	public void doMyCleanUpStuff() {
		System.out.println(">> TennisCoach: inside of doMyCleanUpStuff()");
	}
	//setter injection using annotation
	/*
	 * @Autowired public void setFortuneService(FortuneService fortuneService) {
	 * System.out.println(">> Tennis Coach: Inside setFortuneService Method");
	 * this.fortuneService = fortuneService; }
	 */
	
	//method injection
	/*
	 * @Autowired public void doSomeCrazyStuff(FortuneService fortuneService) {
	 * System.out.println(">> Tennis Coach: Inside doSomeCrazyStuff");
	 * this.fortuneService = fortuneService; }
	 */

}
