package javastudy.yf.lab;
import java.util.Scanner;

/**
 *
 * Copyright 2020 YF Studio
 *
 * All right reserved.
 * 
 * Created on Feb 5, 2020 1:10:01 PM
 * 
 */

public class TeleMarketerTest {

	/**
	 * check input is a valid number between 0 - 9
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isSingleNumber(String str) {
		// single number or not
		if (str.length() != 1) {
			return false;
		}
		// 0-9 or not
		char ch = str.charAt(0);
		if (ch > 57 || ch < 48) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner getInput = new Scanner(System.in);
		String first = getInput.nextLine();
		String second = getInput.nextLine();
		String third = getInput.nextLine();
		String last = getInput.nextLine();
		boolean validInputs = isSingleNumber(first) && isSingleNumber(second) && isSingleNumber(third) && isSingleNumber(last);
		if (!validInputs) {
			System.out.println("invalid input! You need to input 4 lines, and each line contains exactly one digit in\n" + 
					"the range from 0 to 9.");
			getInput.close();
			return;
	        
		}
		boolean isMartketer = (first.equals("8") || first.equals("9")) 
				&& (last.equals("8") || last.equals("9"))
				&& (second.equals(third));
		if (isMartketer) {
			System.out.println("ignore");
		} else {
			System.out.println("answer");
		}
		getInput.close();
	}

}
