package org.comit.course._10_practice;

interface Animal {
	void speak();
}

class Dog implements Animal {

	@Override
	public void speak() {
		System.out.println("The Dog is barking");
	}
}

public class Exercise2 {
	public static void main(String[] args) {

		Animal dog = new Dog();
		dog.speak();
	}
}
