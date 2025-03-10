package org.comit.course._07_practice;

class Animal {

	void sound() {
		System.out.println("Animal Sound");
	}
}

class Bird extends Animal {

	@Override
	void sound() {
		System.out.println("Bird Sound");
	}
}

class Cat extends Animal {

	@Override
	void sound() {
		System.out.println("Cat Sound");
	}
}

public class Exercise2 {
	public static void main(String[] args) {

		Animal animal = new Animal();
		animal.sound();

		Bird bird = new Bird();
		bird.sound();

		Cat cat = new Cat();
		cat.sound();
	}
}
