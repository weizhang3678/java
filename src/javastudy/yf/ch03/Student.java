package javastudy.yf.ch03;

/**
 *
 * Copyright 2020 YF Studio
 *
 * All right reserved.
 * 
 * Created on Jan 20, 2020 11:52:56 AM
 * 
 */

public class Student {
    
    public int grade;  // field
    public int gender; 
    public int[] marks;
  
    /* constructor */
    public Student(int grade, int gender, int[] marks) {
        this.grade = grade;
        this.gender = gender;
        this.marks = marks;
    }
        
    public void study() {
        // TODO
    }
        
    public void joinClub(String clubName) {
        // TODO;
    }
        
}

class CreateStudentDemo{
	
	public static void main(String[] args) {
		
		Student wzhang = new Student(11, 1, new int[]{100,100,100});
		wzhang.study();
		wzhang.joinClub("reading");
	}
	
}
