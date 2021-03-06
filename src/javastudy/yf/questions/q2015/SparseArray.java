package javastudy.yf.questions.q2015;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
public class SparseArray {
	/** The number of rows and columns in the sparse array. */
	;;
	/**
	 * The list of entries representing the non-zero elements of the sparse array.
	 * Entries are stored in the list in no particular order. Each non-zero element
	 * is represented by exactly one entry in the list.
	 */
	private List<SparseArrayEntry> entries;
	private int numRows;
	private int numCols;

	/** Constructs an empty SparseArray. */
	public SparseArray() {
		entries = new ArrayList<SparseArrayEntry>();
	}

	public SparseArray(int row, int col, List<SparseArrayEntry> list) {
		entries = list;
		numRows = row;
		numCols = col;
	}

	/** Returns the number of rows in the sparse array. */
	public int getNumRows() {
		return numRows;
	}

	/** Returns the number of columns in the sparse array. */
	public int getNumCols() {
		return numCols;
	}

	public List<SparseArrayEntry> getEntries() {
		return entries;
	}

	/**
	 * Returns the value of the element at row index row and column index col in the
	 * sparse array. * Precondition: 0   row < getNumRows() 0   col < getNumCols()
	 */
	public int getValueAt(int row, int col) {
		for (SparseArrayEntry entry : entries) {
			if (entry.getCol() == col && entry.getRow() == row) {
				return entry.getValue();
			}
		}
		return 0;
	}

	/**
	 * Removes the column col from the sparse array. * Precondition: 0   col <
	 * getNumCols()
	 */
	public void removeColumn(int col) {
		numCols--;
		List<SparseArrayEntry> removed = new ArrayList<SparseArrayEntry>();
		List<SparseArrayEntry> added = new ArrayList<SparseArrayEntry>();
		for (SparseArrayEntry entry : entries) {
			if (entry.getCol() == col) {
				removed.add(entry);
			} else if (entry.getCol() > col) {
				SparseArrayEntry se = new SparseArrayEntry(entry.getRow(), entry.getCol() - 1, entry.getValue());
				added.add(se);
				removed.add(entry);
			}
		}

		for (SparseArrayEntry entry : removed) {
			entries.remove(entry);
		}

		for (SparseArrayEntry entry : added) {
			entries.add(entry);
		}
	}

	public void removeColumn1(int col){
	       int i=0;
	       while (i < entries.size()){
	            SparseArrayEntry e = entries.get(i);
	            if (e.getCol() == col){
	                entries.remove(i);
	            } else if (e.getCol() > col){
	                entries.set(i, new SparseArrayEntry(e.getRow(),
	                                                    e.getCol()-1,
	                                                    e.getValue()));
	                i++;
	            } else {
	                i++; 
	            }
	         numCols--; 
	       } 
	}

	// There may be instance variables, constructors, and methods that are not
	// shown.
	public static void main(String[] args) {
		SparseArrayEntry s1 = new SparseArrayEntry(1, 4, 4);
		SparseArrayEntry s2 = new SparseArrayEntry(2, 0, 1);
		SparseArrayEntry s3 = new SparseArrayEntry(3, 1, -9);
		SparseArrayEntry s4 = new SparseArrayEntry(1, 1, 5);
		List<SparseArrayEntry> entries = new ArrayList<SparseArrayEntry>();
		entries.add(s1);
		entries.add(s2);
		entries.add(s3);
		entries.add(s4);
		SparseArray sa = new SparseArray(6, 5, entries);
		System.out.println(sa.getValueAt(3, 1));
		System.out.println(sa.getValueAt(1, 4));
		System.out.println(sa.getValueAt(2, 2));
		sa.removeColumn1(1);
		System.out.println(sa.getEntries().toString());
	}

}
