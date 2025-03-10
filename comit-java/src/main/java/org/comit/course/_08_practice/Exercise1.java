package org.comit.course._08_practice;

import java.util.ArrayList;
import java.util.List;

class Movie {

	String title;
	String director;

	List<String> actors;
	List<String> reviews;

	public Movie(String title, String director) {
		this.title = title;
		this.director = director;

		this.actors = new ArrayList<>();
		this.reviews = new ArrayList<>();
	}

	void addReview(String review) {

		this.reviews.add(review);
	}

	String getReview(int index) {

		return this.reviews.get(index);
	}

}

public class Exercise1 {
	public static void main(String[] args) {

		Movie movie = new Movie("Movie Title", "Movie Director");

		movie.addReview("Great Movie!");
		movie.addReview("Awesome!");

		System.out.println("Review: " + movie.getReview(1));
	}
}
