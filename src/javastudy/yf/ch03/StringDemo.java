package javastudy.yf.ch03;

import java.util.Date;
import java.util.StringJoiner;

/**
 *
 * Copyright 2020 YF Studio
 *
 * All right reserved.
 * 
 * Created on Jan 20, 2020 5:54:55 PM
 * 
 */

public class StringDemo {

	public static void main(String[] args) {
		
		// initialize string object
		String string1 = "Hello,";
		String string2 = "world!";
		String string3 = new String("hello");
		String string4 = new String(new char[] {'h', 'e', 'l', 'l', 'o', '!'});
																									
		
		// variable s refer to another Sting object, not the original one changes to new one.
		String s = "Hello";
        System.out.println(s);
        s = s.toUpperCase();
        System.out.println(s);
        
        // length of String
        System.out.println(string1.length()); 
        
        // get char
        System.out.println(s.charAt(0)); 
        // throw StringIndexOutOfBoundsException 
        // System.out.println(s.charAt(16)); 
        
        // Concatenate string objects
        System.out.println(string1 + string2 ); 
        System.out.println(string1.concat(string2));
        System.out.println(String.join("",string1,string2));  
        
        System.out.println(string1 + string2 + string3); 
        System.out.println(string1.concat(string2).concat(string3)); 
        System.out.println(String.join("",string1,string2,string3)); 
              
        // another scenario for join()
        String[] arr = {"A", "B", "C"};
        System.out.println( String.join("***", arr)); 
        
        // Concatenate string and other objects
        System.out.println(string1 + 3.0);
        System.out.println(string1 + new Date());
              
        // how to compare two String variables
        // s1, s2 refer to the same constant "hello"
        String s1 = "hello";
        String s2 = "hello";
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        
        //s3, s4 refer to different objects
        String s3 = "hello";
        String s4 = "HELLO".toLowerCase();
        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));
        
        System.out.println("******** Compare *******");
        
        System.out.println("hello".compareTo("HELLO"));
        System.out.println("hello".compareToIgnoreCase("HELLO"));
        
        // Case in-sensitive comparison
        System.out.println(s3.equalsIgnoreCase("HELLO"));
        
        // if contains
        System.out.println(s.contains("ll")); // true
        
        // search substring
        System.out.println(s.indexOf("l")); // 2
        System.out.println(s.lastIndexOf("l")); // 3
        System.out.println(s.startsWith("He")); // true
        System.out.println(s.endsWith("lo")); // true
        
        // get substring
        // index starts from 0 instead of 1
        System.out.println(s.substring(2)); 
        System.out.println(s.substring(2, 4)); 
        
        System.out.println(s.substring(-2, 2)); 
        
        // trim() eliminates leading and trailing spaces
        // strip() is new feature after JDK11
        // the difference of trim() and strip() is: strip() is "Unicode-aware" evolution of trim()
        // strip() can remove Unicode space
        // isWhitespace(int) can detect Unicode blank space
        System.out.println("  \tHello\r\n ".trim()); 
        //System.out.println("\u3000Hello\u3000".strip()); 
        //System.out.println(" Hello ".stripLeading()); 
        //System.out.println(" Hello ".stripTrailing();); 
        
        // check for blank or empty strings
        // isEmpty() checks string length is 0
        // isBlank() checks for non-whitespace characters
        System.out.println("".isEmpty()); 
        System.out.println("  ".isEmpty()); 
        //System.out.println("  \n".isBlank()); 
        //System.out.println(" Hello ".isBlank()); 
        
        // replace
        System.out.println(s.replace('l', 'w')); 
        System.out.println(s.replace("ll", "~~")); 
        // replace by regular expression
        System.out.println(s.replaceAll("[\\,\\;\\s]+", ",")); 
        
        //breaks string 
        String str = "a,b,c,d";
        String[] strArr = str.split("\\,");

        
        // change other types to String
        System.out.println(String.valueOf(true)); 
        System.out.println(String.valueOf(3.0)); 
        System.out.println(String.valueOf(""+3.0)); 
        System.out.println(String.valueOf(""+new Date())); 
        
        //change String to char array
        char[] cs = "Hello".toCharArray();
        
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<1000; i++) {
        	sb.append(sb);
        }
        System.out.println(sb.toString());
        
        StringJoiner sj = new StringJoiner(",");
        String[] names = {"Bob", "Alice", "Grace"};
        for (String name : names) {
            sj.add(name);
        }
        System.out.println(sj.toString());
        
        int a = 72;
        int b = 105;
        int c = 65281;
        // This is wrong: String test = a + b + c;
        String test = ""+ a + b + c;
 
	}

}
