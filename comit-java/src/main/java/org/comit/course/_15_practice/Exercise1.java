package org.comit.course._15_practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise1 {
	public static void main(String[] args) {

		List<Integer> nums = new ArrayList<>(List.of(3, 7, 14, 12, 8, 10, 20, 15, 4));

		Collections.sort(nums);

		System.out.println(nums);
	}

}
