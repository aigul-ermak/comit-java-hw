package org.comit.course._17_practice;

import java.util.function.Function;

public class Exercise8 {

	public static void main(String[] args) {

		String sentence = "I love coding in Java";

		Function<String, Integer> count = str -> str.split(" ").length;

		System.out.println(count.apply(sentence));
	}

}
