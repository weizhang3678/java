package javastudy.yf.ch08;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * Copyright 2020 YF Studio
 *
 * All right reserved.
 * 
 * Created on Jan 29, 2020 2:11:02 PM
 * 
 */

public class Reverse {
	
	public static void main(String[] args) {
		String[] types = { "VIP Diamond", "VIP Golden", "VIP Silver", "Normal", "Not a Member" };
		ArrayList<String> list = new ArrayList<String>();
        for (String a : types)
            list.add(a);
        
        
        // swap the value
        System.out.println(list);
        for(int i=0 ; i< list.size()/2; i++) {
        	String str1 = list.get(list.size()-1-i);
        	String str2 = list.get(i);
        	list.set(i, str1);
        	list.set(list.size()-1-i, str2);
        }
        System.out.println(list);
        
        // create a new List
        ArrayList<String> newList = new ArrayList<String>();
        for(int i=list.size()-1; i>=0; i--) {
        	newList.add(list.get(i));
        }
        list = newList;
        System.out.println(list);
        
        // collections
        Collections.reverse(list); 
        Collections.sort(list);  
        Collections.shuffle(list);
		
	}

}
