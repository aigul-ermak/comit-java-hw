package org.comit.course._04_practice;

public class hw11_stringEndsWith {
	 public static void main(String[] args) {
	        String str = "I love coding in Java"; // Sample string
	        String suffix = "ava"; // Suffix to check

	        // Check if the string ends with the given suffix
	        if (str.endsWith(suffix)) {
	            System.out.println("The string ends with \"" + suffix + "\".");
	        } else {
	            System.out.println("The string does not end with \"" + suffix + "\".");
	        }
	    }
}
