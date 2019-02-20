package com.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//Configuring using Java Source code

//scanning the given package

//no need to scan as it is being taken care of manually
//@ComponentScan("com.springdemo")
//referencing the properties file
@Configuration
@PropertySource("classpath:sport.properties")
public class SportConfig {
	
	//defining bean for sad fortune service
	//method name is the actual bean id
	//used when assigning to the container
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	
	//defining bean for swim coach
	//and injecting dependency
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}
	
	

}
