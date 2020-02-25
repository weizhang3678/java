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

public class Animal {
	
	private int weight;
	private int size;
	private boolean isDangerous;
	
	public Animal() {
		System.out.println("creating a animal without initializing data...");
	}
	
	public Animal(int weight, int size, boolean isDangerous) {
		System.out.println("creating a animal...");
		this.weight = weight;
		this.size = size;
		this.isDangerous = isDangerous; 
		
	}
	
	public void sleep() {
		System.out.println("Å sleep");
	}
	
	public void feed() {
		System.out.println("Animal needs food");
	}
	
	

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public boolean isDangerous() {
		return isDangerous;
	}

	public void setDangerous(boolean isDangerous) {
		this.isDangerous = isDangerous;
	}

	public static void main(String[] args) {
		

	}

}
