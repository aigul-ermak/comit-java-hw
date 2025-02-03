package org.comit.course._04_practice;

public class hw13_stringComparison {
	public static void main(String[] args) {
		String str1 = "I love coding in Java";
		String str2 = "I Love Coding In Java";

		// Compare strings ignoring case
		if (str1.equalsIgnoreCase(str2)) {
			System.out.println("The strings are equal (ignoring case).");
		} else {
			System.out.println("The strings are not equal.");
		}
	}
}
