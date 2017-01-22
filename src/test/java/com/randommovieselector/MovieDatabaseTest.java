package com.randommovieselector;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;


public class MovieDatabaseTest {
	
	@Test
	public void canAddMovie() {
		MovieDatabase db = new MovieDatabase();

		db.addMovie("Lord of The Rings: Fellowship of the Ring");
		
		assertThat(db.getMovies()).isEqualTo(new String[] {"Lord of The Rings: Fellowship of the Ring"});
	}
}
