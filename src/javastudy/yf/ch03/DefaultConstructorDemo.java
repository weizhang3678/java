package javastudy.yf.ch03;

/**
 *
 * Copyright 2020 YF Studio
 *
 * All right reserved.
 * 
 * Created on Jan 20, 2020 1:28:39 PM
 * 
 */

public class DefaultConstructorDemo {
   // This is a demo
   // There will be a compiler error during this demo
}

class Person{
	int age;
	int gender;
	
	public Person(int age, int gender) {
		this.age = age;
		this.gender = gender;
	}
}

class Adult extends Person {
	
	public Adult() {
		
	}
	
}

class Child extends Person{
	
}