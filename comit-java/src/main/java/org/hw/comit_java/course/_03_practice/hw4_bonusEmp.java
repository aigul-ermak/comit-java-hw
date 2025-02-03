package org.hw.comit_java.course._03_practice;

public class hw4_bonusEmp {
	public static void main(String[] args) {
		int years = 8;
		double salary = 65000;
		double bonus = 0;

		// Checking if the employee is eligible for a bonus
		if (years > 5) {
			bonus = salary * 0.05; // 5% of salary
			System.out.println("The employee is eligible for a bonus of: $" + bonus);
		} else {
			System.out.println("The employee is not eligible for a bonus.");
		}
	}
}
