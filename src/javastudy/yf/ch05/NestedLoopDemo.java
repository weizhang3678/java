package javastudy.yf.ch05;

/**
 *
 * Copyright 2020 YF Studio
 *
 * All right reserved.
 * 
 * Created on Jan 27, 2020 1:47:20 PM
 * 
 */

public class NestedLoopDemo {
	
	// print n1 row star sign, there are n2 star signs in which row
	public static void printStar(int n1, int n2) {
		for(int i = 0; i< n1; i++) {
			for(int j=0;j < n2;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printStar(10,5);
	}

}
