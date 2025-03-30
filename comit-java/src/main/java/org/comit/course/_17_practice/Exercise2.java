package org.comit.course._17_practice;

import java.util.function.Predicate;

public class Exercise2 {

	public static void main(String[] args) {

		Predicate<String> check = str -> str.isEmpty();

		System.out.println(check.test("Hello"));
		System.out.println(check.test(""));
	}

}
