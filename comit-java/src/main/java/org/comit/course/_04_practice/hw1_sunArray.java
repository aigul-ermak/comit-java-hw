package org.comit.course._04_practice;

public class hw1_sunArray {
	 public static void main(String[] args) {
	        int[] array = {7, 3, 6, 2, 8, 1, 5, 4, 9, 10};
	        int sum = 0;

	        // Loop through the array and calculate the sum
	        for (int num : array) {
	            sum += num;
	        }

	        // Print the sum of the array elements
	        System.out.println("The sum of the array elements is: " + sum);
	    }
}
