package org.comit.course._16_practice;

import java.util.List;

class CompareList {

	static <T> boolean compare(List<T> list1, List<T> list2) {

		if (list1.size() != list2.size()) {
			return false;
		}

		for (int i = 0; i < list1.size(); i++) {

			if (!list1.get(i).equals(list2.get(i))) {
				return false;
			}
		}

		return true;
	}
}

public class Exercise2 {
	public static void main(String[] args) {

		List<String> list1 = List.of("Hello", "I", "love", "coding", "in", "Java");
		List<String> list2 = List.of("Hello", "I", "love", "coding", "in", "Java");

		System.out.println(CompareList.compare(list1, list2));
	}

}
