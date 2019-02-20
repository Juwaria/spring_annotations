package com.springdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class FileFortuneService implements FortuneService {
	
	ArrayList<String> fortunes = new ArrayList<String>();
	String fileName = "W:\\Spring_Hibernate_Course\\workspace\\spring_demo_annotations\\src\\fortunes.txt";

	@Override
	public String getFortune() {
		Random rand = new Random();
		
		//Can write another method and call it here aswell instead of creating constructor
		//readFromFile();
		
		return fortunes.get(rand.nextInt(fortunes.size()));
	}
	
	//reading fortunes from a file
	public FileFortuneService() {
		System.out.println(">> FileFortuneService: Inside constructor");
	
		
		
	}
	
	@PostConstruct
	public void loadFileData() {
	File file = new File(fileName);
		System.out.println(">>TennisCoach: Inside init method ");
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String temp = br.readLine();
			while(temp!=null) {
				fortunes.add(temp);
				temp=br.readLine();
			}
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
