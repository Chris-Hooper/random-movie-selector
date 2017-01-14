package com.test.randommovieselector;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;


public class RandomNumberGeneratorTest {

	@Test
	public void whenRangeIsZero_ReturnsZero() {
		assertThat(new RandomNumberGenerator().generate(0)).isEqualTo(0);
	}
	
	@Test
	public void whenRangeIsOne_ReturnsOne() {
		assertThat(new RandomNumberGenerator().generate(1)).isEqualTo(1);
	}
}
