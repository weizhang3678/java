package javastudy.yf.ch09;

import java.util.Arrays;

/**
 *
 * Copyright 2020 YF Studio
 *
 * All right reserved.
 * 
 * Created on Feb 3, 2020 2:33:09 PM
 * 
 */

public class TraverseMultiDArrayDemo {

	public static void traverseRow(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for(int j=0; j < arr[i].length; j++) {
				int value = arr[i][j];
				System.out.print(value);
				System.out.print("\t");
			}
			System.out.println("");
		}
	}
	
	public static void traverseEnhancedRow(int[][] arr) {
		for (int[] arr1: arr) {
			for(int value: arr1) {
				System.out.print(value);
				System.out.print("\t");
			}
			System.out.println("");
		}
	}
	
	public static void traverseWhileRow(int[][] arr) {
		int i = 0;
		while(i < arr.length) {
			int j = 0;
			while(j < arr[i].length) {
				int value = arr[i][j];
				System.out.print(value);
				System.out.print("\t");
				j++;
			}
			System.out.println("");
			i++;
		}
	}

	public static void main(String[] args) {
		int[][] ns = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
		//traverseRow(ns);
		//traverseEnhancedRow(ns);
		//traverseWhileRow(ns);
		
		int[][] arr = { {3,2,1},{1,2,3} };
		for (int row = 1; row < arr.length; row++) {
		   for (int col = 1; col < arr[0].length; col++) {
		      if (arr[row][col] % 2 == 1)
		      {
		          arr[row][col] = arr[row][col] + 1;
		      }
		      if (arr[row][col] % 2 == 0)
		      {
		          arr[row][col] = arr[row][col] * 2;
		      }
		   }
		}
		System.out.println(Arrays.deepToString(arr));
	}

}
