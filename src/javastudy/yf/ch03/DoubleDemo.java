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
		
		// create Double object
		Double d1 = 3.0;
		Double d2 = new Double("3.0qq");
		Double d3 = new Double(3);
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		
        // convert double to Double
		Double d4 = Double.valueOf(1.0);
		Double d5 = Double.valueOf(1);
		System.out.println(d4);
		System.out.println(d5);
		double d = d5.doubleValue();
		System.out.println(d);
		
		// convert String to Double
		Double d6 = Double.valueOf(3.0);		
		Double d7 = Double.valueOf("3.0");
		Double d8 = Double.parseDouble("3.0");
				
		// convert Double to String
		System.out.println(d6.toString());
		System.out.println(String.valueOf(d6));
		
		// compare Double
		Double d9 = new Double(16);
		Double d10 = new Double(16);
		System.out.println(d9.equals(d10));
		System.out.println(d9==d10);
		System.out.println(d9.intValue()==d10.intValue());	
		System.out.println(d9.doubleValue()==d10.doubleValue());	
		System.out.println(d9.compareTo(d10));
		System.out.println(Double.compare(d9, d10));
		
		// NumberFormatException
		Double d17 = Double.parseDouble("w"+3.0);
		Double d18 = new Double("w1.0");

		
		
		

	}

}
