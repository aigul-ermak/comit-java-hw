package org.comit.course._04_practice;

public class hw4_findIndexArray {
	public static void main(String[] args) {
		int[] numbers = { 7, 3, 6, 2, 8, 1, 5, 4, 9, 10 }; // Sample array
		int target = 4; // Value to search for
		int index = -1; // Default index if value is not found

		// Loop through the array to find the index of the value
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == target) {
				index = i; // Store the index
				break; // Exit loop once found
			}
		}

		// Print the result
		if (index != -1) {
			System.out.println("The value " + target + " is found at index: " + index);
		} else {
			System.out.println("The value " + target + " is not found in the array.");
		}
	}
}
