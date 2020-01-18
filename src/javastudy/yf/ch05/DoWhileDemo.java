package javastudy.yf.ch05;

/**
 *
 * Copyright 2020 YF Studio
 *
 * All right reserved.
 * 
 * Created on Jan 18, 2020 5:54:16 PM
 * 
 */

public class DoWhileDemo {
	public static void main(String[] args) {
		int count = 1;
		do {
			System.out.println("Count is: " + count);
			count++;
		} while (count < 11);
	}
}