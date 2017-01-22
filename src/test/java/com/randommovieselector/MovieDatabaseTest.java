package com.randommovieselector;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;


public class MovieDatabaseTest {
	
	private MovieDatabase db;

	@Before
	public void setUp() {
		db = new MovieDatabase();
	}
	
	@Test
	public void canAddMovie() {
		db.addMovie("Lord of The Rings: Fellowship of the Ring");
		
		assertThat(db.getMovies()).isEqualTo(new String[] {"Lord of The Rings: Fellowship of the Ring"});
	}
	
	@Test
	public void canDeleteMovie() {
		String fellowship = "Lord of The Rings: Fellowship of the Ring";
		String twoTowers = "Lord of The Rings: The Two Towers";
		db.addMovie(fellowship);
		db.addMovie(twoTowers);

		db.removeMovie(fellowship);
		
		assertThat(db.getMovies()).isEqualTo(new String[] {twoTowers});
	}
}
