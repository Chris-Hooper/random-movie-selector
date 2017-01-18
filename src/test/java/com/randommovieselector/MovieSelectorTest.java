package com.randommovieselector;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.randommovieselector.MovieSelector;

public class MovieSelectorTest {

	private MovieSelector movieSelector;

	@Before
	public void setUp() {
		movieSelector = new MovieSelector();
	}
	
	@Test
	public void whenZeroMovies_ReturnsErrorMessage() {
		String[] movies = {};
		
		assertThat(movieSelector.getRandomMovie(movies)).isEqualTo("Error: No movies found");
	}
	
	@Test
	public void whenOneMovie_ReturnsTheOnlyMovie() {
		String[] movies = {"Lord of The Rings: Fellowship of the Ring"};
		
		assertThat(movieSelector.getRandomMovie(movies)).isEqualTo("Lord of The Rings: Fellowship of the Ring");
	}
	
	@Test
	public void whenTwoMovies_ReturnsEitherMovie() {
		String[] movies = {"Lord of The Rings: Fellowship of the Ring", "Lord of The Rings: The Two Towers"};
		List<String> allPossibleMovies = Arrays.asList(movies);

		String selectedMovie = movieSelector.getRandomMovie(movies);
		
		assertThat(allPossibleMovies.contains(selectedMovie)).isTrue();
		
	}
	
	@Test
	public void whenTwoMovies_ReturnsBothMoviesOverOneHundredIterations() {
		String[] movies = {"Lord of The Rings: Fellowship of the Ring", "Lord of The Rings: The Two Towers"};
		boolean wasFellowship = false;
		boolean wasTwoTowers = false;
		
		for (int i = 0; i < 100; i++) {
			String selectedMovie = movieSelector.getRandomMovie(movies);
			
			if (selectedMovie.equals("Lord of The Rings: Fellowship of the Ring"))
				wasFellowship = true;
			if (selectedMovie.equals("Lord of The Rings: The Two Towers"))
				wasTwoTowers = true;
		}
		
		assertThat(wasFellowship  && wasTwoTowers).isTrue();
	}
}
