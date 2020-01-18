package javastudy.yf.ch02;

/**
 *
 * Copyright 2020 YF Studio
 *
 * All right reserved.
 * 
 * Created on Jan 14, 2020 7:41:32 PM
 * 
 */

public class BitDemo {
	public static void main(String[] args) {
		int bitmask = 0x000F;
		int val = 0x0022;
		// prints "2"
		System.out.println(val & bitmask);
		
		System.out.println(val | bitmask);
		
		System.out.println(val ^ bitmask);
		
		System.out.println(~bitmask);
		// -100/4
		System.out.println("-5>>2="+(-5>>2));
		
		// -100*4
		System.out.println("-10<<2="+(-10<<2));
		
		System.out.println("10>>>2="+(10>>>2));
		
		System.out.println("-5>>>2="+(-5>>>2));
		
	}
}