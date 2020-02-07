package javastudy.yf.questions.q2015;

/**
 *
 * Copyright 2020 YF Studio
 *
 * All right reserved.
 * 
 * Created on Feb 6, 2020 10:20:00 AM
 * 
 * 2015 AP® COMPUTER SCIENCE A FREE-RESPONSE QUESTIONS 3
 * 
 */
public class SparseArrayEntry {
	/** The row index and column index for this entry in the sparse array */
	;;
	/** The value of this entry in the sparse array */
	private int value;
	private int row;
	private int col;

	/**
	 * Constructs a SparseArrayEntry object that represents a sparse array element *
	 * with row index r and column index c, containing value v.
	 */
	public SparseArrayEntry(int r, int c, int v) {
		row = r;
		col = c;
		value = v;
	}

	/** Returns the row index of this sparse array element. */
	public int getRow() {
		return row;
	}

	/** Returns the column index of this sparse array element. */
	public int getCol() {
		return col;
	}

	/** Returns the value of this sparse array element. */
	public int getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "SparseArrayEntry [value=" + value + ", row=" + row + ", col=" + col + "]";
	}

	
}
