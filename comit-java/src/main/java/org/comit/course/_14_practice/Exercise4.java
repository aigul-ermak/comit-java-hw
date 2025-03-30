package org.comit.course._14_practice;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;


public class Exercise4 {
	public static void main(String[] args) {

		SortedMap<Integer,String> map = new TreeMap<>(Map.of(0, "Red", 1, "Blue", 2, "Green", 3, "White", 4, "Black"));
		
		System.out.println( map.subMap(2, 5) );
	}
}
