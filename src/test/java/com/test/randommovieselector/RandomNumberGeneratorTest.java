package com.test.randommovieselector;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.junit.Before;
import org.junit.Test;


public class RandomNumberGeneratorTest {

	private RandomNumberGenerator generator;

	@Before
	public void setUp() {
		generator = new RandomNumberGenerator();
	}
	
	@Test
	public void whenRangeIsZero_ReturnsZero() {
		assertThat(generator.generateNumberFromZeroTo(0)).isEqualTo(0);
	}
	
	@Test
	public void whenRangeIsOne_CanReturnEitherZeroOrOne_ButEnsuresItReturnsBothOverIterations() {
		boolean wasOne = false;
		boolean wasZero = false;
		
		for (int i = 0; i < 100; i++) {
			int randomNumber = generator.generateNumberFromZeroTo(1);
			
			if (randomNumber == 1)
				wasOne = true;
			if (randomNumber == 0)
				wasZero = true;
		}
		
		assertThat(wasZero && wasOne).isTrue();
	}
}
