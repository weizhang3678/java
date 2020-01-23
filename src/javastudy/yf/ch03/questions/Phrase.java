package javastudy.yf.ch03.questions;

/**
 *
 * Copyright 2020 YF Studio
 *
 * All right reserved.
 * 
 * Created on Jan 23, 2020 11:26:54 AM
 * 
 * 2017 AP® COMPUTER SCIENCE A FREE-RESPONSE QUESTION 2
 * 
 */

public class Phrase {
	private String currentPhrase;

	/** Constructs a new Phrase object. */
	public Phrase(String p) {
		currentPhrase = p;
	}

	/**
	 * Returns the index of the nth occurrence of str in the current phrase; returns
	 * -1 if the nth occurrence does not exist. Precondition: str.length() > 0 and n
	 * > 0 Postcondition: the current phrase is not modified.
	 */
	public int findNthOccurrence(String str, int n) {
		/* implementation not shown */
		// just for compiled successfully
		return 0;
	}

	/**
	 * Modifies the current phrase by replacing the nth occurrence of str with repl.
	 * If the nth occurrence does not exist, the current phrase is unchanged.
	 * Precondition: str.length() > 0 and n > 0
	 */
	public void replaceNthOccurrence(String str, int n, String repl) {
		if (findNthOccurrence(currentPhrase, n) == -1) {
			return;
		}
		/* to be implemented in part (a) */
		String str1 = currentPhrase.substring(0, findNthOccurrence(currentPhrase, n));
		String str2 = currentPhrase.substring(findNthOccurrence(currentPhrase, n) + repl.length());
		currentPhrase = str1 + str2;
	}

	/**
	 * Returns the index of the last occurrence of str in the current phrase;
	 * returns -1 if str is not found. Precondition: str.length() > 0 Postcondition:
	 * the current phrase is not modified.
	 */
	public int findLastOccurrence(String str) {
		/* to be implemented in part (b) */
		// use while
		int n = 1;
		while (findNthOccurrence(str, n + 1) != -1) {
			n++;
		}
		return findNthOccurrence(str, n);

		// use lastIndexOf, it works but not satisfy the question requirement
		// return currentPhrase.lastIndexOf(str);
	}

	/** Returns a string containing the current phrase. */
	public String toString() {
		return currentPhrase;
	}
	
}
