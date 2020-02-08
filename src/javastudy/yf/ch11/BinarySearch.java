package javastudy.yf.ch11;

/**
 *
 * Copyright 2020 YF Studio
 *
 * All right reserved.
 * 
 * Created on Feb 8, 2020 10:06:46 AM
 * 
 */

public class BinarySearch {

	public static int binarySearch(int[] arr, int left, int right, int target) {
		int middle = (left + right) / 2;
		if (right <= left) {
			return -1;
		}
		if (arr[middle] == target) {
			return middle;
		} else if (arr[middle] > target) {
			return binarySearch(arr, left, middle - 1, target);

		} else {
			return binarySearch(arr, middle + 1, right, target);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 3, 6, 8, 10, 11, 23, 45, 67, 77, 79, 80, 99, 101 };
		System.out.println(binarySearch(arr, 0, arr.length, 77));

	}

}
