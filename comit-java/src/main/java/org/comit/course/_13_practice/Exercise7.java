package org.comit.course._13_practice;

import java.util.LinkedHashSet;
import java.util.Set;

public class Exercise7 {
	public static void main(String[] args) {

		// LinkedHashSet keeps the insertion order.
		Set<String> set = new LinkedHashSet<>();

		set.add("Red");
		set.add("Blue");
		set.add("Green");
		set.add("White");

		System.out.println(set);

	}
}
