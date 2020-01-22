package javastudy.yf.ch03;

/**
 *
 * Copyright 2020 YF Studio
 *
 * All right reserved.
 * 
 * Created on Jan 21, 2020 5:59:23 PM
 * 
 */

public class IntegerDemo {

	public static void main(String[] args) {
		int largest = Integer.MAX_VALUE;
		int smallest = Integer.MIN_VALUE;

		System.out.println("Integer.MAX_VALUE = "+largest);
		System.out.println("Integer.MIN_VALUE = "+smallest);
		
		// create Integer object
		Integer i1 = 1;
		Integer i2 = new Integer(1);
		Integer i3 = new Integer("1");
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		
		
        // convert int to Integer
		Integer i4 = Integer.valueOf(1);
		System.out.println(i4);
		int i = i4.intValue();
		System.out.println(i);
		
		// convert String to Integer
		Integer i5 = Integer.valueOf("1");
		Integer i6 = Integer.parseInt("1");
		System.out.println(i5);
		System.out.println(i6);

		
		// convert Integer to String
		System.out.println(i5.toString());
		System.out.println(String.valueOf(i6));
		
		// compare Integer
		Integer i7 = new Integer(16);
		Integer i8 = new Integer(16);
		System.out.println(i7.equals(i8));
		System.out.println(i7==i8);
		System.out.println(i7.intValue()==i8.intValue());	
		System.out.println(i7.compareTo(i8));
		System.out.println(Integer.compare(i7, i8));
		
		
		// AutoBoxing and Unboxing
		int result = sum(3,4);
		System.out.println(result);
		
		// NumberFormatException
		Integer i17 = Integer.parseInt(""+3.0);
		Integer i18 = new Integer("1.0");

	}
	
	private static Integer sum(Integer firstNumber, Integer secondNumber) {
		int result = firstNumber + secondNumber;
		return result;		
	}

}
