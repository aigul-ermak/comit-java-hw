package org.comit.course._05_practice;
import java.util.Scanner;

public class hw1_sumNest100Numbers {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for an integer
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        int sum = 0;

        // Sum the next 100 numbers including the given number
        for (int i = 0; i < 100; i++) {
            sum += num + i;
        }

        // Display the result
        System.out.println("The sum of the next 100 numbers including " + num + " is: " + sum);

        scanner.close(); // Close the scanner
    }
}
