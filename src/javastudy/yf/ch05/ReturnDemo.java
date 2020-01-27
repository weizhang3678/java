package javastudy.yf.ch05;

/**
 *
 * Copyright 2020 YF Studio
 *
 * All right reserved.
 * 
 * Created on Jan 27, 2020 2:53:18 PM
 * 
 */

public class ReturnDemo {
	
	public static int hopDistance() {
		return (int)(Math.random()*5);
		
	}
	
	public static void noReturn() {
		int sum = 0;
		for(int i=0; i< 100;i++) {
			sum += i;
			if(sum > 1000) {
				System.out.println("i = "+i+"; sum = " + sum);
				return;
			}
		}
		
	}
	
	/**
	 * success or not
	 * @return
	 */
	public static boolean withReturn() {
		int maxHop = 100;
		int distance = 0;
		int goal = 100;
		for(int i=0; i< maxHop;i++) {
			distance += hopDistance();
			if(distance > goal) {
				System.out.println("hop times:" + i);
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		withReturn();
		noReturn();

	}

}
