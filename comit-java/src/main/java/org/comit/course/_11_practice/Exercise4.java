package org.comit.course._11_practice;

class MyTestClass {

	void process(int num) throws Exception {

		if (num % 2 != 0) {
			throw new Exception("Number is Odd!");
		}
	}

	void caller(int num) {

		try {

			this.process(num);
		} catch (Exception e) {
			System.out.println("Exception caught!");
			e.printStackTrace();
		}
	}

}

public class Exercise4 {
	public static void main(String[] args) {

		MyTestClass obj = new MyTestClass();
		obj.caller(7);
	}

}
