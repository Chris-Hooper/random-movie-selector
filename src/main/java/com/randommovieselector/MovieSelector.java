package com.randommovieselector;

public class MovieSelector {

	public String getRandomMovie(String[] movies) {
		if (movies.length == 0) {
			return "Error: No movies found";
		}
		
		int randomNumber = new RandomNumberGenerator().generateNumberFromZeroTo(movies.length - 1);
		
		return movies[randomNumber];
	}
}
