package org.comit.course._14_practice;

import java.util.Map;

public class Exercise2 {
	public static void main(String[] args) {

		Map<Integer,String> map = Map.of(0, "Red", 1, "Blue", 2, "Green", 3, "White");
		
		for ( Integer key: map.keySet() ) {
			
			System.out.println("key: " + key + ", value: " + map.get(key));
		}
	}

}
