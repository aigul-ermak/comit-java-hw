package org.comit.course._12_practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise10 {
	public static void main(String[] args) {

		List<String> list = new ArrayList<>(List.of("Red", "Blue", "Green", "Yellow"));

		/*
		 * The Collections class utility class has many useful utility methods like
		 * sort() and shuffle().
		 * 
		 * Don't confuse the Collections class with the Collection interface.
		 */
		Collections.shuffle(list);

		System.out.println(list);
	}
}
