package org.hw.comit_java.course._02_practice;

public class hw9_radius {
	public static void main(String[] args) {
		double radius = 7.5;
		double area = Math.PI * radius * radius;
		double perimeter = 2 * Math.PI * radius;

		System.out.println("The area of the circle with radius " + radius + " is: " + area);
		System.out.println("The perimeter of the circle with radius " + radius + " is: " + perimeter);
	}
}
