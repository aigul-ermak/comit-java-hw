package org.comit.course._05_practice;
import java.util.Scanner;

public class hw5_quessTheNumber {
	public static void main(String[] args) {
        // Generate a random number between 1 and 20
        int randomNumber = (int) (Math.random() * 20) + 1;
        Scanner scanner = new Scanner(System.in);
        int attempts = 3;
        boolean guessedCorrectly = false;

        System.out.println("I have selected a number between 1 and 20. You have 3 chances to guess it.");

        // Loop for 3 attempts
        for (int i = 1; i <= attempts; i++) {
            System.out.print("Attempt " + i + ": Enter your guess: ");
            int userGuess = scanner.nextInt();

            if (userGuess == randomNumber) {
                System.out.println("Congratulations! You guessed the number correctly.");
                guessedCorrectly = true;
                break;
            } else if (userGuess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }

        // Reveal the number if the user did not guess it
        if (!guessedCorrectly) {
            System.out.println("Sorry! The correct number was: " + randomNumber);
        }

        scanner.close();
    }
}
