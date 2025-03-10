package org.comit.course._11_practice;

import java.util.Scanner;

public class Exercise7 {
public static void main(String[] args) {
		
		int[] nums = new int[10];
		
		System.out.println("Please input 10 numbers: ");

		try(Scanner scan = new Scanner(System.in)) {
				
			for (int i = 0; i < nums.length; i++) {
				System.out.println("Please input number #" + (i + 1) + ": ");
				nums[i] = scan.nextInt();
			}
		}
		
        try {
        	process(nums);
        	System.out.println("No duplicates found!");
        } 
        catch(Exception ex) {
        	System.out.println("Exception caught!");
        	ex.printStackTrace();
        }
	}
	
	static void process(int[] nums) throws Exception{
	
		/*
		 * We can optimize the following code using a HashSet but we haven't learned that yet.
		 */
		for (int i = 0; i < nums.length-1; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					throw new Exception(String.format("%d was found more than one time", nums[i]));
				}
			}
		}
	}
}
