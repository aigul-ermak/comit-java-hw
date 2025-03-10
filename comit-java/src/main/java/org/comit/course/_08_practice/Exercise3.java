package org.comit.course._08_practice;

import java.util.ArrayList;
import java.util.List;

class Student {

	String name;
	int grade;

	List<String> courses;

	Student(String name, int grade) {
		this.name = name;
		this.grade = grade;

		this.courses = new ArrayList<>();
	}

	void add(String course) {
		this.courses.add(course);
	}

	void remove(String course) {
		this.courses.remove(course);
	}

	@Override
	public String toString() {
		return String.format("Student [name=%s, grade=%s, courses=%s]", name, grade, courses);
	}

}

public class Exercise3 {
	public static void main(String[] args) {

		Student student = new Student("Student 1", 1);

		student.add("Math");
		student.add("Physics");
		student.add("Chemistry");
		student.add("Biology");

		System.out.println(student);

		student.remove("Chemistry");
		System.out.println(student);

	}
}
