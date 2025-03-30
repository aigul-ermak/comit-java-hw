package org.comit.course._17_practice;

import java.util.ArrayList;
import java.util.List;

public class Exercise5 {
	public static void main(String[] args) {

		List<String> list = new ArrayList<>(List.of("Hello", "I", "love", "coding", "in", "Java"));

		list.replaceAll(str -> str.toUpperCase());
		System.out.println(list);

		list.replaceAll(str -> str.toLowerCase());
		System.out.println(list);
	}
}
