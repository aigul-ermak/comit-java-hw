package org.comit.course._13_practice;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Exercise5 {
	public static void main(String[] args) {

		SortedSet<String> colours = new TreeSet<>(Set.of("Red", "Blue", "Green", "Black", "White"));

		colours.headSet("Hello");

		System.out.println(colours.headSet("Hello"));
	}

}
