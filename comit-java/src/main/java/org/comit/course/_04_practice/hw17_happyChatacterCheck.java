package org.comit.course._04_practice;

public class hw17_happyChatacterCheck {
	public static void main(String[] args) {
		String str = "azzlea"; // Sample string
		char target = 'z'; // Character to check
		boolean isHappy = false;

		// Loop through the string to check if 'z' is happy
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == target) {
				// Check if 'z' has the same character to its left or right
				if ((i > 0 && str.charAt(i - 1) == target) || (i < str.length() - 1 && str.charAt(i + 1) == target)) {
					isHappy = true;
					break; // No need to check further
				}
			}
		}

		// Print the result
		if (isHappy) {
			System.out.println("The character 'z' is happy in the string.");
		} else {
			System.out.println("The character 'z' is not happy in the string.");
		}
	}
}
