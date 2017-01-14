package com.test.randommovieselector;

public class MovieSelector {

	public String getRandomMovie(String[] movies) {
		if (movies.length == 0) {
			return "Error: No movies found";
		}
		
		int randomNumber = new RandomNumberGenerator().generateNumberFromZeroTo(2);
		String result = movies[randomNumber];
		
		return result;
	}

}
