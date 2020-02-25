package javastudy.yf.ch10;

/**
*
* Copyright 2020 YF Studio
*
* All right reserved.
* 
* Created on Feb 25, 2020 6:07:05 AM
* 
*/
public class AnimalKeeper {
	
	public void feed(Animal animal) {
		animal.feed();
	}

	public static void main(String[] args) {
		AnimalKeeper animalKeeper = new AnimalKeeper();
		// feed dog
		Dog dog = new Dog();
		animalKeeper.feed(dog);
		Puppy puppy = new Puppy();
		animalKeeper.feed(puppy);
		Cat cat = new Cat();
		animalKeeper.feed(cat);
		

	}

}
