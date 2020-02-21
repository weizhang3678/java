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
public class Rectangle extends Shape{
	
	private double width;
	private double height;
 
	public Rectangle() {
 
	}
 
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
 
	}
 
	@Override
	public double getArea() {
		return width * height;
	}
 
	@Override
	public double getPerimeter() {
 
		return 2 * (width + height);
	}
 

}
