package javastudy.yf.ch03;

import java.util.Arrays;

/**
 *
 * Copyright 2020 YF Studio
 *
 * All right reserved.
 * 
 * Created on Jan 21, 2020 8:57:45 AM
 * 
 */

public class Main {
    public static void main(String[] args) {
        int[] scores = new int[] { 88, 77, 51, 66 };
        Score s = new Score(scores);
        s.printScores();
        scores[2] = 99;
        s.printScores();
    }
}

class Score {
    private int[] scores;
    public Score(int[] scores) {
    	 // a demo to show the safety of value reference
        // this.scores = Arrays.copyOf(scores, scores.length);
    	 this.scores = scores;
    }

    public void printScores() {
        System.out.println(Arrays.toString(scores));
    }
}
