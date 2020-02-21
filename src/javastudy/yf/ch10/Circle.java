package javastudy.yf.ch10;

/**
*
* Copyright 2020 YF Studio
*
* All right reserved.
* 
* Created on Feb 21, 2020 9:07:05 AM
* 
*/

public class Circle extends Shape{
	private double radius;
	 
	public Circle() {
	}
 
	public Circle(double radius) {
		this.radius = radius;
	}
 
	@Override
	public double getArea() {
		return Math.PI * radius * radius;
	}
 
	@Override
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}
 
}
