package com.test.randommovieselector;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

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
	
	@Ignore
	@Test
	public void whenTwoMovies_ReturnsRandomMovie() {
		String[] movies = {"Lord of The Rings: Fellowship of the Ring", "Lord of The Rings: The Two Towers"};

//		int randomNumber = movieSelector.generateRandomNumber(movies.length);
		int randomNumber = 1;
		
		assertThat(movieSelector.getRandomMovie(movies)).isEqualTo("Lord of The Rings: The Two Towers");
	}
}
