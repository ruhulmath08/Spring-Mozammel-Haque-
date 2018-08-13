package com.spring._annotationWithSPEL;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomSpeech {
	private static String[] texts = {
			"I will be back", 
			"Get ourt", 
			"Hellow Parrot", 
			"Java Spring",
			null
			};
	
	public String getText() {
		Random random = new Random();
		return texts[random.nextInt(texts.length)];
	}
}
