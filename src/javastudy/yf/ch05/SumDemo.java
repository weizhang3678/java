package javastudy.yf.ch05;

/**
 *
 * Copyright 2020 YF Studio
 *
 * All right reserved.
 * 
 * Created on Jan 27, 2020 1:23:42 PM
 * 
 */

public class SumDemo {
	
	
	public static int doWhile(int n) {
		int sum = 0;
		int i = 0;
		do {
			sum += i;
			i++;
		}while(i<=n);
		return sum;	
		
	}

	public static int whileDemo(int n) {
		int sum = 0;
		int i = 1;
		while (i <= n) {
			sum += i;
			i++;
		}
		return sum;
	}

	public static int forDemo(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
            sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println("Result is: " + (whileDemo(100)==5050?"Pass":"Fail"));
		System.out.println("Result is: " + (forDemo(100)==5050?"Pass":"Fail"));
		System.out.println("Result is: " + (doWhile(100)==5050?"Pass":"Fail"));

	}

}
