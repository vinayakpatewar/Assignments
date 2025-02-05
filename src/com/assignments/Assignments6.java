package com.assignments;

public class Assignments6 {

	public static void main(String[] args) {

		// Storing Customer details in different variable as per requirement
		String customerName = "John Doe";
		int creditScore = 720;
		double income = 55000.00;
		boolean isEmployed = true;
		double debtToIncomeRation = 35.0;

		// Checking customer credit score
		if (creditScore >= 750) {

			System.out.println(customerName + " credit score is greater than 750 loan is approved");

		} else if (creditScore >= 650 && creditScore <= 750) {

			System.out.println(customerName + " credit score is :-" + creditScore);
			// Checking customer income
			if (income >= 50000) {

				System.out.println(customerName + " income is :-" + income);
				// Checking customer employment status
				if (isEmployed == true) {
					System.out.println(customerName + " employment status:-" + isEmployed);
					// Checking customer DTI Ration
					if (debtToIncomeRation < 40) {
						System.out.println(customerName + " DTI ratio is:- " + debtToIncomeRation);
						System.out.println(customerName + " Loan is Approved");
					} else {
						// Customer DTI Ration is less than 40%
						System.out.println(customerName + " DTI ratio is greater than 40 and your DTI Ration is :-"
								+ debtToIncomeRation);
						System.out.println(customerName + " Loan is Rejected");
					}
				} else {
					// Customer is not employed hence loan is rejected
					System.out.println(customerName + " Employment status is :-  " + isEmployed);
					System.out.println(customerName + " Loan is Rejecetd ");
				}

			} else {
				System.out.println(customerName + " income is :-" + income);
				System.out.println(customerName + " credit income is  less than 50000 so loan is Rejected by Bank");

			}

		} else {
			// Customer credit score is less than 650 so loan is rejected
			System.out.println(customerName + " credit score :-" + creditScore);
			System.out.println(customerName + " Loan is Rejecetd ");

		}
	}

	/*
	 * Output For above details 
	 * John Doe credit score is :-720 
	 * John Doe income is:-55000.0 
	 * John Doe employment status:-true 
	 * John Doe DTI ratio is:- 35.0 
	 * JohnDoe Loan is Approved
	 */

}
