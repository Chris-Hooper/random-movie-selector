package com.randommovieselector;

public class RandomNumberGenerator {
	
	public int generateNumberFromZeroTo(int desiredUpperBound) {
		int inclusiveUpperBound = desiredUpperBound + 1;
		
		return (int) (Math.random() * inclusiveUpperBound);
	}
}
