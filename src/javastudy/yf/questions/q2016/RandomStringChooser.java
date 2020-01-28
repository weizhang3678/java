package javastudy.yf.questions.q2016;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * Copyright 2020 YF Studio
 *
 * All right reserved.
 * 
 * Created on Jan 28, 2020 8:12:40 AM
 * 
 * 2016 AP® COMPUTER SCIENCE A FREE-RESPONSE QUESTIONS 1
 * 
 */

public class RandomStringChooser {
	// this is not necessary
	private String[] wordArray;
	
	private List<String> wordList = new ArrayList<String>();
	
	public RandomStringChooser(String[] wordArray){
		// this is not satisfy the requirement.
		this.wordArray = wordArray;
		// using copy can satisfy the requirement.
		this.wordArray = Arrays.copyOf(wordArray, wordArray.length);
		// copy manually
		for(String str: wordArray) {
			wordList.add(str);
		}	
	}
	
	public String getNext(){
		if(wordList.size() == 0) {
			return "NONE";
		}
		int index = (int)(Math.random()*wordList.size());
		String obj = wordList.remove(index);
		return obj;
	}
	
	public static void main(String[] args) {
		String[] wordArray = {"wheels", "on", "the", "bus"};
	    RandomStringChooser sChooser = new RandomStringChooser(wordArray);
		for (int k = 0; k < 6; k++)
	     {
	        System.out.print(sChooser.getNext() + " ");
	     }
		
	}
	
}
