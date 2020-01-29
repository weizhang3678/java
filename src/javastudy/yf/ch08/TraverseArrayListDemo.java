package javastudy.yf.ch08;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Copyright 2020 YF Studio
 *
 * All right reserved.
 * 
 * Created on Jan 29, 2020 11:53:45 AM
 * 
 */

public class TraverseArrayListDemo {
	
	// if no type, we need to class cast
	// there may be classcastexception, it is not safe
	public static void noType(ArrayList list) {
		for(int i = 0; i < list.size(); i++) {
			String str = (String)list.get(0);
		}
		
		for(Object obj:list) {
			String str = (String)obj;
		}
		
	}
	
	//
	public static void modifyByIndexedForLoop(ArrayList<String> list) {
		for(int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			if(str.contains("m")) {
				list.remove(str);
			}
		}
		System.out.println(list);
	}
	
	//
	public static void modifyByEnhancedForLoop(ArrayList<String> list) {
		for(String str: list) {
			if(str.contains("m")) {
				list.remove(str);
			}
		}
		
	}
	
	public static void modify(ArrayList<String> list) {
		ArrayList<String> removedList = new ArrayList<String>();
		ArrayList<String> remainedList = new ArrayList<String>();
		for(int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			if(str.contains("m")) {
				removedList.add(str);
			}else {
				remainedList.add(str);
			}
		}
		list.removeAll(removedList);
		System.out.println(list);
		System.out.println(remainedList);
	}
	
	// use indexed for loop
	public static void indexedForLoop(ArrayList<String> list) {
		for(int i = 0; i < list.size(); i++) {
			String str = list.get(0);
			System.out.println(str);
		}
		
	}
	
	// use for each loop
	public static void enhancedForLoop(ArrayList<String> list) {
		for(String str: list) {
			System.out.println(str);
		}
		
	}
	
	public static void main(String[] args) {
		
		String[] types = { "VIP Diamond", "VIP Golden", "VIP Silver", "Normal", "Not a Member" };
    	//declare a ArrayList and operate it
		ArrayList<String> list = new ArrayList<String>();
        for (String a : types)
            list.add(a);
        
        
        //modifyByIndexedForLoop(list);
        modifyByEnhancedForLoop(list);
        //modify(list);
		
	}

}
