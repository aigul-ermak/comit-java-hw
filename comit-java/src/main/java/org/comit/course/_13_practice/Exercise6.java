package org.comit.course._13_practice;

import java.util.Set;

public class Exercise6 {
	public static void main(String[] args) {

		Set<String> set1 = Set.of("Red", "Blue", "Green", "Black", "White");
		Set<String> set2 = Set.of("Red", "Blue", "Green", "Black", "White");

		if (set1.size() == set2.size() && set1.containsAll(set2)) {
			System.out.println("The sets are equal");
		} else {
			System.out.println("The sets are not equal");
		}
	}

}
