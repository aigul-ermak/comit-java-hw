package org.comit.course._04_practice;

public class hw12_reverseString {
	public static void main(String[] args) {
		String str = "I love coding in Java"; // Sample string
		String reversed = "";

		// Loop through the string in reverse order
		for (int i = str.length() - 1; i >= 0; i--) {
			reversed += str.charAt(i); // Append each character in reverse order
		}

		// Print the reversed string
		System.out.println("Original string: " + str);
		System.out.println("Reversed string: " + reversed);
	}
}
