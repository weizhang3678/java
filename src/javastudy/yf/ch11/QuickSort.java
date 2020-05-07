package javastudy.yf.ch11;

import java.util.Arrays;

/**
 *
 * Copyright 2020 YF Studio
 *
 * All right reserved.
 * 
 * Created on Mar 8, 2020 2:06:46 PM
 * 
 */
public class QuickSort {

	static int count = 0;

	public static void quickSort(int[] arr) {
		quickSort(arr, 0, arr.length - 1);
	}

	public static void quickSort(int[] arr, int begin, int end) {
		if (begin < end) {
			count++;
			int partitionIndex = partition(arr, begin, end);
			System.out.println(Arrays.toString(arr));
			quickSort(arr, begin, partitionIndex - 1);
			quickSort(arr, partitionIndex + 1, end);
			
		}
	}

	private static int partition(int arr[], int begin, int end) {
		int pivot = arr[end];
		int i = (begin - 1);

		for (int j = begin; j < end; j++) {
			if (arr[j] <= pivot) {
				i++;

				int swapTemp = arr[i];
				arr[i] = arr[j];
				arr[j] = swapTemp;
			}
		}

		int swapTemp = arr[i + 1];
		arr[i + 1] = arr[end];
		arr[end] = swapTemp;
		return i + 1;
	}

	public static void main(String[] args) {
		int[] arr1 = { 86, 47, 89, 109, 90, 3, 49, 3};
		quickSort(arr1);
		int[] arr = MergeSort.initArray(1_000_000_0);
		long start = System.currentTimeMillis();
		//quickSort(arr);
		long end = System.currentTimeMillis();
		//System.out.println("use time:" + (end - start) + "ms");
		//System.out.println("count = " + count);

	}

}
