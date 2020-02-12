package javastudy.yf.ch02;

/**
 *
 * Copyright 2020 YF Studio
 *
 * All right reserved.
 * 
 * Created on Jan 14, 2020 7:30:44 PM
 * 
 */

public class ConditionalDemo {

    public static void main(String[] args){
        int value1 = 1;
        int value2 = 2;
        if((value1 == 1) && (value2 == 2))
            System.out.println("value1 is 1 AND value2 is 2");
        if((value1 == 1) || (value2 == 1))
            System.out.println("value1 is 1 OR value2 is 1");
        

        int result;
        boolean someCondition = true;
        result = someCondition ? value1 : value2;

        System.out.println(result);

        
        // test short-circuiting
        boolean b = 5 < 3;
        boolean r = b && (5 / 0 > 0);       
        System.out.println(r);
    }
  
}