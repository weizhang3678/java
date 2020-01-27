package javastudy.yf.ch05;

/**
 *
 * Copyright 2020 YF Studio
 *
 * All right reserved.
 * 
 * Created on Jan 18, 2020 5:57:41 PM
 * 
 */

public class ContinueDemo {
	
	public static void simple() {
		int sum = 0;
		for(int i= 1; i< 100;i++){
		    if(i % 2 == 0 ){
		          continue;
		    }
		    sum += i;
		}
		System.out.println("sum="+sum);
		
	}
	
	public static void searchP() {
		String searchMe = "peter piper picked a " + "peck of pickled peppers";
        int max = searchMe.length();
        int numPs = 0;

        for (int i = 0; i < max; i++) {
            // interested only in p's
            if (searchMe.charAt(i) != 'p')
                continue;

            // process p's
            numPs++;
        }
        System.out.println("Found " + numPs + " p's in the string.");
	}
	
    public static void main(String[] args) {
    	simple();
        
    }
}