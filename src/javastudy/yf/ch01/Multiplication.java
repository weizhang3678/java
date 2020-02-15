package javastudy.yf.ch01;

import java.util.Scanner;

/**
*
* Copyright 2020 YF Studio
*
* All right reserved.
* 
* Created on Feb 15, 2020 5:15:35 PM
* 
* a demo to illustrate overload
* 
*/
public class Multiplication {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input a number:");
		int firstNumber = scanner.nextInt();
		System.out.println("Please input a number again:");
		int secondNumber = scanner.nextInt();
		int product = firstNumber * secondNumber;
		String str = "The product of " + firstNumber + " and " + secondNumber + " is " + product +".";
		System.out.println(str);
		scanner.close();
	}
}
