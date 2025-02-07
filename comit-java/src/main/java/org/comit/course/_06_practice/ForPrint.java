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
	        
	        Rectangle rect = new Rectangle(5.0, 7.0);

	        // Displaying area and perimeter
	        System.out.println("Area: " + rect.calculateArea());
	        System.out.println("Perimeter: " + rect.calculatePerimeter());
	        
	        Circle circle = new Circle(5.0);
	        
	        // Displaying initial area and circumference
	        System.out.println("Area: " + circle.calculateArea());
	        System.out.println("Circumference: " + circle.calculateCircumference());
	        
	        // Modifying radius
	        circle.setRadius(7.0);
	        
	        // Displaying updated area and circumference
	        System.out.println("Updated Area: " + circle.calculateArea());
	        System.out.println("Updated Circumference: " + circle.calculateCircumference());
	}
}
