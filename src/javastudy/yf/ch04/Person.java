package javastudy.yf.ch04;

/**
 *
 * Copyright 2020 YF Studio
 *
 * All right reserved.
 * 
 * Created on Jan 27, 2020 11:02:25 AM
 * 
 */

public class Person {
	String id;
	String name;
	int age;
	
	@Override
	// use id,name,age to check equals or not
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}


	// use id to check equals or not
	public boolean equals_id(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	public Person(String id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public static void main(String[] args) {
		
		Person mary = new Person("001567001", "mary", 22);
		Person rose = new Person("001567001", "rose", 22);
		System.out.println("mary==rose is " + (mary==rose));
		System.out.println("mary.equals(rose) is "+ mary.equals(rose));
	}

}
