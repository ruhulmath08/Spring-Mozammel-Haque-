package com.spring._introducingSPEL;

import java.util.Random;

public class RandomSpeech {
	private static String[] texts = {
			"I will be back", 
			"Get ourt", 
			"Hellow Parrot", 
			"Java Spring" 
			};
	
	public String getText() {
		Random random = new Random();
		return texts[random.nextInt(texts.length)];
	}
}
