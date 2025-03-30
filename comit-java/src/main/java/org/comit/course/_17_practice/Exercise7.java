package org.comit.course._17_practice;

import java.util.function.BiFunction;

public class Exercise7 {
	public static void main(String[] args) {

		BiFunction<String, String, String> concat = (str1, str2) -> str1 + str2;

		System.out.println(concat.apply("Hello", "Java"));
	}
}
