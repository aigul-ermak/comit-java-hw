package org.comit.course._16_practice;

import java.util.Map;

class PrintMap {

	static <K, V> void print(Map<K, V> map) {

		for (K key : map.keySet()) {
			System.out.println("K: " + key + ", V: " + map.get(key));
		}
	}
}

public class Exersice6 {
	public static void main(String[] args) {

		Map<Integer, String> map = Map.of(1, "Hello", 2, "I", 3, "love", 4, "coding", 5, "in", 6, "Java");

		PrintMap.print(map);
	}
}
