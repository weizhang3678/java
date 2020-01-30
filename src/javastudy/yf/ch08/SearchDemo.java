package javastudy.yf.ch08;

/**
 *
 * Copyright 2020 YF Studio
 *
 * All right reserved.
 * 
 * Created on Jan 29, 2020 2:54:01 PM
 * 
 */

public class SearchDemo {

	public static int binarySearch(int[] elements, int target) {
		int left = 0;
		int right = elements.length - 1;
		while (left <= right) {
			int middle = (left + right) / 2;
			if (target < elements[middle]) {
				right = middle - 1;
			} else if (target > elements[middle]) {
				left = middle + 1;
			} else {
				return middle;
			}
		}
		return -1;
	}
	
	public static int binarySearch(String[] elements, String target) {
	      int left = 0;
	      int right = elements.length - 1;
	      while (left <= right)
	      {
	         int middle = (left + right) / 2;
	         if (target.compareTo(elements[middle]) < 0)
	         {
	            right = middle - 1;
	         }
	         else if (target.compareTo(elements[middle]) > 0)
	         {
	            left = middle + 1;
	         }
	         else {
	            return middle;
	         }
	       }
	       return -1;
	   }



	public static int sequentialSearch(String[] elements, String target) {
		for (int j = 0; j < elements.length; j++) {
			if (elements[j].contentEquals(target)) {
				return j;
			}
		}
		return -1;
	}
	
	public static int sequentialSearch(int[] elements, int target) {
		for (int j = 0; j < elements.length; j++) {
			if (elements[j] == target) {
				return j;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
