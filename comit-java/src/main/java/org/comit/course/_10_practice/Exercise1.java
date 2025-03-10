package org.comit.course._10_practice;

interface Shape {
	double getArea();
}

class Square implements Shape {

	double side;

	Square(double side) {
		this.side = side;
	}

	@Override
	public double getArea() {
		return Math.pow(side, 2);
	}
}

class Circle implements Shape {

	double radious;

	Circle(double radious) {
		this.radious = radious;
	}

	@Override
	public double getArea() {
		return Math.PI * Math.pow(radious, 2); // Area = πr²
	}
}

class Triangle implements Shape {

	double base;
	double height;

	Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}

	@Override
	public double getArea() {
		return (base * height) / 2; // Area = (b * h) /2
	}
}

public class Exercise1 {
	public static void main(String[] args) {

		/*
		 * The following use the interface as type for the variables because it is
		 * recommended to use the abstraction as type as it offers more flexibility.
		 */

		Shape square = new Square(10);
		System.out.println(square.getArea());

		Shape circle = new Circle(10);
		System.out.println(circle.getArea());

		Shape triangle = new Triangle(7, 5);
		System.out.println(triangle.getArea());

	}

}
