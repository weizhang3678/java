package javastudy.yf.ch11;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Copyright 2020 YF Studio
 *
 * All right reserved.
 * 
 * Created on Jan 23, 2020 8:15:21 PM
 * 
 */

public class RecursionDemo {

	/**
	 * fibonacci
	 * 
	 * @param n
	 * @return
	 */
	public static int fibonacci(int n) {
		if (n <= 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		if (n == 2) {
			return 1;
		}
		return fibonacci(n - 1) + fibonacci(n - 2);
	}
	
	/**
	 * 
	 * @return
	 */
	public static int fibonacciLoop(int n) {
		if (n <= 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		if (n == 2) {
			return 1;
		}
		int[] nums = new int[n + 1];
        nums[2] = 1; 
        nums[1] = 1;
        for (int i = 3; i < nums.length; i++) {
            nums[i] = nums[i - 1] + nums[i - 2];
        }
        return nums[n];
	}
	
	public static int fibonacciLoopOpti(int n) {
		if (n <= 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		if (n == 2) {
			return 1;
		}
		int[] nums = new int[2];
        nums[1] = 1; 
        nums[0] = 1;
        int result = 0;
        for (int i = 3; i <= n; i++) {
        	result = nums[0] + nums[1];
        	nums[1] = nums[0];
            nums[0] = result;
        }
        return result;
	}

	/**
	 * 
	 * @param ints
	 * @return
	 */
	public static int sum2(List<Integer> ints) {

		if (ints.size() == 0) {

			return 0;

		} else {

			return ints.remove(0) + sum2(ints);

		}

	}

	/**
	 * 
	 * @param ints
	 * @return
	 */
	public static int sum1(List<Integer> ints) {

		if (ints.size() == 0) {

			return 0;

		} else {

			return ints.get(0) + sum1(ints.subList(1, ints.size()));

		}

	}

	public static void main(String[] args) {
		List list = new ArrayList<Integer>();
		list.add(3);
		list.add(58);
		list.add(58);
		list.add(58);
		list.add(58);
		list.add(58);
		System.out.println(sum2(list));
		System.out.println(sum1(list));
		
		
		System.out.println(fibonacciLoopOpti(9));
	}

}
