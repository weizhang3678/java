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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	// use it to check equals or not
	public boolean equals(Object obj) {
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
