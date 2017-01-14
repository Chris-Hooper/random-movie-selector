package com.test.randommovieselector;

public class RandomNumberGenerator {
	
	public int generate(int range) {
		double random = Math.random();
		int rangeBlah = range + 1;
		
		System.out.println("Random = " + random);
		System.out.println("Range = " + rangeBlah);

		int finalRandom = (int) random * rangeBlah;
		System.out.println("Final random = " + finalRandom);

		return finalRandom;
	}
}
