package org.comit.course._11_practice;

import java.io.InputStream;

class MyFileClass{
	
	void process() throws Exception {
		
		/*
		 *  Use test.txt to test that the file exists.
		 *  Note.- The file test.txt resides in the same package of this class.
		 */
		InputStream is = this.getClass().getResourceAsStream("test1.txt"); 

		if (is != null) {
			System.out.println("File found! ");
		} else {
			throw new Exception("File doesn't exist");
		}
		
	}
	
	void caller() {
		
		try {
			this.process();
		} catch (Exception e) {
			System.out.println("Exception caught!");
			e.printStackTrace();
		}
	}
	
}

public class Exercise5 {
public static void main(String[] args) {
		
		MyFileClass obj = new MyFileClass();
		
		obj.caller();
	}

}
