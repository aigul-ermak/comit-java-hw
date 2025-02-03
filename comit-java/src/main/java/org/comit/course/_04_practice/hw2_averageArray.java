package org.comit.course._04_practice;

public class hw2_averageArray {
	public static void main(String[] args) {
		int[] array = { 7, 3, 6, 2, 8, 1, 5, 4, 9, 10 };
		int sum = 0;
		int length = array.length; // Number of elements in the array

		// Loop through the array to calculate the sum
		for (int num : array) {
			sum += num;
		}

		// Calculate the average
		double average = (double) sum / length;

		// Print the average value
		System.out.println("The average value of the array elements is: " + average);
	}
}
