package com.math;

// prime -> a number that has 2 factors-> 1 and itself.

public class Program06 {

	public static boolean prime(int number) {
		int cnt=0;
		for(int i=1 ; i<=number ; i++) {
			if(number%i==0) {
				cnt++;
			}
		}
		
		if(cnt==2)
			return true;
		return false;
		
	}

	public static void main(String[] args) {

		System.out.println(prime(13));

	}

}
