package org.comit.course._04_practice;

public class hw3_arrayContainsValue {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7 }; // Sample array
		int target = 5; // Value to search for

		boolean found = false;

		// Loop through the array to check for the value
		for (int num : numbers) {
			if (num == target) {
				found = true;
				break; // Exit loop early if found
			}
		}

		// Print the result
		if (found) {
			System.out.println("The array contains the value " + target + ".");
		} else {
			System.out.println("The array does not contain the value " + target + ".");
		}
	}
}
