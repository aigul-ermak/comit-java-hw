package org.comit.course._11_practice;

class MyNewClass {

	/*
	 * The protected access modifier makes an attribute visible within the package
	 * and visible from other packages through inheritance.
	 */

	protected String str;

	MyNewClass(String str) {
		this.str = str;
	}

	@Override
	public String toString() {
		return String.format("MyNewClass [str=%s]", str);
	}

}

public class Exercise2 {
	public static void main(String[] args) {

		MyNewClass obj = new MyNewClass("Hello");
		System.out.println(obj);
	}
}
