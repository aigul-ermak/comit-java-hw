package org.comit.course._09_practice;

class Printer {

	// the final keyword creates a constant
	final int id;

	public Printer(int id) {
		this.id = id;
	}

	// the final keyword prevents the method display() to be overridden.
	final void display() {
		System.out.println("The class is name: " + this.getClass().getName());
	}
}

public class Exercise3 {
	public static void main(String[] args) {

		Printer printer = new Printer(7);

		printer.display();
	}
}
