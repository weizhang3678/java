package javastudy.yf.ch07;

/**
 *
 * Copyright 2020 YF Studio
 *
 * All right reserved.
 * 
 * Created on Jan 29, 2020 9:08:02 AM
 * 
 */

public class TraverseArrayDemo {

	public static void main(String[] args) {
		// Initializer Lists to create array
		int[] scores = { 98, 58, 97, 78, 90, 91, 94, 69, 100 };
		String[] types = { "VIP Diamond", "VIP Golden", "VIP Silver", "Normal" };

		int[] scores1 = new int[] { 98, 58, 97, 78, 90, 91, 94, 69, 100 };

		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}
		for (int i = types.length - 1; i >= 0; i--) {
			System.out.println(types[i]);
		}
		for (int i = 0; i < types.length; i++) {
			System.out.println(types[i]);
		}

	}

}
