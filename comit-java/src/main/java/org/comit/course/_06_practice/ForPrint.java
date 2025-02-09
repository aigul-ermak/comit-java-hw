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

		Book[] books = new Book[3];

		// Adding three books to the array
		books[0] = new Book("The Catcher in the Rye", "J.D. Salinger", "978-0316769488");
		books[1] = new Book("To Kill a Mockingbird", "Harper Lee", "978-0061120084");
		books[2] = new Book("1984", "George Orwell", "978-0451524935");

		// Looping through the array to display book details
		for (Book book : books) {
			book.display();
		}

		TrafficLight light = new TrafficLight("Red", 30);

		// Display initial status
		light.displayStatus();

		// Change color and display updated status
		light.changeColor();
		light.displayStatus();

		// Check for red or green
		System.out.println("Is red? " + light.isRed());
		System.out.println("Is green? " + light.isGreen());

		Employee emp = new Employee("John Doe", "Software Engineer", 75000.00);

		// Displaying initial details
		emp.displayEmployeeInfo();

		// Updating salary
		emp.updateSalary(80000.00);

		// Displaying updated details
		System.out.println("After salary update:");
		emp.displayEmployeeInfo();
	}
}
