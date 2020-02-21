package javastudy.yf.ch06;

/**
*
* Copyright 2020 YF Studio
*
* All right reserved.
* 
* Created on Feb 21, 2020 3:47:36 PM
* 
*/

public class Car {
	
	private double price;
	private String engine;
	private static String brand;	
	
	public Car() {
		
	}
	
	public Car(double price, String engine) {
		this.engine = engine;
		this.price = price;
	}
	
	

	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public String getEngine() {
		return engine;
	}



	public void setEngine(String engine) {
		this.engine = engine;
	}



	public static String getBrand() {
		return brand;
	}



	public static void setBrand(String brand) {
		Car.brand = brand;
	}



	public static void main(String[] args) {

	}

}
