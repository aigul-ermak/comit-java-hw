package org.comit.course._12_practice;

import java.util.ArrayList;
import java.util.List;

public class Exercise3 {
	public static void main(String[] args) {

		List<String> list = new ArrayList<>(List.of("Red", "Blue", "Green", "Yellow"));

		list.add(0, "Hello"); // inserts an element at index 0

		System.out.println(list);
	}
}
