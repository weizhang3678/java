package javastudy.yf.ch06;

/**
 *
 * Copyright 2020 YF Studio
 *
 * All right reserved.
 * 
 * Created on Jan 31, 2020 3:47:36 PM
 * 
 */

public class Person {
	// fields
	private String name;
	private String email;
	private String phoneNumber;

	// constructor
	public Person(String theName) {
		this.name = theName;
	}
	
	// constructor
	public Person(String name, String email, String phoneNumber) {
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}

	// methods - getters
	public String getName() {
		return this.name;
	}

	public String getEmail() {
		return this.email;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setName(String theName) {
		this.name = theName;
	}

	public void setEmail(String theEmail) {
		this.email = theEmail;
	}

	public void setPhoneNumber(String thePhoneNumber) {
		this.phoneNumber = thePhoneNumber;
	}

//	public String toString() {
//		return this.name + " " + this.email + " " + this.phoneNumber;
//	}
	
	public String toString() {
		return "name is "+this.name + "\nemail is " + this.email + "\nphone is " + this.phoneNumber;
	}

	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		return true;
	}

	public static void main(String[] args) {
		Person sana = new Person("Sana", "sana@gmail.com","3065559999");
		Person mary = new Person("Mary", "sana@gmail.com","3065559999");
		System.out.println(sana);
		//Person p2 = new Person("Jean");
		//p2.setEmail("jean@gmail.com");
		//p2.setPhoneNumber("404 899-9955");
		//System.out.println(p2);
	}
}
