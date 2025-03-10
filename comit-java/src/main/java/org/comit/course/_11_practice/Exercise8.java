package org.comit.course._11_practice;

public class Exercise8 {
	public static void main(String[] args) {

		String str = "Hello";

		if (!hasVowels(str)) {
			throw new RuntimeException(String.format("The string '%s' doesn't contain vowels", str));
		}

		System.out.println(String.format("The string '%s' contains vowels.", str));
	}

	static boolean hasVowels(String str) {

		for (int i = 0; i < str.length(); i++) {

			char c = str.toLowerCase().charAt(i);

			if ((c == 'a') || (c == 'e') || (c == 'i') || (c == 'o') || (c == 'u')) {
				return true;
			}
		}

		return false;
	}
}
