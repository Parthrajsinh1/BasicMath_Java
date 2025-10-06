package com.math;


//palindrome a number -> 121 -> 121

public class Program03 {

	public static void palindromeNumber(int number) {
		int revNumber = 0;
		int dup = number;
		while (number > 0) {
			int ld = number % 10;
			number = number / 10;
			revNumber = (revNumber * 10 + ld);
		}
		
		if(revNumber==dup) {
			System.out.println("PPPP");
		}
		else {
			System.out.println("nnnnnnn");
		}
		
		//System.out.println(Integer.compare(revNumber, dup));
		
	}

	public static void main(String[] args) {
		palindromeNumber(121);
	}

}
