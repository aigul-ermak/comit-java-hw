package org.comit.course._10_practice;

abstract class Vehicle {

	abstract void startEngine();

	abstract void stopEngine();
}

class Car extends Vehicle {

	@Override
	void startEngine() {
		System.out.println("Car starts engine");
	}

	@Override
	void stopEngine() {
		System.out.println("Car stops engine");
	}
}

class Motorcycle extends Vehicle {

	@Override
	void startEngine() {
		System.out.println("Motorcycle starts engine");
	}

	@Override
	void stopEngine() {
		System.out.println("Motorcycle stops engine");
	}
}

public class Exercise5 {

	public static void main(String[] args) {

		Vehicle car = new Car();
		car.startEngine();
		car.stopEngine();

		Vehicle motorcycle = new Motorcycle();
		motorcycle.startEngine();
		motorcycle.stopEngine();
		
		
	}

}