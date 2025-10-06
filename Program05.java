package com.math;

public class Program05 {

	public static void allDivisor(int number) {

		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {

		allDivisor(120);

	}

}
