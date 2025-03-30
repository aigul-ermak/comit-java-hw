package org.comit.course._17_practice;

import java.util.function.Function;

public class Exercise6 {
	public static void main(String[] args) {

		Function<Integer, Integer> factorial = n -> {

			int fact = 1;

			for (int i = 1; i <= n; i++) {
				fact *= i;
			}
			;

			return fact;
		};

		System.out.println("Factorial of 5 is: " + factorial.apply(5));
	}
}
