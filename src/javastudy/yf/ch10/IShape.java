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
public interface IShape {
  int testField = 100;
  int getArea();
  int getPerimeter();

  // This is new feature of JDK 1.8, not in AP exam scope
  static String getDescription() {  
    return "2D";	  
  }
  
  //This is new feature of JDK 1.8, not in AP exam scope
  default double volumn() {
	  return 0.0;
  }
}
