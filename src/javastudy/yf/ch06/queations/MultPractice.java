package javastudy.yf.ch06.queations;

/**
 *
 * Copyright 2020 YF Studio
 *
 * All right reserved.
 * 
 * Created on Jan 23, 2020 10:53:15 AM
 * 
 * 2017 AP® COMPUTER SCIENCE A FREE-RESPONSE QUESTION 2
 * 
 */

public class MultPractice implements StudyPractice {
	
	private  int firstInteger ;
	private  int secondInteger;
	
	public MultPractice(int first, int second) {
		firstInteger = first;
		secondInteger = second;
	}
	
	/** Returns the current practice problem. */
	public String getProblem() {
		System.out.println( firstInteger + " TIMES " + secondInteger );
		return firstInteger + " TIMES " + secondInteger ;
	};

	/** Changes to the next practice problem. */
	public void nextProblem() {
		secondInteger ++ ;
	};
	

}
