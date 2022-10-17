package com.luv2code.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

	private String[] fortunes = {"Today is your lucky day!", 
			"To be idle is to be foolish.", 
			"Get ready for a life-changing event!"};
	
	@Override
	public String getFortune() {
		int index = new Random().nextInt(fortunes.length);
		return fortunes[index];
	};
	

}
