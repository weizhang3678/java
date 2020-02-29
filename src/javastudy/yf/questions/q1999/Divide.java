package javastudy.yf.questions.q1999;

/**
 *
 * Copyright 2020 YF Studio
 *
 * All right reserved.
 * 
 * Created on Feb 16, 2020 9:02:59 AM
 * 
 * 1999 AP® COMPUTER SCIENCE A FREE-RESPONSE QUESTIONS 3
 * 
 */

public class Divide {

	public static int div2(int number) {
		int carryDown = 0;
		String result = "";
		String str = String.valueOf(number);
		for (int i = 0; i < str.length(); i++) {
			int digit = Integer.parseInt(str.substring(i, i + 1));
			int newDigit = digit / 2 + carryDown;
			result += String.valueOf(newDigit);
			carryDown = digit % 2 * 5;
		}
		return Integer.parseInt(result);
	}
	
	
	public static int divPos(int dividend, int advisor) {
		int low = 0;
		int high = dividend;
		int mid = 0;
		while(low != high) {
			mid = low + high + 1;
			mid = div2(mid);
			if((mid * advisor) > dividend) {
				high = mid -1;
			}else {
				low = mid;
			}
			System.out.println("mid = "+mid);
			System.out.println("high = "+high);
			System.out.println("low = "+low);
			System.out.println("************");
			
		}
		return low;
	}

	public static void main(String[] args) {
		System.out.println(div2(223));
		System.out.println(divPos(623,40));
	}

}
