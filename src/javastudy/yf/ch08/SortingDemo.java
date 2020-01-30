package javastudy.yf.ch08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * Copyright 2020 YF Studio
 *
 * All right reserved.
 * 
 * Created on Jan 29, 2020 4:13:09 PM
 * 
 */

public class SortingDemo {

	public static void selectionSort(int[] elements) {
		System.out.println(Arrays.toString(elements));
		for (int j = 0; j < elements.length - 1; j++) {
			int minIndex = j;
			for (int k = j + 1; k < elements.length; k++) {
				if (elements[k] < elements[minIndex]) {
					minIndex = k;
				}
			}
			int temp = elements[j];
			elements[j] = elements[minIndex];
			elements[minIndex] = temp;

			System.out.println(Arrays.toString(elements));
		}
	}

	public static void insertionSort(int[] elements) {
		System.out.println(Arrays.toString(elements));
		for (int j = 1; j < elements.length; j++) {
			int temp = elements[j];
			int possibleIndex = j;
			while (possibleIndex > 0 && temp < elements[possibleIndex - 1]) {
				elements[possibleIndex] = elements[possibleIndex - 1];
				possibleIndex--;
			}
			elements[possibleIndex] = temp;
			System.out.println(Arrays.toString(elements));
		}
	}

	public static void main(String[] args) {
		int[] data = { 2, 8, 3, 5, 3, 9, 1 };
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int n : data) {
			list.add(n);
		}
		//selectionSort(data);
		insertionSort(data);
		// Java API
		Arrays.sort(data);
		Collections.sort(list);

	}

}
