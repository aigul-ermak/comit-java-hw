package org.comit.course._08_practice;

import java.util.ArrayList;
import java.util.List;

class Dish {

	String name;
	String description;
	double calories;

	List<String> ingredients;

	Dish(String name, String description, double calories) {
		this.name = name;
		this.description = description;
		this.calories = calories;

		this.ingredients = new ArrayList<>();
	}

	void add(String ingredient) {
		this.ingredients.add(ingredient);
	}

	void remove(String ingredient) {
		this.ingredients.remove(ingredient);
	}

	@Override
	public String toString() {
		return String.format("Dish [name=%s, description=%s, calories=%s, ingredients=%s]", name, description, calories,
				ingredients);
	}

}

public class Exercise4 {
	public static void main(String[] args) {

		Dish dish = new Dish("Dish 1", "Description 1", 1);

		dish.add("Ingredient 1");
		dish.add("Ingredient 2");
		dish.add("Ingredient 3");
		dish.add("Ingredient 4");

		System.out.println(dish);

		dish.remove("Ingredient 3");

		System.out.println(dish);
	}
}
