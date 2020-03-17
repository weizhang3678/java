package javastudy.yf.ch07;

import java.util.Arrays;

/**
 *
 * Copyright 2020 YF Studio
 *
 * All right reserved.
 * 
 * Created on Jan 18, 2020 6:04:35 PM
 * 
 */

public class ArrayCopyDemo {

	public static boolean remove(int[] arr, int val) { boolean found = false;
	int i;
	for(i = 0; i < arr.length && !found; i++) {
	if(arr[i] == val) { found = true;
	} }
	if(found) {
	for(int j = i; j < arr.length;j++) {
	arr[j - 1] = arr[j]; }
	arr[arr.length - 1] = 0; }
	return found; }

	public static void main(String[] args) {
		char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd' };
		char[] copyTo = new char[7];

		System.arraycopy(copyFrom, 2, copyTo, 0, 7);
		System.out.println(new String(copyTo));

		int[] arr = {3,4,4,5,17,4,3,1}; int val = 4;
        remove(arr,val);
		System.out.println(Arrays.toString(arr));

	}

}
