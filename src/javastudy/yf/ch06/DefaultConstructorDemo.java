package javastudy.yf.ch06;

/**
 *
 * Copyright 2020 YF Studio
 *
 * All right reserved.
 * 
 * Created on Jan 20, 2020 1:28:39 PM
 * 
 * This is a demo to show default constructor without arguments
 * There will be a compiler error during this demo
 * 
 */

public class DefaultConstructorDemo {

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