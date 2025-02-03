package org.comit.course._04_practice;
import java.util.Arrays;

public class hw6_reverseArray {
	 public static void main(String[] args) {
	        int[] numbers = {7, 3, 6, 2, 8, 1, 5, 4, 9, 10}; // Sample array

	        System.out.println("Original array: " + Arrays.toString(numbers));

	        // Reverse the array inside main
	        int left = 0;
	        int right = numbers.length - 1;

	        while (left < right) {
	            // Swap elements
	            int temp = numbers[left];
	            numbers[left] = numbers[right];
	            numbers[right] = temp;

	            // Move pointers
	            left++;
	            right--;
	        }

	        System.out.println("Reversed array: " + Arrays.toString(numbers));
	    }
}
