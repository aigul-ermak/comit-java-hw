package org.comit.course._18_practice;

import java.util.function.Consumer;

public class Exercise1 {

	static void doSomething(String str) {

		System.out.println("I am doing something " + str);
	}

	public static void main(String[] args) {

		Consumer<String> con = Exercise1::doSomething;

		con.accept("Hello");
	}

}
