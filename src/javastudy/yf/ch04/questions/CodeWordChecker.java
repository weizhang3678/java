package javastudy.yf.ch04.questions;

/**
 *
 * Copyright 2020 YF Studio
 *
 * All right reserved.
 * 
 * Created on Jan 23, 2020 9:31:47 AM
 * 
 * 2018 AP FREE-RESPONSE QUESTION 3
 * 
 */

public class CodeWordChecker implements StringChecker {
	
	private int min = 6;
	private int max = 20;
	private String illegal;
	
	public CodeWordChecker(String illegal) {
		// this(6, 20, illegal);
		this.illegal = illegal;
	}
	
	public CodeWordChecker(int min, int max, String illegal) {
		// this(illegal);
		this.illegal = illegal;
		this.min = min;
		this.max = max;
	}
	
	/** is valid */
	private boolean isValid1(String str) {
		return str.length() < max && str.length() > min && !str.contains(illegal);
	}
	
	/** isValid  */
	private boolean isValid2(String str) {
		if(str.length() > max || str.length() < min || str.contains(illegal)) {
			return false;
		}
		return true;
	}
	
	/** isValid  */
	public boolean isValid (String str) {
		if(str.length() < min) {
			return false;
		} else if(str.length() > max) {
			return false;
		} else if(str.contains(illegal)) {
			return false;
		}
		return true;
	}	
	
}
