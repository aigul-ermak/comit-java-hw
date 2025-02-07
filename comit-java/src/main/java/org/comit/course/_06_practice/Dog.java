package org.comit.course._06_practice;

public class Dog {
	private String name;
	private String breed;

	// Constructor
	public Dog(String name, String breed) {
		this.name = name;
		this.breed = breed;
	}

	// Getter for name
	public String getName() {
		return name;
	}

	// Setter for name
	public void setName(String name) {
		this.name = name;
	}

	// Getter for breed
	public String getBreed() {
		return breed;
	}

	// Setter for breed
	public void setBreed(String breed) {
		this.breed = breed;
	}

	// Method to display dog details
	public void displayDogInfo() {
		System.out.println("Dog Name: " + name + ", Breed: " + breed);
	}

}
