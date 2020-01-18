package javastudy.yf.ch07;

/**
 *
 * Copyright 2020 YF Studio
 *
 * All right reserved.
 * 
 * Created on Jan 18, 2020 6:05:00 PM
 * 
 */

public class ArrayCopyOfDemo {
    public static void main(String[] args) {
        
        char[] copyFrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e',
            'i', 'n', 'a', 't', 'e', 'd'};
            
        char[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 2, 9);
        
        System.out.println(new String(copyTo));
    }
}