package com.math;

//reverse a number -> 1234 -> 4321

public class Program02 {

	public static int reverseNumber(int number) {
		int revNumber = 0;

		while (number > 0) {
			int ld = number % 10;
			number = number / 10;
			revNumber = (revNumber * 10 + ld);
		}

		return revNumber;
	}

	public static void main(String[] args) {
		System.out.println(reverseNumber(1234));
	}

}
