package org.comit.course._17_practice;

import java.util.function.Predicate;

public class Exercise10 {
	public static void main(String[] args) {

		Predicate<Integer> square = n -> Math.pow((int) Math.sqrt(n), 2) == n;

		System.out.println(square.test(49));
		System.out.println(square.test(70));
	}

}
