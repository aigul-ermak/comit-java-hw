package org.comit.course._17_practice;

import java.util.function.Predicate;

public class Exercise9 {
	public static void main(String[] args) {

		Predicate<String> palindrome = str -> str.equals(new StringBuilder(str).reverse().toString());

		System.out.println(palindrome.test("radar"));
		System.out.println(palindrome.test("hello"));
	}
}
