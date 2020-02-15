package javastudy.yf.ch05;

/**
 *
 * Copyright 2020 YF Studio
 *
 * All right reserved.
 * 
 * Created on Feb 15, 2020 6:53:52 AM
 * 
 */
public class ReverseString {

	public static void main(String[] args) {
		// method1
		String str1 = "Hello";
		String sReversed = "";
		String ithLetter;

		for (int i = 0; i < str1.length(); i++) {
			ithLetter = str1.substring(i, i + 1);
			// add the letter at index i to what's already reversed.
			sReversed = ithLetter + sReversed;
		}
		System.out.println(str1 + " reversed is " + sReversed);

		// method2
		String str2 = "abcde";
		String newStr = "";
		for (int i = str2.length(); i > 0; i--) {
			newStr = newStr + str2.substring(i - 1, i);
		}
		System.out.println(str2 + " reversed is " + newStr);
		
		//method3
		String str3 = "12345";
		sReversed = "";
		int index = 0;
		while(index < str3.length()) {
			sReversed = str3.substring(index, index +1) + sReversed;
			index++;
		}
		System.out.println(str3 + " reversed is " + sReversed);
	}

}
