package javastudy.yf.ch07;

/**
 *
 * Copyright 2020 YF Studio
 *
 * All right reserved.
 * 
 * Created on Jan 29, 2020 9:58:25 AM
 * 
 */

public class Rotate {

	public static void main(String[] args) {
		int[] values = { 60, 2, 1, 7, 12, 5, 29 };
		// left shift
		int first = values[0];
		for (int i = 0; i < values.length; i++) {
			// if it's not the last element, copy the next one over
			if (i < values.length - 1)
				values[i] = values[i + 1];
			else {
				// last element gets first
				values[i] = first;
			}
		}
		// print them out to see the results
		for (int val : values) {
			System.out.print(val + " ");
		}
		System.out.println();
		System.out.println("-------------------");
		// right shift
		int last = values[values.length - 1];
		for (int i = values.length - 1; i > 0; i--) {
			// if it's not the last element, copy the next one over
			values[i] = values[i - 1];
		}
		values[0] = last;
		// print them out to see the results
		for (int val : values) {
			System.out.print(val + " ");
		}
	}

}
