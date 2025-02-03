package org.comit.course._05_practice;
import java.util.Scanner;

public class hw4_averageOfTenNumbers {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int sum = 0;
	        int count = 10; // Number of integers to be entered

	        System.out.println("Enter 10 integer numbers:");

	        // Loop to read 10 numbers from the user
	        for (int i = 1; i <= count; i++) {
	            System.out.print("Enter number " + i + ": ");
	            int num = scanner.nextInt();
	            sum += num; // Add each number to the sum
	        }

	        // Calculate the average
	        double average = (double) sum / count;

	        // Print the result
	        System.out.println("The average of the entered numbers is: " + average);

	        scanner.close();
	    }
}
