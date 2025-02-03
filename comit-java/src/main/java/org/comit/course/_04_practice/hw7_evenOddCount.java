package org.comit.course._04_practice;

public class hw7_evenOddCount {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // Sample array

		int evenCount = 0;
		int oddCount = 0;

		// Loop through the array to count even and odd numbers
		for (int num : numbers) {
			if (num % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
		}

		// Print the results
		System.out.println("Number of even integers: " + evenCount);
		System.out.println("Number of odd integers: " + oddCount);
	}
}
