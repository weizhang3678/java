package javastudy.yf.questions.q2015;
/**
*
* Copyright 2020 YF Studio
*
* All right reserved.
* 
* Created on Feb 6, 2020 10:32:24 AM
* 
* 2015 AP® COMPUTER SCIENCE A FREE-RESPONSE QUESTIONS 4
* 
*/
public class Range implements NumberGroup {

	private int maximum;
	private int minimum;

	public Range(int max, int min) {
		this.maximum = max;
		this.minimum = min;
	}

	public boolean contains(int number) {
		return (number <= maximum && number >=minimum);
	}

}
