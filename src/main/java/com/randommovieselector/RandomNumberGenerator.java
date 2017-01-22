package com.randommovieselector;

public class RandomNumberGenerator {
	
	public int generateNumberFromZeroTo(int desiredUpperBound) {
		int adjustedUpperBound = desiredUpperBound + 1;
		
		return (int) (Math.random() * adjustedUpperBound);
	}
}
