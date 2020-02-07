package javastudy.yf.questions.q2015;

/**
 *
 * Copyright 2020 YF Studio
 *
 * All right reserved.
 * 
 * Created on Feb 6, 2020 10:02:59 AM
 * 
 * 2015 AP® COMPUTER SCIENCE A FREE-RESPONSE QUESTIONS 2
 * 
 */

public class HiddenWord {
	/* precondition: hiddenWord only has capital letters */
	private String hiddenWord;

	public HiddenWord(String hiddenWord) {
		this.hiddenWord = hiddenWord;
	}

	/**
	 * precondition: a guess contains only capital letters and has the same length
	 * as the hidden word.
	 * 
	 * @param guess
	 * @return
	 */
	public String getHint1(String guess) {
		String str = "";
		for (int i = 0; i < hiddenWord.length(); i++) {
			char ch1 = hiddenWord.charAt(i);
			char ch2 = guess.charAt(i);
			str += (ch1 == ch2) ? ch1 : hiddenWord.contains("" + ch2) ? "+" : "*";
		}
		return str;
	}

	public String getHint(String guess) {
		String hint = "";
		for (int i = 0; i < guess.length(); i++) {
			if (guess.substring(i, i + 1).equals(hiddenWord.substring(i, i + 1))) {
				hint += guess.substring(i, i + 1);
			} else if (hiddenWord.indexOf(guess.substring(i, i + 1)) != -1) {
				hint += "+";
			} else {
			}
		}
		hint += "*";
		return hint;
	}

	public static void main(String[] args) {
		HiddenWord puzzle = new HiddenWord("HARPS");
		System.out.println(puzzle.getHint("AAAAA"));
		System.out.println(puzzle.getHint("HELLO"));
		System.out.println(puzzle.getHint("HEART"));
		System.out.println(puzzle.getHint("HARMS"));
		System.out.println(puzzle.getHint("HARPS"));
	}

}
