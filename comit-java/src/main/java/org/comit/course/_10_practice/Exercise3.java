package org.comit.course._10_practice;

interface Flyable {
	void fly();
}

class Spacecraft implements Flyable {

	@Override
	public void fly() {
		System.out.println("This is a Spacecraft");
	}
}

class Airplane implements Flyable {

	@Override
	public void fly() {
		System.out.println("This is an Airplane");
	}
}

class Helicoper implements Flyable {

	@Override
	public void fly() {
		System.out.println("This is an Helicopter");
	}
}

public class Exercise3 {
	public static void main(String[] args) {

		Flyable spacecraft = new Spacecraft();
		spacecraft.fly();

		Flyable airplane = new Airplane();
		airplane.fly();

		Flyable helicopter = new Helicoper();
		helicopter.fly();
	}
}
