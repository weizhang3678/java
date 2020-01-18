package javastudy.yf.ch02;

/**
 *
 * Copyright 2020 YF Studio
 *
 * All right reserved.
 * 
 * Created on Jan 14, 2020 7:14:09 PM
 * 
 */

public class UnaryDemo {

    public static void main(String[] args) {

        int result = +1;
        // result is now 1
        System.out.println(result);

        result--;
        // result is now 0
        System.out.println(result);

        result++;
        // result is now 1
        System.out.println(result);

        result = -result;
        // result is now -1
        System.out.println(result);

        boolean success = false;
        // false
        System.out.println(success);
        // true
        System.out.println(!success);
        
        // this is a separator
        System.out.println("*********************");
        
        int i = 3;
        i++;
        // i = 4
        System.out.println(i);
        ++i;			   
        // i = 5
        System.out.println("i="+i);
        // i = 6
        System.out.println("++i=" +(++i));
        // i = 6
        //System.out.println("i="+i);
        // prints i++=6 , i = 7
        System.out.println("i++="+(i++));
        // i = 7
        System.out.println("i="+i);
        
    }
}