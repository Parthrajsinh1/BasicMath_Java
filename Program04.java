package com.math;


//armstrong - 371 -> sum of cube of all three should be 371.
//1634
public class Program04 {

	public static void armstrongNumber(int number) {
		
		int sum=0;
		int digits=0;
		int n = number; // if we do not make copy then after first loop number value is 0 
						// and the second loop will never run
		while(number>0) {
			int ld = number % 10 ;
			digits++;
			number = number / 10;
		}
		number = n; // assign the original value of number here cuz
					// after first loop number values is 0 .
		
		while(number>0) {
			int ld = number % 10;
			sum = sum + (int)(Math.pow(ld,digits));
			number = number / 10;
		}
		
		if(sum==n) {
			System.out.println("armStrong");
		}
		else {
			System.out.println("not");
		}
	}

	public static void main(String[] args) {
		
		armstrongNumber(1634);
		
	}

}
