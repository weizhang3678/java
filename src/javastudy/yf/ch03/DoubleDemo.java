package javastudy.yf.ch03;

/**
 *
 * Copyright 2020 YF Studio
 *
 * All right reserved.
 * 
 * Created on Jan 21, 2020 6:02:27 PM
 * 
 */

public class DoubleDemo {

	public static void main(String[] args) {
		
		double largest = Double.MAX_VALUE;
		double smallest = Double.MIN_VALUE;
		System.out.println("Double.MAX_VALUE = "+largest);
		System.out.println("Double.MIN_VALUE = "+smallest);
		
		Double d1 = 3.0;
		Double d2 = new Double("3.0qq");
		Double d3 = new Double(3);
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		
		Double d4 = Double.valueOf(3.0);
		
		Double d5 = Double.valueOf("3.0");
		Double d6 = Double.parseDouble("3.0");

		
		
		

	}

}
