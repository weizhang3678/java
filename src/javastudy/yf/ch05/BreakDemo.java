package javastudy.yf.ch05;

/**
 *
 * Copyright 2020 YF Studio
 *
 * All right reserved.
 * 
 * Created on Jan 18, 2020 5:56:18 PM
 * 
 */

public class BreakDemo {
	
	public static void breakMethod() {
		int sum = 0;
		for(int i=0; i< 100;i++){
		    sum += i;
		    if(sum >= 1000){
		          break;
		    }
		}
		System.out.println("sum="+sum);
		
	}
	
	public static void searchInArray() {
		 int[] arrayOfInts = 
	            { 32, 87, 3, 589,
	              12, 1076, 2000,
	              8, 622, 127 };
	        int searchfor = 12;

	        int i;
	        boolean foundIt = false;

	        for (i = 0; i < arrayOfInts.length; i++) {
	            if (arrayOfInts[i] == searchfor) {
	                foundIt = true;
	                break;
	            }
	        }

	        if (foundIt) {
	            System.out.println("Found " + searchfor + " at index " + i);
	        } else {
	            System.out.println(searchfor + " not in the array");
	        }
		
	}
	
    public static void main(String[] args) {

    	breakMethod();
    }
}
