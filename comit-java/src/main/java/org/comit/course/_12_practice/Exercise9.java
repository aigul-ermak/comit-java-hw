package org.comit.course._12_practice;

import java.util.ArrayList;
import java.util.List;

public class Exercise9 {
	public static void main(String[] args) {

		List<String> list1 = new ArrayList<>(List.of("Red", "Blue", "Green", "Yellow"));

		List<String> list2 = new ArrayList<>(list1); // copies list1 to list2

		System.out.println(list1);
		System.out.println(list2);
	}
}
