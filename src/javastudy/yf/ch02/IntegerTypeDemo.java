package javastudy.yf.ch02;

import java.math.BigInteger;

/**
 *
 * Copyright 2020 YF Studio
 *
 * All right reserved.
 * 
 * Created on Jan 14, 2020 7:08:01 PM
 * 
 */

public class IntegerTypeDemo {

	public static void main(String[] args) {
		
		// define a Integer types
		int i = 10000;
		i = 1_000;
		long l = 333_111_000_000l;
		byte b = 100;
		short s = 1000;
		int age = 12, gender =0, level; 

	
		// binary, octal, hex
		int intBinary = 0B11;
		int intOctal = 011;
		int intHex = 0x11;
		System.out.println("0b11:" + intBinary);
		System.out.println("011:" + intOctal);
		System.out.println("0x11:" + intHex);
		
		// result of Integer Types computation
		int i1 = 10;
		System.out.println(i1/4);
			
		// overflow 
		byte b1 = 127;
	    ++b1;
	    System.out.println(b1);
	    
	    int c1 = 2147483647;
	    ++c1;
	    System.out.println(c1);
	    
	    // underflow
	    byte b2 = -128;
	    --b2;
	    System.out.println(b2);
	    
	    int c2 = -2147483648;
	    --c2;
	    System.out.println(c2);
	    
	    // narrow or explicit conversion
	    // 456 % 256
	    byte test = (byte) 383;
	    System.out.println(test);
        
        
        // implicit conversion
        byte b3 = 50;   
        // type casting int to byte
        b3 = (byte)(b3 * 2);  
        System.out.println(b3);
        
	    // demo '+ ++' and '+++'
        // priority
	    int n1=10;
	    int n2=10;
	    int sum1=n1+ ++n2;
	    System.out.println("n1 = "+n1+", n2 = "+n2+", sum1 = "+sum1);
	    
	    int n3=10;
	    int n4=10;
	    int sum2=n3+++n4; 
	    System.out.println("n3 = "+n3+", n4 = "+n4+", sum2 = "+sum2);
	    
	    // divided by 0
        // can be compiled, runtime exception
	    System.out.println(3/0);
	    
	    // use class Integer, BigInteger
	    BigInteger.valueOf(1).add(BigInteger.valueOf(20000000000000000l)).multiply(BigInteger.valueOf(3));
	    
	}

}
