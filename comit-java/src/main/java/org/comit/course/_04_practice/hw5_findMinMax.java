package org.comit.course._04_practice;

public class hw5_findMinMax {
	public static void main(String[] args) {
		int[] numbers = { 7, 3, 6, 2, 8, 1, 5, 4, 9, 10}; // Sample array

		// Initialize min and max with the first element
		int min = numbers[0];
		int max = numbers[0];

		// Loop through the array to find min and max
		for (int num : numbers) {
			if (num < min) {
				min = num;
			}
			if (num > max) {
				max = num;
			}
		}

		// Print the results
		System.out.println("Minimum value: " + min);
		System.out.println("Maximum value: " + max);
	}
}
