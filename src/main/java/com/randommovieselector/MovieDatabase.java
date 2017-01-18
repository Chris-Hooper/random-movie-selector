package com.randommovieselector;

import java.util.ArrayList;
import java.util.List;

public class MovieDatabase {

	private List<String> movies = new ArrayList<>();
	
	public void addMovie(String movieTitle) {
		movies.add(movieTitle);
	}

	public List<String> getMovies() {
		return movies;
	}

}
