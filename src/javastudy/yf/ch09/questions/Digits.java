package javastudy.yf.ch09.questions;

import java.util.ArrayList;

/**
 *
 * Copyright 2020 YF Studio
 *
 * All right reserved.
 * 
 * Created on Jan 23, 2020 8:58:03 AM
 * 
 * 2017 AP® COMPUTER SCIENCE A FREE-RESPONSE QUESTION 1
 * 
 */

public class Digits {
	/**
	 * The list of digits from the number used to construct this object. The digits
	 * appear in the list in the same order in which they appear in the original
	 * number.
	 */
	private ArrayList<Integer> digitList;

	/**
	 * Constructs a Digits object that represents num. * Precondition: num >= 0
	 */
	public Digits(int num) {
		/* to be implemented in part (a) */ 
		String numStr = String.valueOf(num);
		for(int i = 0; i < numStr.length(); i++) {
			char ch = numStr.charAt(i);
			digitList.add((int)ch);
		}
		
		/** use Integer */
		if(num == 0) {
			digitList.add(0);
		}
		
		while(num > 0) {
			digitList.add(0, num % 10);
			num /= 10;
		}
	}

	/**
	 * Returns true if the digits in this Digits object are in strictly increasing
	 * order; * false otherwise.
	 */
	public boolean isStrictlyIncreasing() {
		/* to be implemented in part (b) */ 
		for(int i=0;i<digitList.size() - 1; i++) {
			if(digitList.get(i).intValue() > digitList.get( i + 1 ).intValue()){
				return false;
			}
		}
		
		return true;
	}
}
