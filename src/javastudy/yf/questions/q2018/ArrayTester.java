package javastudy.yf.questions.q2018;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Copyright 2020 YF Studio
 *
 * All right reserved.
 * 
 * Created on Jan 22, 2020 7:34:31 PM
 * 
 * 2018 AP® COMPUTER SCIENCE A FREE-RESPONSE QUESTION 4
 * 
 */

public class ArrayTester {
	/**
	 * Returns an array containing the elements of column c of arr2D in the same
	 * order as they appear in arr2D. Precondition: c is a valid column index in
	 * arr2D. Postcondition: arr2D is unchanged.
	 */
	public static int[] getColumn(int[][] arr2D, int c) {
		/* to be implemented in part (a) */ 
           int[] result = new int[arr2D.length];
           for(int i = 0 ; i< arr2D.length; i++) {
        	   result[i] = arr2D[i][c];
           }
           return result;
    }

	/**
	 * Returns true if and only if every value in arr1 appears in arr2.
	 * Precondition: arr1 and arr2 have the same length. Postcondition: arr1 and
	 * arr2 are unchanged.
	 */
	public static boolean hasAllValues(int[] arr1, int[] arr2) {
		/* implementation not shown */ 
		for(int i = 0; i < arr1.length; i++) {
			boolean findIt = false ;
			for(int j=0; j < arr2.length; j++) {
				findIt = false;
				if(arr1[j] == arr2[j]){
					findIt = true;
					continue;
				}
			}
			if(!findIt) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Returns true if arr contains any duplicate values; false otherwise.
	 */
	public static boolean containsDuplicates(int[] arr) {	   
	   // use array only
	   for(int i = 0; i < arr.length ; i++) {
		   for(int j=i+1; j< arr.length; j++) {
			   if(arr[i]==arr[j]) {
				   return true;
			   }
		   }
	   }
	   return false;
	   
//		// use ArrayList
//		List list = new ArrayList();
//		/* implementation not shown */
//	   for(int i : arr) {
//		   if(list.contains(i)) {
//			   return true;
//		   }
//		   list.add(i);
//	   }	
//	   return false;
	}

	/**
	 * Returns true if square is a Latin square as described in part (b); * false
	 * otherwise. Precondition: square has an equal number of rows and columns. *
	 * square has at least one row.
	 */
	public static boolean isLatin(int[][] square) {
		/* to be implemented in part (b) */ 
		// The first row has no duplicate values: not satisfied
		if(containsDuplicates(square[0])) {
			return false;
		}
		
		// All values in the first row of the square appear in each row of the square: not satisfied
		for(int i = 1; i < square.length ; i++) {
			if(!hasAllValues(square[0], square[i])) {
				return false;
			}
		}
		
		// All values in the first row of the square appear in each column of the square : not satisfied
		for(int i = 0; i < square.length ; i++) {
			if(!hasAllValues(square[0], ArrayTester.getColumn(square, i))) {
				return false;
			}
		}
		
		return true;
	}
}
