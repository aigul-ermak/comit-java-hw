package org.comit.course._18_practice;

import java.util.ArrayList;
import java.util.List;

public class Exercise3 {
	public static void main(String[] args) {

		List<String> colours = new ArrayList<>(List.of("Red", "Blue", "Green", "White"));

		colours.sort(String::compareTo);
	}

}
