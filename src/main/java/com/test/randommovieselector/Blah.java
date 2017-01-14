package com.test.randommovieselector;

public class Blah {

	public static void main(String[] args) {
		int range = 2;
		
		for (int i = 0; i < 100; i++) {
			double random = Math.random();
			int randomInt = (int) random * (range + 1);
			
			System.out.println("Random = " + random);
			System.out.println("Int = " + randomInt);
			System.out.println("");
			
		}
	}
}
