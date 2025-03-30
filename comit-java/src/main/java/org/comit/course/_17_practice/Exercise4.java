package org.comit.course._17_practice;

import java.util.ArrayList;
import java.util.List;

public class Exercise4 {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>(List.of(2, 3, 4, 5, 6, 7, 8, 11));

		list.removeIf(n -> n % 2 == 0);

		System.out.println(list);
	}
}
