package javastudy.yf.questions.q2015;

/**
 *
 * Copyright 2020 YF Studio
 *
 * All right reserved.
 * 
 * Created on Feb 6, 2020 9:02:59 AM
 * 
 * 2015 AP® COMPUTER SCIENCE A FREE-RESPONSE QUESTIONS 1
 * 
 */
public class ArrayDemo {

	public static int arraySum(int[] arr) {
		int sum = 0;
		for (int num : arr) {
			sum += num;
		}
		return sum;
	}

	public static int[] rowSums(int[][] arr2D) {
		int[] result = new int[arr2D.length];
		for (int i = 0; i < arr2D.length; i++) {
			result[i] = arraySum(arr2D[i]);
		}
		return result;
	}

	public static int[] rowSums_(int[][] arr2D) {
		int[] result = new int[arr2D.length];
		for (int i = 0; i < arr2D.length; i++) {
			int sum = 0;
			for (int j = 0; j < arr2D.length; j++) {
				sum = sum + arr2D[i][j];
			}
			result[i] = sum;
		}
		return result;
	}

	public static boolean isDiverse(int[][] arr2D) {
		int[] rowSum = rowSums(arr2D);
		for (int i = 0; i < rowSum.length; i++) {
			for (int j = i + 1; j < rowSum.length; j++) {
				if (rowSum[i] == rowSum[j]) {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
