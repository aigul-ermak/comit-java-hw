package org.comit.course._15_practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise2 {
	public static void main(String[] args) {

		List<Integer> nums = new ArrayList<>(List.of(3, 7, 14, 12, 8, 10, 20, 15, 4));

		// Sort the List to be able to use binarySearch()
		Collections.sort(nums);

		// Search for value=12 on the list, returns the index.
		System.out.println(Collections.binarySearch(nums, 12));
	}
}
