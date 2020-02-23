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
public class FullDiamond {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=4;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i*2-1;k++) {	
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=(5*2-1)-2;k>=i*2-1;k--) {	
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
