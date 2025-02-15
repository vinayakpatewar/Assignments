package com.assignments;

public class Assignments9 {

	public static void main(String[] args) {

		// int Array of given numbers
		int[] numbers = {12, 34, 11, 36, 87, 98, 93 };

		// Initializing max secondmax and thirdMax no
		int max = 0;
		int secondMax = 0;
		int thirdMax = 0;

		// To iterate above array for each loop here using
		for (int num : numbers) {

			// checking each elements with above initialize with variables
			// checking if num is greater than max then assigning num to max and max is
			// assign to secondmax and secondmax is asign to thirdmax
			if (num > max) {
				thirdMax = secondMax;
				secondMax = max;
				max = num;
			//Checking if if num is greater than max then same checking with second max
			} else if (num > secondMax) {
				thirdMax = secondMax;
				secondMax = num;
			} else {
				thirdMax = secondMax;
			}

		}

		System.out.println("Second Max no in given array is "+secondMax);
		System.out.println("Third Max no in given array is "+thirdMax);
		
	}

}
