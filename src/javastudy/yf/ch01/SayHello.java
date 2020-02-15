package javastudy.yf.ch01;

import java.util.Scanner;

/**
 * 
 * @author zhangwei
 *
 */
public class SayHello {

	public static void main(String[] args) {
	
		System.out.println("What is your name?");
		   
	    Scanner getName = new Scanner(System.in);

	    String userName = getName.nextLine();

	    System.out.println("Hello " + userName +"!");
	    
	    getName.close();

	}

}
