package javastudy.yf.questions.q2016;

/**
 *
 * Copyright 2020 YF Studio
 *
 * All right reserved.
 * 
 * Created on Jan 28, 2020 9:02:59 AM
 * 
 * 2016 AP® COMPUTER SCIENCE A FREE-RESPONSE QUESTIONS 3
 * 
 */

public class Crossword {

	/**
	 * Each element is a Square object with a color (black or white) and a number. *
	 * puzzle[r][c] represents the square in row r, column c. There is at least one
	 * row in the puzzle.
	 */
	private Square[][] puzzle;

	/**
	 * Constructs a crossword puzzle grid. Precondition: There is at least one row
	 * in blackSquares. Postcondition: - The crossword puzzle grid has the same
	 * dimensions as blackSquares. - The Square object at row r, column c in the
	 * crossword puzzle grid is black if and only if blackSquares[r][c] is true. -
	 * The squares in the puzzle are labeled according to the crossword labeling
	 * rule.
	 */
	public Crossword(boolean[][] blackSquares) {
		/* to be implemented in part (b) */
		int rows = blackSquares.length;
		int cols = blackSquares[0].length;
		puzzle = new Square[rows][cols];
		for (int row = 0; row < rows; row++) {
			for (int col = 0; col < cols; col++) {
				int num = 1;
				if(toBeLabeled(row, col, blackSquares)) {
					puzzle[row][col] = new Square(blackSquares[row][col], num);
					num++;
				}else {
					puzzle[row][col] = new Square(blackSquares[row][col], 0);
				}
				
			}
		}
	}

	/**
	 * Returns true if the square at row r, column c should be labeled with a
	 * positive number; false otherwise. The square at row r, column c is black if
	 * and only if blackSquares[r][c] is true. Precondition: r and c are valid
	 * indexes in blackSquares.
	 */
	private boolean toBeLabeled(int r, int c, boolean[][] blackSquares) {
		/* to be implemented in part (a) */
		// if black, return false
		if (blackSquares[r][c]) {
			return false;
		}
		if (r == 0 || c == 0) {
			return true;
		}
		// if not first row and not first column, the up and left are both white, return
		// false
		if (!blackSquares[r - 1][c] && !blackSquares[r][c - 1]) {
			return false;
		}
		return true;
		
		// return (!(blackSquares[r][c]) && (r == 0 || c == 0 || blackSquares[r - 1][c] ||	 blackSquares[r][c - 1]));
		
	}
	// There may be instance variables, constructors, and methods that are not
	// shown.

}
