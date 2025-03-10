package org.comit.course._13_practice;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exercise4 {
	public static void main(String[] args) {

		List<String> colours = List.of("Red", "Blue", "Green", "Blue", "Red", "White");

		Set<String> set = new HashSet<>(colours);

		System.out.println(set);
	}
}
