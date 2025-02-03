package org.comit.course._04_practice;

public class hw14_alphabetIndexes {
	public static void main(String[] args) {
		String str = "The quick brown fox jumps over the lazy dog."; // Sample string

		System.out.println("Indexes of alphabet characters in the string:");

		// Loop through each character in the string
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			// Check if the character is a letter
			if (Character.isLetter(ch)) {
				System.out.println("Character '" + ch + "' at index " + i);
			}
		}
	}
}
