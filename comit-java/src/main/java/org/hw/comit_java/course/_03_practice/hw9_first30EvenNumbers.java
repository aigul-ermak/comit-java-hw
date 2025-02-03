package org.hw.comit_java.course._03_practice;

public class hw9_first30EvenNumbers {
	public static void main(String[] args) {
		int count = 0; // Counter for even numbers
		int num = 2; // Starting number (first even number)

		System.out.println("First 30 even numbers:");

		while (count < 30) {
			System.out.print(num + " ");
			num += 2; // Move to the next even number
			count++; // Increase the count
		}
	}
}
