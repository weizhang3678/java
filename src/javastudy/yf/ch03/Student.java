package javastudy.yf.ch03;

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
    
    public int grade;  // field
    public int gender; 
    public int[] marks;
    
    /**
     * no-argument constructor
     */
    public Student(){
    	
    }
    
    /**
     * one-argument constructor
     * @param grade
     */
    public Student(int grade) {
    	this.grade = grade;
    }
    
    /**
     * two-argument constructor
     * @param grade
     * @param gender
     */
    public Student(int grade, int gender) {
    	this(grade);
    	this.gender = gender;
    }
  
    /* constructor */
    public Student(int grade, int gender, int... marks) {
        this(grade,gender);
        this.marks = marks;
    }
        
    public void study() {
        // TODO
    }
        
    public void joinClub(String clubName) {
        // TODO;
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

	public int[] getMarks() {
		return marks;
	}

	// parameters number is not fixed
	public void setMarks(int... marks) {
		this.marks = marks;
	}
    
    
        
}
/**
 * 
 * @author zhangwei
 *
 */
class CreateStudentDemo{
	
	public static void main(String[] args) {
		
		Student wzhang = new Student(11, 1, new int[]{100,100,100});
		wzhang.study();
		wzhang.joinClub("reading");
	}
	
}
