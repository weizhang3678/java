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

public class CallByValueOrReferenceDemo {
	
	public static void test(String str, int i, Student student, int[] arr) {
		str += ", Super!";
		i++;
		student.grade++;
		arr[0]++;
	}
	
    public static void main(String[] args) {
    	Student student = new Student(2,0);
    	int[] arr = {1,1};
    	String str = "Super";
    	int number = 10;
    	System.out.println("Before: str = " + str);
    	System.out.println("Before: number = " + number);
    	System.out.println("Before: student.grade = " + student.grade);
    	System.out.println("Before: arr[0] = " + arr[0]);
    	test(str, number, student,arr);
    	System.out.println("After: str = " + str);
    	System.out.println("After: number = " + number);
    	System.out.println("After: student.grade = " + student.grade);
    	System.out.println("After: arr[0] = " + arr[0]);
    	
        int[] scores = new int[] { 88, 77, 51, 66 };
        int top = 88;
        String level = "two";
       
        Score s = new Score(scores, top, level);
        s.printScores();
        
        scores[2] = 99;
        top = 99;
        level = "first";
        s.printScores();
    }
}

class Score {
	// call by reference 
    private int[] scores;
    // call by value
    private int top;
    // call by value
    private String level;
    public Score(int[] scores, int top, String level) {
    	 // a demo to show the safety of value reference
         // this.scores = Arrays.copyOf(scores, scores.length);
    	 this.scores = scores;
    	 this.top = top;
    	 this.level = level;
    }

    public void printScores() {
        System.out.println("scores:" + Arrays.toString(scores));
        System.out.println("top:" + top);
        System.out.println("level:" + level);
    }
}
