package javastudy.yf.ch03;

import java.util.Date;

/**
 *
 * Copyright 2020 YF Studio
 *
 * All right reserved.
 * 
 * Created on Jan 20, 2020 11:52:56 AM
 * 
 * A demo to show:
 *  1. How to define a class
 *  2. Constructor overloading
 *  3. Variable arguments
 *  4. initialize object
 * 
 */


public class Student {    
   private int grade;  // instance field
   private int gender; //instance  field
   private static String nationality; // class field 
   private Supervisor supervisor; //instance  field
   /* constructor */
   public Student(Supervisor  supervisor) {
        this.supervisor = supervisor;
   }   
   public Student(int grade, int gender) {
       this.grade = grade;
       this.gender = gender;
   }        
   public void study() {
       // TODO
   }        
   public void joinClub(String clubName) {
       // TODO;
   }
   
   public void takeBreak(Date start, Date end, String reason) {
	   
   }
       
}
/**
 * 
 * @author zhangwei
 *
 */
class CreateStudentDemo{
	
	public static void main(String[] args) {
		
		Student wzhang = new Student(11, 1);
		
		Supervisor supervisor = new Supervisor();
		Student siLi = new Student(supervisor);
		wzhang.study();
		wzhang.joinClub("reading");
		
	}
	
}
