package javastudy.yf.ch05;

/**
*
* Copyright 2020 YF Studio
*
* All right reserved.
* 
* Created on Feb 15, 2020 5:53:52 AM
* 
*/

public class TraverseString {

	public static void main(String[] args) {
		String message = "This is a simple example to show how to process a string object.";
		int count = 0;
		for (int i = 0; i < message.length(); i++) {
			if (message.substring(i, i + 1).equals("a")) {
				count++;
			}
		}
		System.out.println(count);
		
		int i = 0;
		count = 0;
		while (i < message.length()) {
			if (message.substring(i, i + 1).equals("a")) {
				count++;
			}
			i++;
		}
		System.out.println(count);
	}

}
