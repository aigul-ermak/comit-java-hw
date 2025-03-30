package org.comit.course._15_practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

class Person implements Comparable<Person> {

	int id;
	String name;

	Person(int id) {
		this.id = id;
	}

	Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return id == other.id && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return String.format("Person [id=%s, name=%s]", id, name);
	}

	@Override
	public int compareTo(Person p) {
		return Integer.compare(this.id, p.id);
	}
}

public class Exercise3 {
	public static void main(String[] args) {

		List<Person> persons = new ArrayList<>(
				List.of(new Person(4, "John"), new Person(1, "Jane"), new Person(7, "Mike"), new Person(3, "Lily")));

		// Sort the List to be able to use binarySearch()
		Collections.sort(persons);

		// Search for id=7 on the list, returns the index.
		System.out.println(Collections.binarySearch(persons, new Person(7)));
	}
}
