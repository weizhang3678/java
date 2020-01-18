package javastudy.yf.ch02;

/**
 *
 * Copyright 2020 YF Studio
 *
 * All right reserved.
 * 
 * Created on Jan 14, 2020 7:07:30 PM
 * 
 */

public class FloatingPointDemo {
	public static void main(String[] args) {

		// define a float or double
		// default is double instead of float
		// float f = 1.0;
		float f = 1.0f;
		// f = f + 1.0;
		double d = 100;
		// scientific notation of decimal  
		double d1 = 1.2e1;
		// scientific notation of hex
		double d2 = 0x1.0p-1;
		System.out.println(d1);
		System.out.println(d2);

		// accuracy lost
		System.out.println(2.0 - 1.1);

		System.out.println(2.0f - 1.1f);

		System.out.println(2.0 - 1.2);

		System.out.println(2.0f - 1.2f);

		// automatic type conversion when Integer types with Floating
		int i = 10;
		System.out.println(i / 4.0);

		// automatic type conversion
		long l = i;
		System.out.println("Int value " + i);
		System.out.println("Long value " + l);

		// divided by 0
		// can be compiled, can executed
		System.out.println(0.0 / 0);
		System.out.println(1.0 / 0);
		System.out.println(-1.0 / 0);

	}

}
