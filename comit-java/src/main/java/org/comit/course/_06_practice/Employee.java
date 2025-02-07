package org.comit.course._06_practice;

public class Employee {
	private String name;
	private String jobTitle;
	private double salary;

	// Parameterized Constructor
	public Employee(String name, String jobTitle, double salary) {
		this.name = name;
		this.jobTitle = jobTitle;
		this.salary = salary;
	}

	// Method to retrieve salary
	public double getSalary() {
		return salary;
	}

	// Method to update salary
	public void updateSalary(double newSalary) {
		this.salary = newSalary;
	}

	// Method to display employee details
	public void displayEmployeeInfo() {
		System.out.println("Employee Name: " + name + ", Job Title: " + jobTitle + ", Salary: " + salary);
	}
}
