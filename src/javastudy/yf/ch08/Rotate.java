package javastudy.yf.ch08;

import java.util.ArrayList;

/**
 *
 * Copyright 2020 YF Studio
 *
 * All right reserved.
 * 
 * Created on Jan 29, 2020 2:10:54 PM
 * 
 */

public class Rotate {
	
	public static void main(String[] args) {
		String[] types = { "VIP Diamond", "VIP Golden", "VIP Silver", "Normal", "Not a Member" };
		ArrayList<String> list = new ArrayList<String>();
        for (String a : types)
            list.add(a);
        
        // move to left
        System.out.println(list);
        String first = list.remove(0);
        list.add(first);
        System.out.println(list);
        
        // move to right
        String last = list.remove(list.size()-1);
        list.add(0, last);
        System.out.println(list);
		
	}

}
