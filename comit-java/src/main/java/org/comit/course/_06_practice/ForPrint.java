package org.comit.course._06_practice;

public class ForPrint {
	public static void main(String[] args) {
		
		Person person1 = new Person("John Doe", 25);

		// Displaying person details
		person1.displayPersonInfo();
		
		 Dog dog1 = new Dog("Buddy", "Golden Retriever");
	        Dog dog2 = new Dog("Max", "German Shepherd");

	        // Display initial details
	        dog1.displayDogInfo();
	        dog2.displayDogInfo();

	        // Modifying attributes using setters
	        dog1.setName("Charlie");
	        dog1.setBreed("Labrador Retriever");

	        dog2.setName("Rocky");
	        dog2.setBreed("Bulldog");

	        // Display updated details
	        System.out.println("Updated Dog Details:");
	        dog1.displayDogInfo();
	        dog2.displayDogInfo();
	}
}
