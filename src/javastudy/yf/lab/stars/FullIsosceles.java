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
public class FullIsosceles {

	public static void main(String[] args) {
		for (int i=1;i<=5;i++) {
			for(int j=4;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++) {	
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
