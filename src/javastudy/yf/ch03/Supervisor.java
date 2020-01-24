package javastudy.yf.ch03;

/**
 *
 * Copyright 2020 YF Studio
 *
 * All right reserved.
 * 
 * Created on Jan 24, 2020 5:18:18 PM
 * 
 */

public class Supervisor {
	
	private String name;
	
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public Supervisor() {
		
	}

	public Supervisor(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	

}
