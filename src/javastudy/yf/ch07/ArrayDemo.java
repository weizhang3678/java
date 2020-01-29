package javastudy.yf.ch07;

/**
 *
 * Copyright 2020 YF Studio
 *
 * All right reserved.
 * 
 * Created on Jan 18, 2020 6:03:44 PM
 * 
 */

public class ArrayDemo {
    public static void main(String[] args) {
    	// Initializer Lists to create array
    	int[] scores = {98,58,97,78,90,91,94,69,100};
    	String[] types = { "VIP Diamond" , "VIP Golden" , "VIP Silver" , "Normal"};
    	
    	for (int i = 0; i < scores.length; i++)
    	{
    	    System.out.println(  scores[i] );
    	}
    	for (int i = scores.length-1; i >=0; i--)
    	{
    	    System.out.println(  scores[i] );
    	}
    	for (int i = 0; i < types.length; i++)
    	{
    	    System.out.println(  types[i] );
    	}
    	
        // declares an array of integers
        int[] anArray;

        // allocates memory for 10 integers
        anArray = new int[10];
           
        // initialize first element
        anArray[0] = 100;
        // initialize second element
        anArray[1] = 200;
        // and so forth
        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;
        anArray[5] = 600;
        anArray[6] = 700;
        anArray[7] = 800;
        anArray[8] = 900;
        anArray[9] = 1000;

        System.out.println("Element at index 0: "
                           + anArray[0]);
        System.out.println("Element at index 1: "
                           + anArray[1]);
        System.out.println("Element at index 2: "
                           + anArray[2]);
        System.out.println("Element at index 3: "
                           + anArray[3]);
        System.out.println("Element at index 4: "
                           + anArray[4]);
        System.out.println("Element at index 5: "
                           + anArray[5]);
        System.out.println("Element at index 6: "
                           + anArray[6]);
        System.out.println("Element at index 7: "
                           + anArray[7]);
        System.out.println("Element at index 8: "
                           + anArray[8]);
        System.out.println("Element at index 9: "
                           + anArray[9]);
        
        Object integerObj = new Integer(2);

        System.out.println((String) integerObj);
    }
} 