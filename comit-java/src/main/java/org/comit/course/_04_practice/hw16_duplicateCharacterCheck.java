package org.comit.course._04_practice;
import java.util.HashSet;

public class hw16_duplicateCharacterCheck {
	 public static void main(String[] args) {
	        String str = "I love coding in Java"; // Sample string
	        str = str.replace(" ", "").toLowerCase(); // Remove spaces and convert to lowercase

	        HashSet<Character> charSet = new HashSet<>();
	        boolean hasDuplicate = false;

	        // Loop through each character in the string
	        for (char ch : str.toCharArray()) {
	            if (charSet.contains(ch)) {
	                hasDuplicate = true;
	                break; // Stop checking if a duplicate is found
	            }
	            charSet.add(ch);
	        }

	        // Print the result
	        if (hasDuplicate) {
	            System.out.println("The string has duplicate characters.");
	        } else {
	            System.out.println("The string does not have duplicate characters.");
	        }
	    }
}
