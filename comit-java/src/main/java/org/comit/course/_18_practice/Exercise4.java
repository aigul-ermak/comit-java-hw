package org.comit.course._18_practice;

import java.util.function.BiFunction;

public class Exercise4 {
	public static void main(String[] args) {

		BiFunction<Integer, Integer, Integer> max = Integer::max;

		System.out.println(max.apply(47, 73));
	}

}
