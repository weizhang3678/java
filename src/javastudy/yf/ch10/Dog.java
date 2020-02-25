package javastudy.yf.ch10;

/**
*
* Copyright 2020 YF Studio
*
* All right reserved.
* 
* Created on Feb 24, 2020 6:07:05 PM
* 
*/

public class Dog extends Animal {
	
    public Dog() {
    	System.out.println("creating a dog without initializing data...");
    }
	
	public Dog(int weight, int size, boolean isDangerous) {
		super(weight, size, isDangerous);
		System.out.println("creating a a dog...");
		
	}
	
	public void sleep() {
		System.out.println("Dog sleeps in night.");
	}
	
	public void feed() {
		System.out.println("Dog needs bone");
	}
	

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.feed();

	}

}
