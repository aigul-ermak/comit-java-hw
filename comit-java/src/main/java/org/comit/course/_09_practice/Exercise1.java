package org.comit.course._09_practice;

class Animal {

	String name;

	public Animal(String name) {

		this.name = name;
	}
}

class Dog extends Animal {

	String breed;

	public Dog(String name, String breed) {

		super(name);
		this.breed = breed;
	}

	@Override
	public String toString() {
		return String.format("Dog [name=%s, breed=%s]", name, breed);
	}

}

public class Exercise1 {
	public static void main(String[] args) {

		Dog dog = new Dog("Sam", "Labrador");

		System.out.println(dog);

	}
}
