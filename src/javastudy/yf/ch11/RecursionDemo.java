package javastudy.yf.ch11;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Copyright 2020 YF Studio
 *
 * All right reserved.
 * 
 * Created on Jan 23, 2020 8:15:21 PM
 * 
 */

public class RecursionDemo {
	
	public static int val(List<Integer> ints) {

	     if(ints.size() == 0) {

	          return 0;

	     } else {

	          return ints.remove(0) + val(ints);

	     }

	}
	
	public static int val1(List<Integer> ints) {

	     if(ints.size() == 0) {

	          return 0;

	     } else {

	          return ints.get(0) + val1(ints.subList(1, ints.size()));

	     }

	}


	
	public static void main(String[] args) {
		List list = new ArrayList<Integer>();
		list.add(3);
		list.add(58);
		list.add(58);
		list.add(58);
		list.add(58);
		list.add(58);
		System.out.println(val1(list));
		System.out.println(val(list));
	}

}
