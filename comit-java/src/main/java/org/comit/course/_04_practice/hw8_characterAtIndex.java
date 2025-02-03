package org.comit.course._04_practice;

public class hw8_characterAtIndex {
	public static void main(String[] args) {
		String str = "I love coding in Java"; // Sample string

		// Check if the string is long enough
		if (str.length() > 7) {
			char ch = str.charAt(7); // Get the character at index 7
			System.out.println("The character at index 7 is: " + ch);
		} else {
			System.out.println("The string is too short to access index 7.");
		}
	}
}
