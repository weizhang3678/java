package javastudy.yf.ch07;

import java.util.Arrays;
import java.util.Date;

import javastudy.yf.ch03.Supervisor;


/**
 *
 * Copyright 2020 YF Studio
 *
 * All right reserved.
 * 
 * Created on Jan 28, 2020 7:18:02 PM
 * 
 */

public class ForEachDemo {

	public static void main(String[] args) {
		String[] types = { "VIP Diamond", "VIP Golden", "VIP Silver", "Normal" };
		// use for each loop to change array value, this is a String array
		// it does not work
		for(String type:types) {
			type += " Membership";
		}
        System.out.println(Arrays.toString(types));
        
        // use indexed for loop top change array value, it works
        for(int i=0;i<types.length;i++) {
        	types[i] += " Membership";
        }
        System.out.println(Arrays.toString(types));
        
        // use for each loop top change array value, it works
        Student ma = new Student(6,1);
        Student li = new Student(7,2);
        Student[] ss = new Student[] {ma,li};
        System.out.println(Arrays.toString(ss));
        for(Student s:ss) {
        	s.setGender(22);
        }
        System.out.println(Arrays.toString(ss));
	}

}

class Student {    
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
	   
	   
	   @Override
	public String toString() {
		return "Student [grade=" + grade + ", gender=" + gender + ", supervisor=" + supervisor + "]";
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public static String getNationality() {
		return nationality;
	}
	public static void setNationality(String nationality) {
		Student.nationality = nationality;
	}
	public void takeBreak(Date start, Date end, String reason) {
		   
	   }
	       
	}
