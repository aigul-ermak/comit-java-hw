package org.comit.course._13_practice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Exercise3 {
	public static void main(String[] args) {

		/*
		 * Set.of() creates an unmodifiable set. We use the HashSet constructor to
		 * create a set we can modify.
		 */
		Set<String> set = new HashSet<>(Set.of("Red", "Blue", "Green", "Black", "White"));

		/*
		 * We loop the set with an iterator to be able to remove elements while
		 * iterating.
		 */
		Iterator<String> ite = set.iterator();

		while (ite.hasNext()) {

			if (ite.next().startsWith("B")) {
				ite.remove();
			}
		}

		System.out.println(set);
	}
}
