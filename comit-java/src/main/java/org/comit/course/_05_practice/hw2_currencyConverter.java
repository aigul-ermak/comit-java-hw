package org.comit.course._05_practice;
import java.util.Scanner;

public class hw2_currencyConverter {
	public static void main(String[] args) {
        // Current exchange rate: 1 CAD = 0.6866 USD (as of February 3, 2025)
        double exchangeRate = 0.6866;

        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the amount in CAD
        System.out.print("Enter the amount in Canadian dollars (CAD): ");
        double amountInCAD = scanner.nextDouble();

        // Convert the amount to USD
        double amountInUSD = amountInCAD * exchangeRate;

        // Display the result
        System.out.printf("Equivalent amount in US dollars (USD): $%.2f%n", amountInUSD);

        scanner.close();
    }
}
