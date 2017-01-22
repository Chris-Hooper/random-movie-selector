package com.randommovieselector;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;


public class MovieDatabaseTest {
	
	@Test
	public void canAddMovie() {
		MovieDatabase db = new MovieDatabase();
		List<String> moviesBlah = Arrays.asList(new String[] {"Lord of The Rings: Fellowship of the Ring"});

		db.addMovie("Lord of The Rings: Fellowship of the Ring");
		
		assertThat(db.getMovies()).isEqualTo(Arrays.asList(new String[] {"Lord of The Rings: Fellowship of the Ring"}));
	}
}
