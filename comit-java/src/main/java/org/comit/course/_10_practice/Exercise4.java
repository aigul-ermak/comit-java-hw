package org.comit.course._10_practice;

abstract class WildAnimal {

	abstract void sound();
}

class Lion extends WildAnimal {

	@Override
	void sound() {
		System.out.println("Lion Sound!");
	}
}

class Tiger extends WildAnimal {

	@Override
	void sound() {
		System.out.println("Tiger Sound!");
	}
}

public class Exercise4 {
	public static void main(String[] args) {

		WildAnimal lion = new Lion();
		lion.sound();

		WildAnimal tiger = new Tiger();
		tiger.sound();
	}

}
