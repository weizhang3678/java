package javastudy.yf.ch04;

/**
 *
 * Copyright 2020 YF Studio
 *
 * All right reserved.
 * 
 * Created on Jan 27, 2020 10:32:16 AM
 * 
 */

public class NestedIfDemo {
	
	public static char gradeByTest(int testscore) {
        char grade;
        if (testscore >= 60) {
            if (testscore >= 70) {
                if (testscore >= 80) {
                   if (testscore >= 90) {
                       grade = 'A';
                   } else {
                   grade = 'B';
                  }
             } else {
                grade = 'C';
              }
            } else {
              grade = 'D';
           }
        } else {
            grade = 'F';
        }
    	System.out.println("grade="+grade);
    	return grade;
	}

	public static void main(String[] args) {
		//generate a random value in (90, 100)
		char aLevel = gradeByTest(90 + (int)(Math.random()*10));
		System.out.println("90-100 is \'A\'? " + ( aLevel == 'A' ));

		//generate a random value in (80, 90)
		char bLevel = gradeByTest(80 + (int)(Math.random()*10));
		System.out.println("80-90 is \'B\'? " + ( bLevel == 'B' ));
		

		//generate a random value in (70, 80)
		char cLevel = gradeByTest(70 + (int)(Math.random()*10));
		System.out.println("70-80 is \'C\'? " + ( cLevel == 'C' ));
		

		//generate a random value in (60, 70)
		char dLevel = gradeByTest(60 + (int)(Math.random()*10));
		System.out.println("60-70 is \'D\'? " + ( dLevel == 'D' ));
		
		//generate a random value in (0, 60)
		char fLevel = gradeByTest((int)(Math.random()*60));
		System.out.println("0-60 is \'F\'? " + ( fLevel == 'F' ));

	}

}
