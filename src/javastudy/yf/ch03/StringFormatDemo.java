package javastudy.yf.ch03;

import java.util.Date;

/**
 *
 * Copyright 2020 YF Studio
 *
 * All right reserved.
 * 
 * Created on Jan 22, 2020 11:05:54 AM
 * 
 * SPECIFIER  |    APPLIES TO                          |     OUTPUT
 *   %a 	  | floating point (except BigDecimal	   | Hex output of floating point number
 *   %b		  | Any type	                           | “true” if non-null, “false” if null
 *   %c		  | character	                           | Unicode character
 *   %d		  | integer 	                           | Decimal Integer
 *   %e		  | floating point	                       | decimal number in scientific notation
 *   %f		  | floating point	                       | decimal number
 *   %g		  | floating point	                       | decimal number, possibly in scientific notation depending on the precision and value.
 *   %h		  | any type	                           | Hex String of value from hashCode() method.
 *   %n		  | none	                               | Platform-specific line separator.
 *   %o		  | integer                                | Octal number
 *   %s		  | any type	                           | String value
 *   %t		  | Date/Time                              | %t is the prefix for Date/Time conversions. More formatting flags are needed after this. See Date/Time conversion below.
 *   %x		  | integer                         	   | Hex string.
 * 
 */

public class StringFormatDemo {

	public static void main(String[] args) {
		
		String introduction =  String.format("I am %s. I am %d years old.", "Zhang", 39);
		System.out.println(introduction);
		
		// method
		String str=null;  
	    str=String.format("Hi,%s", "ming");  
	    System.out.println(str);  
	    str=String.format("Hi,%s %s %s", "ming","is","good");            
	    System.out.println(str);                           
	    System.out.printf("c ：%c %n", 'C');  
	    System.out.printf("boolean：%b %n", "ming".equals("good"));  
	    System.out.printf("100/2：%d %n", 100/2);  
	    System.out.printf("100：%x %n", 100);  
	    System.out.printf("100：%o %n", 100);  
	    
	    Date date = new Date();
	    String day = String.format("%te", date);
	    System.out.println("It is ：" + day );
	    String month = String.format("%tb", date);
	    System.out.println("It is ：" + month);
	    String xingqi = String.format("%tA", date);
	    System.out.println("It is ：" + xingqi);
	    String year = String.format("%tY", date);
	    System.out.println("It is year ：" + year );

	}

}
