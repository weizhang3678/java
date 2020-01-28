package javastudy.yf.questions.q2017;

/**
 *
 * Copyright 2020 YF Studio
 *
 * All right reserved.
 * 
 * Created on Jan 23, 2020 11:14:09 AM
 * 
 * 2017 AP® COMPUTER SCIENCE A FREE-RESPONSE QUESTION 4
 * 
 */

public class Position {

	/** Constructs a Position object with row r and column c. */

	public Position(int r, int c) {
		/* implementation not shown */

	}

	/**
	 * Returns the position of num in intArr; returns null if no such element exists
	 * in intArr. * Precondition: intArr contains at least one row.
	 */
	public static Position findPosition(int num, int[][] intArr) {

		for (int i = 0; i < intArr.length; i++) {
			for (int j = 0; j < intArr[0].length; j++) {
				if (num == intArr[i][j]) {
					return new Position(i, j);
				}

			}

		}

		return null;

	}

	public static Position[][] getSuccessorArray(int[][] intArr) {
		Position[][] newArr = new Position[intArr.length][intArr[0].length];
		for (int i = 0; i < intArr.length; i++) {
			for (int j = 0; j < intArr[0].length; j++) {
				newArr[i][j] = findPosition(intArr[i][j] + 1, intArr);
			}
		}
		return newArr;
	}

}
//There may be instance variables, constructors, and methods that are not shown. }
