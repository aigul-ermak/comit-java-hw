package org.comit.course._05_practice;
import java.util.Scanner;

public class hw3_compareNumbers {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter two numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Compare numbers and print the result
        if (num1 > num2) {
            System.out.println("The largest number is: " + num1);
            System.out.println("The smallest number is: " + num2);
        } else if (num2 > num1) {
            System.out.println("The largest number is: " + num2);
            System.out.println("The smallest number is: " + num1);
        } else {
            System.out.println("Both numbers are equal.");
        }

        scanner.close();
    }
}
