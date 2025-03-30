package org.comit.course._16_practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class MergeList {

	static <T> List<T> merge(List<T> list1, List<T> list2) {

		Iterator<T> ite1 = list1.iterator();
		Iterator<T> ite2 = list2.iterator();

		ArrayList<T> result = new ArrayList<T>();

		while (ite1.hasNext() || ite2.hasNext()) {
			if (ite1.hasNext())
				result.add(ite1.next());
			if (ite2.hasNext())
				result.add(ite2.next());
		}

		return result;

	}
}

public class Exercise5 {
	public static void main(String[] args) {

		List<String> list1 = List.of("Hello", "I", "love", "coding", "in", "Java");
		List<String> list2 = List.of("Hello", "I", "love", "coding");

		System.out.println(MergeList.merge(list1, list2));
	}

}
