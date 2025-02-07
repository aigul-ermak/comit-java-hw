package org.comit.course._06_practice;

public class Circle {

	private double radius;

	// Constructor
	public Circle(double radius) {
		this.radius = radius;
	}

	// Getter for radius
	public double getRadius() {
		return radius;
	}

	// Setter for radius
	public void setRadius(double radius) {
		this.radius = radius;
	}

	// Method to calculate area
	public double calculateArea() {
		return Math.PI * radius * radius;
	}

	// Method to calculate circumference
	public double calculateCircumference() {
		return 2 * Math.PI * radius;
	}

}
