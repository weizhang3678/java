package javastudy.yf.lab;

import java.util.Scanner;

/**
 *
 * Copyright 2020 YF Studio
 *
 * All right reserved.
 * 
 * Created on Feb 5, 2020 2:08:41 PM
 * 
 */

public class TeleMarketer {

	public static void main(String[] args) {
		Scanner getInput = new Scanner(System.in);

		int first = getInput.nextInt();
		int second = getInput.nextInt();
		int third = getInput.nextInt();
		int last = getInput.nextInt();

		// check whether input is marketer telephone
		boolean isMartketer = (first == 8 || first == 9) 
				&& (last == 8 || last == 9)
				&& (second == third);
		if (isMartketer) {
			System.out.println("ignore");
		} else {
			System.out.println("answer");
		}
		getInput.close();

	}

}
