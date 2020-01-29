package javastudy.yf.ch08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 *
 * Copyright 2020 YF Studio
 *
 * All right reserved.
 * 
 * Created on Jan 18, 2020 6:09:11 PM
 * 
 */

public class ArrayListDemo {
	// simple ArrayList demo
    public static void main(String[] args) {
    	String[] types = { "VIP Diamond", "VIP Golden", "VIP Silver", "Normal" };
    	//declare a ArrayList and operate it
        List<String> list = new ArrayList<String>();
        for (String a : types)
            list.add(a);
        System.out.println(list);
        Collections.shuffle(list, new Random());
        System.out.println(list);
        
        // size()
        System.out.println(list.size());
        
        // get, set
        list.set(3, "Not a Member");
        System.out.println(list.get(3));
        
        // remove and add(index,obj)
        list.remove(2);
        list.add(2, "Silver");
        System.out.println(list);
        
        // warning if no Type
   	    List listq = new ArrayList();
   	     listq.add("aaa");
   	    // class cast is necessary if no type
   	     String obj = (String)listq.get(0);
   
   	     // IndexOutOfBoundsException 
   	     //listq.get(2);
    }
}
