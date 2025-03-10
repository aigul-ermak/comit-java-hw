package org.comit.course._09_practice;

class Calculator {

	static int add(int a, int b) {

		return a + b;
	}

	static int multiply(int a, int b) {

		return a * b;
	}
}

public class Exercise2 {
	public static void main(String[] args) {

		System.out.println("The sum is: " + Calculator.add(4, 7));
		System.out.println("The multiply is: " + Calculator.multiply(4, 7));
	}
}
