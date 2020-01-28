package javastudy.yf.questions.q2016;

import java.util.List;

/**
 *
 * Copyright 2020 YF Studio
 *
 * All right reserved.
 * 
 * Created on Jan 28, 2020 9:09:38 AM
 * 
 * 2016 AP® COMPUTER SCIENCE A FREE-RESPONSE QUESTIONS 4
 * 
 */

public class StringFormatter {

	/**
	 * Returns the total number of letters in wordList. Precondition: wordList
	 * contains at least two words, consisting of letters only.
	 */
	public static int totalLetters(List<String> wordList) {
		int number = 0;
		for (String word : wordList) {
			number = number + word.length();
		}
		return number;
	}

	/**
	 * Returns the basic gap width when wordList is used to produce a formatted
	 * string of formattedLen characters. Precondition: wordList contains at least
	 * two words, consisting of letters only. formattedLen is large enough for all
	 * the words and gaps.
	 */
	public static int basicGapWidth(List<String> wordList, int formattedLen) {
		int lettersLength = totalLetters(wordList);
		int lettersNumber = wordList.size();
		return (formattedLen - lettersLength) / (lettersNumber - 1);
	}

	/**
	 * Returns the number of leftover spaces when wordList is used to produce a
	 * formatted string of formattedLen characters. Precondition: wordList contains
	 * at least two words, consisting of letters only. formattedLen is large enough
	 * for all the words and gaps.
	 */
	public static int leftoverSpaces(List<String> wordList, int formattedLen) {

		int lettersLength = totalLetters(wordList);
		int lettersNumber = wordList.size();
		return (formattedLen - lettersLength) % (lettersNumber - 1);
	}

	/**
	 * Returns a formatted string consisting of the words in wordList separated by
	 * spaces. Precondition:
	 * ThewordListcontainsatleasttwowords,consistingoflettersonly. formattedLen is
	 * large enough for all the words and gaps. Postcondition: All words in wordList
	 * appear in the formatted string. - The words appear in the same order as in
	 * wordList. - The number of spaces between words is determined by basicGapWidth
	 * and the distribution of leftoverSpaces from left to right, as described in
	 * the question.
	 */
	public static String format(List<String> wordList, int formattedLen) {
		int leftover = leftoverSpaces(wordList, formattedLen);
		String str = "";
	
		for (int i = 0; i < wordList.size(); i++) {
			str = str + wordList.get(i);
			if (1 != wordList.size() - 1) {
				for (int j = 0; j < basicGapWidth(wordList, formattedLen); j++) {
					str = str + " ";
				}
				if(leftover!=0) {
					str = str + " ";
					leftover--;
				}
			}
		}
		return str;
	}
	
	public static void main(String[] args) {
		
	}

}
