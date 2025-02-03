package org.hw.comit_java.course._03_practice;

public class hw2_greatestNumber {
	public static void main(String[] args) {
		int num1 = 48;
		int num2 = 12;
		int num3 = 37;

		int greatest;

		if (num1 >= num2 && num1 >= num3) {
			greatest = num1;
		} else if (num2 >= num1 && num2 >= num3) {
			greatest = num2;
		} else {
			greatest = num3;
		}

		System.out.println("The greatest number is: " + greatest);
	}
}
