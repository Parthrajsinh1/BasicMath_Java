package com.math;

// number of counts
// i/p - 1234 -> o/p - 4 
// i/p - 2 -> o/p - 1

public class Program01 {

	public static int numberOfDigits(int number) {

		int counter = 0;
		while (number > 0) {
			number = number / 10;
			counter++;
		}
		if (number == 0) {
			counter++;
		}
		return counter;

	}

	public static void main(String[] args) {

		System.out.println(numberOfDigits(0));
	}

}
