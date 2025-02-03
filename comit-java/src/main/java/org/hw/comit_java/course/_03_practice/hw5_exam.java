package org.hw.comit_java.course._03_practice;

public class hw5_exam {
	public static void main(String[] args) {
		int classesHeld = 9;
		int classesAttended = 6;

		// Calculate attendance percentage
		double attendancePercentage = ((double) classesAttended / classesHeld) * 100;

		// Print the attendance percentage
		System.out.println("Attendance Percentage: " + attendancePercentage + "%");

		// Check eligibility
		if (attendancePercentage >= 75) {
			System.out.println("The student is allowed to sit in the exam.");
		} else {
			System.out.println("The student is NOT allowed to sit in the exam.");
		}
	}
}
