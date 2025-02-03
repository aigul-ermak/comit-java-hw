package org.comit.course._04_practice;

public class hw10_sumASCIIValues {
	public static void main(String[] args) {
        String str = "I love coding in Java"; // Sample string
        int sum = 0;

        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            sum += (int) str.charAt(i); // Get ASCII value and add to sum
        }

        // Print the result
        System.out.println("The sum of ASCII values of all characters in the string is: " + sum);
    }
}
