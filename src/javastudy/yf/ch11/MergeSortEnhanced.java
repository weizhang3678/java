package javastudy.yf.ch11;

import java.util.Arrays;

/**
*
* Copyright 2020 YF Studio
*
* All right reserved.
* 
* Created on Feb 8, 2020 2:06:46 PM
* 
*/
public class MergeSortEnhanced {

	// Merges two subarrays of arr[].
	// First subarray is arr[l..m]
	// Second subarray is arr[m+1..r]
	public static void merge(int arr[], int left, int middle, int right) {
		// Find sizes of two subarrays to be merged
		int n1 = middle - left + 1;
		int n2 = right - middle;

		/* Create temp arrays */
		int L[] = new int[n1];
		int R[] = new int[n2];

		/* Copy data to temp arrays */
		for (int i = 0; i < n1; ++i)
			L[i] = arr[left + i];
		for (int j = 0; j < n2; ++j)
			R[j] = arr[middle + 1 + j];

		/* Merge the temp arrays */

		// Initial indexes of first and second subarrays
		int i = 0, j = 0;

		// Initial index of merged subarry array
		int k = left;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		/* Copy remaining elements of L[] if any */
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		/* Copy remaining elements of R[] if any */
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	// Main function that sorts arr[l..r] using
	// merge()
	public static void mergeSort(int arr[], int left, int right) {
		if (left < right) {
			// Find the middle point
			int m = (left + right) / 2;

			// Sort first and second halves
			mergeSort(arr, left, m);
			mergeSort(arr, m + 1, right);

			// Merge the sorted halves
			merge(arr, left, m, right);
		}
	}

	public static void main(String[] args) {
		int[] arr1 = { 86, 47, 89, 109, 90, 3, 43 };
		System.out.println(Arrays.toString(arr1));
		mergeSort(arr1, 0, arr1.length - 1);
		System.out.println(Arrays.toString(arr1));

	}

}
