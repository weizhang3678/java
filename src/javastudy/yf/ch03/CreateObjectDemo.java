package javastudy.yf.ch03;

import java.awt.Point;
import java.awt.Rectangle;

/**
 *
 * Copyright 2020 YF Studio
 *
 * All right reserved.
 * 
 * Created on Jan 20, 2020 11:04:59 AM
 * 
 */

public class CreateObjectDemo {
	 
    public static void main(String[] args) {
         
        // Declare and create a point object and two rectangle objects.
        Point originOne = new Point(23, 94);
        Rectangle rectOne = new Rectangle(originOne.x, originOne.y, 100, 200);
        Rectangle rectTwo = new Rectangle(50, 100);
         
        // display rectOne's width, height, and area
        System.out.println("Width of rectOne: " + rectOne.width);
        System.out.println("Height of rectOne: " + rectOne.height);
         
        // set rectTwo's position
        rectTwo.x = originOne.x;
        rectTwo.y = originOne.y;
         
        // display rectTwo's position
        System.out.println("X Position of rectTwo: " + rectTwo.x);
        System.out.println("Y Position of rectTwo: " + rectTwo.y);
         
        // move rectTwo and display its new position
        rectTwo.move(40, 72);
        System.out.println("X Position of rectTwo: " + rectTwo.x);
        System.out.println("Y Position of rectTwo: " + rectTwo.y);
    }
}