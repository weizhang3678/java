package javastudy.yf.ch07;

/**
 *
 * Copyright 2020 YF Studio
 *
 * All right reserved.
 * 
 * Created on Jan 29, 2020 9:47:41 AM
 * 
 */

public class Minmax {

	public static void main(String[] args) {
		int[] values = { 60, 2, 1, 7, 12, 5, 29 };
		int min = values[0]; // initialize min to the first element
		int max = values[0];
		for (int val : values) {
			if (val < min) // found a new min!
				min = val;
			if(val > max)
				max = val;
		}
		System.out.println("Min is " + min);		
		System.out.println("Max is " + max);
	}

}
