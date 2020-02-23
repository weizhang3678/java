package javastudy.yf.lab.stars;

/**
*
* Copyright 2020 YF Studio
*
* All right reserved.
* 
* Created on Feb 23, 2020 9:10:01 AM
* 
*/
public class RightDown {

	public static void main(String[] args) {
		for(int i = 1; i< 6;i ++) {
			for(int j = i; j<5;j++) {
				System.out.print(" ");
			}
			for(int j = 1; j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
