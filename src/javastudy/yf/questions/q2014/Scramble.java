package javastudy.yf.questions.q2014;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Copyright 2020 YF Studio
 *
 * All right reserved.
 * 
 * Created on Feb 16, 2020 9:02:59 AM
 * 
 * 2014 AP® COMPUTER SCIENCE A FREE-RESPONSE QUESTIONS 1
 * 
 */
public class Scramble {

	public static String scrambleWord(String word) {
		String newWord = "";
		int current = 0;
		while (current < word.length() - 1) {
			if (word.substring(current, current + 1).equals("A")
					&& !word.substring(current + 1, current + 2).equals("A")) {
				newWord += word.substring(current + 1, current + 2);
				newWord += "A";
				current += 2;
			} else {
				newWord += word.substring(current, current + 1);
				current++;
			}
		}
		if (current < word.length()) {
			newWord += word.substring(current);
		}
		return newWord;
	}

	public static void scrambleOrRemove(List<String> wordList) {
		int index = 0;
		while (index < wordList.size()) {
			String word = wordList.get(index);
			String scrambled = scrambleWord(word);
			if (word.equals(scrambled)) {
				wordList.remove(index);
			} else {
				wordList.set(index, scrambled);
				index++;
			}
		}

	}

	public static void main(String[] args) {
		System.out.println(scrambleWord("TAN"));
		System.out.println(scrambleWord("ABRACADABRA"));
		System.out.println(scrambleWord("WHOA"));
		System.out.println(scrambleWord("AARDVARK"));
		System.out.println(scrambleWord("EGGS"));
		System.out.println(scrambleWord("APPLE"));

		List<String> testList = new ArrayList<String>();
		testList.add("TAN");
		testList.add("ABRACADABRA");
		testList.add("WHOA");
		testList.add("APPLE");
		testList.add("EGGS");
		scrambleOrRemove(testList);
		System.out.println(testList);

	}

}
