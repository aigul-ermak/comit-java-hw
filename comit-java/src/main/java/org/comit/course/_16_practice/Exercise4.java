package org.comit.course._16_practice;

import java.util.ArrayList;
import java.util.List;

class ReverseList{
	
	static <T> List<T> reverse(List<T> list) {
		
		List<T> rev = new ArrayList<>();
		
		for( int i=list.size()-1; i >=0; i-- ) {
			
			rev.add(list.get(i));
		}
		
		return rev;
	}
}

public class Exercise4 {
	public static void main(String[] args) {

		List<String> list = List.of("Hello", "I", "love", "coding", "in", "Java");
		
		System.out.println( ReverseList.reverse(list) );
	}
}
