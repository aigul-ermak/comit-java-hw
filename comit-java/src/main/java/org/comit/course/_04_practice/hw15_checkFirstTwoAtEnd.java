package org.comit.course._04_practice;

public class hw15_checkFirstTwoAtEnd {
	 public static void main(String[] args) {
	        String str = "educated"; // Sample string

	        // Check if the string has at least 2 characters
	        if (str.length() < 2) {
	            System.out.println("The string is too short to perform the check.");
	        } else {
	            String firstTwo = str.substring(0, 2); // Extract the first two characters
	            String lastTwo = str.substring(str.length() - 2); // Extract the last two characters

	            // Compare first two and last two characters
	            if (firstTwo.equals(lastTwo)) {
	                System.out.println("The first two characters appear at the end of the string.");
	            } else {
	                System.out.println("The first two characters do not appear at the end of the string.");
	            }
	        }
	    }
}
