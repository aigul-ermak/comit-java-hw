package org.comit.course._12_practice;

import java.util.List;

public class Exercise5 {
	public static void main(String[] args) {

		List<String> list = List.of("Red", "Blue", "Green", "Yellow");

		list.set(1, "Hello"); // Replaces element at index 1 with "Hello"

		System.out.println(list);
	}
}
