package javastudy.yf.ch03;

import java.util.Arrays;

/**
 *
 * Copyright 2020 YF Studio
 *
 * All right reserved.
 * 
 * Created on Jan 26, 2020 6:25:05 AM
 * 
 */

public class SwapDemo {
	
	public static void swap(int a, int b) {
		System.out.println("a="+a +";b="+b);
		int temp = a;
		a = b;
		b = temp; 
		System.out.println("a="+a +";b="+b);
	}
	
	/* precondition is arr.length = 2 */
	public static void swap(int[] arr) {

		System.out.println("before: " + Arrays.toString(arr));
		int temp = arr[0];
		arr[0] = arr[1];
		arr[1] = temp; 
		System.out.println("after: " + Arrays.toString(arr));
		
	}
	

	public static void main(String[] args) {
		int[] arr = {1,2};
		
		System.out.println("before: " + Arrays.toString(arr));
		swap(arr);
		
		System.out.println("after: " + Arrays.toString(arr));
		
		int number1 = 1, number2=2;
		swap(number1,number2);

		System.out.println("number1="+ number1 +";number2="+number2);
		
	}

}
