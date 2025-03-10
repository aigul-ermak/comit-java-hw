package org.comit.course._11_practice;

public class Exercise3 {
	
	public static void main(String[] args) {

		try {

			throw new RuntimeException("Testing a RuntimeException");

		} catch (Exception e) {
			System.out.println("Exception caught!");
			e.printStackTrace();
		}
	}

}
