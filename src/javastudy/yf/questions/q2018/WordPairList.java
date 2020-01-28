package javastudy.yf.questions.q2018;

import java.util.ArrayList;

/**
 *
 * Copyright 2020 YF Studio
 *
 * All right reserved.
 * 
 * Created on Jan 22, 2020 7:28:43 PM
 * 
 * 2018 AP® COMPUTER SCIENCE A FREE-RESPONSE QUESTION 2
 * 
 */

public class WordPairList {
	
	/** The list of word pairs, initialized by the constructor. */
	private ArrayList<WordPair> allPairs;

	/**
	 * Constructs a WordPairList object as described in part (a). * Precondition:
	 * words.length >= 2
	 */
	public WordPairList(String[] words) {
		allPairs = new ArrayList<WordPair>();
		/* to be implemented in part (a) */ 
	     for(int i = 0; i < words.length ; i ++) {
	    	 String firstWord = words[i];
	    	 for(int j = i+1; j < words.length ;j ++) {
	    		 String secondWord = words[j];
	    		 WordPair wp = new WordPair(firstWord, secondWord);
	    		 this.allPairs.add(wp);
	    	 }
	     }	
	
	}

	/** Returns the number of matches as described in part (b). */
	public int numMatches() {
		int count = 0;
		/* to be implemented in part (b) */ 
	   for(WordPair wp : allPairs) {
		   if(wp.getFirst().contentEquals(wp.getSecond())) {
			   count ++;
		   }
	   }
	   
	   return count;
	}
}
