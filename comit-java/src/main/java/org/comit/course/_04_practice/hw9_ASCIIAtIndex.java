package org.comit.course._04_practice;

public class hw9_ASCIIAtIndex {
	public static void main(String[] args) {
        String str = "I love coding in Java"; // Sample string

        // Check if the string is long enough
        if (str.length() > 8) {
            char ch = str.charAt(8); // Get the character at index 8
            int ascii = (int) ch; // Convert character to ASCII code

            System.out.println("The character at index 8 is: " + ch);
            System.out.println("The ASCII code of the character is: " + ascii);
        } else {
            System.out.println("The string is too short to access index 8.");
        }
    }
}
