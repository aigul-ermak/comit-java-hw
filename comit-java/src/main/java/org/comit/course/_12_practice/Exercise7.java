package org.comit.course._12_practice;

import java.util.List;

public class Exercise7 {
	public static void main(String[] args) {

		List<String> list = List.of("Red", "Blue", "Green", "Yellow");

		String key = "Green";

		boolean found = false;

		for (String str : list) {

			if (key.equals(str)) {
				found = true;
				break;
			}
		}

		if (found) {
			System.out.printf("Element '%s' was found on the list.%n", key);
		} else {
			System.out.printf("Element '%s' was not found on the list.%n", key);
		}
	}
}
