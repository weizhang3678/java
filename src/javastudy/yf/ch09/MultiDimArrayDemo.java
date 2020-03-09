package javastudy.yf.ch09;

import java.util.Arrays;

/**
 *
 * Copyright 2020 YF Studio
 *
 * All right reserved.
 * 
 * Created on Jan 18, 2020 6:05:34 PM
 * 
 */

public class MultiDimArrayDemo {
    public static void main(String[] args) {
    	// This is a simple 2D arrays
    	 int[][] ns = {
    	            { 1, 2, 3, 4, 6 },
    	            { 5, 6, 7, 8 },
    	            { 9, 10, 11, 12 }
    	        };
    	 
    	// This is a simple 2D arrays
        String[][] names = {
            {"Mr. ", "Mrs. ", "Ms. "},
            {"Smith", "Jones"}
        };
        
        String[][] seatingInfo = { {"Jamal", "Maria"}, {"Jake", "Suzy"}, {"Emma", "Luke"} };
        
        // Mr. Smith
        System.out.println(names[0][0] + names[1][0]);
        // Ms. Jones
        System.out.println(names[0][2] + names[1][1]);
        
        // declare arrays
        int[][] ticketInfo;
        String[][] seatingChart;
        int[][] d;

        // create arrays
        ticketInfo = new int [2][3];
        seatingChart =  new String [3][2];
        d = new int[5][];

        // initialize the array elements
        ticketInfo[0][0] = 15;
        ticketInfo[0][1] = 10;
        ticketInfo[0][2] = 15;
        ticketInfo[1][0] = 25;
        ticketInfo[1][1] = 20;
        ticketInfo[1][2] = 25;
        seatingChart[0][0] = "Jamal";
        seatingChart[0][1] = "Maria";
        seatingChart[1][0] = "Jacob";
        seatingChart[1][1] = "Suzy";
        seatingChart[2][0] = "Emma";
        seatingChart[2][1] = "Luke";
        
       for(int i = 0 ; i < d.length; i++) {
    	  d[i] = new int[i+1];
    	  for(int j = 0; j< i+1; j++) {
    		  d[i][j] = i+ j;
    	  }
       }
       System.out.println(Arrays.deepToString(d));
    }
}