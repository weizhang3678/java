package javastudy.yf.ch04;

/**
 *
 * Copyright 2020 YF Studio
 *
 * All right reserved.
 * 
 * Created on Jan 28, 2020 5:20:38 PM
 * 
 */

public class AlgorithmsByStringDemo {
	
	public static void reverse1() {
	     String s = "Hello";
	     String sReversed = "";
	     String ithLetter;

	     for(int i=0; i < s.length(); i++) {
	         ithLetter = s.substring(i,i+1);
	         // add the letter at index i to what's already reversed.
	         sReversed = ithLetter + sReversed;
	     }
	     System.out.println(s + " reversed is " + sReversed);
	}

	public static void reverse() {
		 String str = "Hello";
		String newStr = "";
		for (int i = str.length(); i > 0; i--) {
			newStr = newStr + str.substring(i - 1, i);
		}
		 System.out.println(str + " reversed is " + newStr);
	}

	public static int countChar(String s) {
		String message = "This is a simple example to show how to process a string object.";
		int count = 0;
		for (int i = 0; i < message.length(); i++) {
			if (message.substring(i, i + 1).equals(s)) {
				count++;
			}
		}
		return count;
	}

	// from
	public static void replace1tol() {
		String message = "Have a 1ong and happy 1ife";
		int index = 0;

		// while more 1's in the message
		while (message.indexOf("1") >= 0) {
			// Find the next index for 1
			index = message.indexOf("1");
			System.out.println("Found a 1 at index: " + index);
			// Replace the 1 with a l at index by concatenating substring up to index and
			// then the rest of the string.
			String firstpart = message.substring(0, index);
			String lastpart = message.substring(index + 1);
			message = firstpart + "l" + lastpart;
			System.out.println("Replaced 1 with l at index " + index);
			System.out.println("The message is currently " + message + " but we aren't done looping yet!");
		}
		System.out.println("Cleaned text: " + message);
	}

	public static void main(String[] args) {
		String s = "This is a simple example to show how to process a string object.";
		
		
		System.out.println("before:" + s);
		int i = 0;
		// if there is “a” in s
		while (s.indexOf("a") >= 0) {
			// Find and save the next index for “a”
			i = s.indexOf("a");
			// Process the string at that index
			s = s.substring(0, i) + s.substring(i + 1);
		}
		System.out.println("after:" + s);
		
		reverse();
		reverse1();
	}

}
