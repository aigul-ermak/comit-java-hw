package org.comit.course._11_practice;

class MyClass {

	void displayMessage1() {
		System.out.println(" This method is visible within the package only");
	}

	public void displayMessage2() {
		System.out.println(" This method is visible from anywhere within the project");
	}

	private void displayMessage3() {
		System.out.println(" This method is visible within the class only");
	}
}

public class Exercise1 {
	public static void main(String[] args) {

		MyClass obj = new MyClass();
		obj.displayMessage1();
		obj.displayMessage2();
		// obj.displayMessage3(); // displayMessage3() is visible within the class only.
	}
}
