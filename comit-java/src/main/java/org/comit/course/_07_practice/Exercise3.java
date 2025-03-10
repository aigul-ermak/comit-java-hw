package org.comit.course._07_practice;

class MyShape {

	double calculateArea() {
		return 0;
	}
}

class MyCircle extends MyShape {

	double radius;

	MyCircle(double radius) {
		this.radius = radius;
	}

	@Override
	double calculateArea() {

		return Math.PI * Math.pow(this.radius, 2); // Area = πr²
	}

}

class MyRectangle extends MyShape {

	double length;
	double width;

	MyRectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	@Override
	double calculateArea() {

		return this.length * this.width; // Area = length * width
	}

}

class MyTriangle extends MyShape {

	double base;
	double height;

	MyTriangle(double base, double height) {
		this.base = base;
		this.height = height;
	}

	@Override
	double calculateArea() {

		return (this.base * this.height) / 2; // Area = (base x height)/2
	}

}

public class Exercise3 {
	public static void main(String[] args) {

		MyCircle circle = new MyCircle(4.7);
		System.out.printf("The area of the circle is: %.3f %n", circle.calculateArea());

		MyRectangle rectangle = new MyRectangle(4.3, 7.8);
		System.out.println("The area of the rectangle is: " + rectangle.calculateArea());

		MyTriangle triangle = new MyTriangle(4.3, 7.8);
		System.out.println("The area of the triangle is: " + triangle.calculateArea());
	}
}
