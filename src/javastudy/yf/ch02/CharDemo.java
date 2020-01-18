package javastudy.yf.ch02;

/**
 *
 * Copyright 2020 YF Studio
 *
 * All right reserved.
 * 
 * Created on Jan 16, 2020 8:23:12 AM
 * 
 */

public class CharDemo {
	
	public static void main(String[] args) {
		
		// special characters
		char single = '\'';
		char backslash = '\\';
		char lineFeed = '\n';
		char carriageReturn = '\r';
		char tab = '\t';
		
		char c1 = 'A'; // Unicode is 65
		char c2 = '中'; // Unicodde is 20013
		
		// hex:
		char c3 = '\u0041'; // 'A'，0x0041 = 65
		char c4 = '\u4e2d'; // '中'，0x4e2d = 20013
		
		System.out.println(c1 == c3);
		System.out.println(c2 == c4);
		
		char c5 = 65;
		char c6 = 20013;
		
		int i1 = c1;
		int i2 = c2;
		
		System.out.println(i1 == c5);
		System.out.println(i2 == c6);
		
		char c7 = '9';
		int i3 = c7;
		System.out.println(i3 == 9);
		
		//print the Unicode of a char
		char ch = 'A';
		System.out.println(Integer.toHexString(ch));
	}

}
