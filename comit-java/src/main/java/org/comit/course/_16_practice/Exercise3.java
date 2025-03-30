package org.comit.course._16_practice;

import java.util.List;

class SearchList {

	static <T> int search(List<T> list, T key) {

		for (int i = 0; i < list.size(); i++) {

			if (list.get(i).equals(key)) {
				return i;
			}
		}

		return -1;
	}
}

public class Exercise3 {
	public static void main(String[] args) {

		List<String> list = List.of("Hello", "I", "love", "coding", "in", "Java");

		System.out.println(SearchList.search(list, "coding"));
		System.out.println(SearchList.search(list, "random"));
	}

}
