package org.comit.course._14_practice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercise1 {
	public static void main(String[] args) {

		List<String> colours = List.of("Red", "Blue", "Green", "White");
		
		Map<Integer,String> map = new HashMap<>();
		
		for (int i = 0; i < colours.size(); i++) {
			map.put(i, colours.get(i));
		}

		System.out.println(map);
		
	}
}
