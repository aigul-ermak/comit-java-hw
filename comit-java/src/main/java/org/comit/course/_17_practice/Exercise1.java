package org.comit.course._17_practice;

import java.util.function.BiFunction;

public class Exercise1 {
	public static void main(String[] args) {

		BiFunction<Integer, Integer, Integer> sum = (a, b) -> a + b;

		System.out.println(sum.apply(4, 7));
	}
}
