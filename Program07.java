package com.math;

// GCD/HCF 
// n1 = 9 , n2 = 12 
// 9 -> 1 ,3, 9
// 12 -> 1 ,2 ,3 ,4 ,6 ,12
// gcd(9,12)-> 3

public class Program07 {

	public static int gcd(int n1, int n2) {

		while (n1 > 0 && n2 > 0) {
			if (n1 > n2) {
				n1 = n1 % n2;
			} else
				n2 = n2 % n1;
		}
		if (n1 == 0)
			return n2;
		return n1;
	}

	public static void main(String[] args) {

		System.out.println(gcd(108, 120));
	}

}
