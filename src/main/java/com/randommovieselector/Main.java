package com.randommovieselector;

public class Main {
	
	public static void main(String[] args) {
		MovieDatabase db = new MovieDatabase();
		db.addMovie("Ocean's Eleven");
		db.addMovie("Ocean's Twelve");
		db.addMovie("Ocean's Thirteen");
		MovieSelector movieSelector = new MovieSelector();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Random movie = " + movieSelector.getRandomMovie(db.getMovies()));
		}
	}
}
