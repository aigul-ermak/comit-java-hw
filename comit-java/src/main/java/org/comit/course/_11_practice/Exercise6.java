package org.comit.course._11_practice;

class MyArrayClass {

	void process(int[] nums) throws Exception {

		for (int num : nums) {

			if (num < 0) {
				throw new Exception("Negative number found: " + num);
			}
		}
	}
}

public class Exercise6 {
	public static void main(String[] args) {

		int[] nums = { 7, 5, 6, 7, 3, -1, 9 };

		MyArrayClass obj = new MyArrayClass();

		try {
			obj.process(nums);
		} catch (Exception e) {
			System.out.println("Exception caught!");
			e.printStackTrace();
		}

	}

}
