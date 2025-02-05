package com.assignments;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Assignments7 {

	public static void main(String[] args) {

		
		//defining all creditedTransactionCount , debitedtransactionCount ,suspeciousTransationCount ,totalCreditedAmt,totalDebitedAmt
		int creditedTransactionCount = 0;
		int debitedtransactionCount = 0;
		int suspeciousTransationCount=0;
		int totalCreditedAmt = 0;
		int totalDebitedAmt = 0;

		//Defining transaction array
		int[] transaction = { 50000, -2000, 3000, -15000, -200, -300, 4000, -300 ,11000};
		
		//created ArrayList for for all transaction 
		List<Integer> transactionSet = new ArrayList<Integer>();
		//creating suspious transaction arraylist to check all suspicious transaction
		List<Integer> suspiciousTransactionList = new ArrayList<Integer>();
		
		//Adding one by one all transaction in Transaction arrayList and checking all the conditions
		for (int i = 0; i<transaction.length; i++) {
			//Checking transaction is greater than 10000 for suspicious transaction
			if (transaction[i] > 10000) {
				//if the transaction is suspicious then counter is increasing and adding same value is suspicious Array list
				suspeciousTransationCount++;
				transactionSet.add(transaction[i]);
				suspiciousTransactionList.add(transaction[i]);
				//checking credited or debited transaction
				if (transaction[i] >= 0) {

					creditedTransactionCount++;
					totalCreditedAmt+=transaction[i];
					
				} else {
					debitedtransactionCount++;
					totalDebitedAmt+=transaction[i];
				}
			} else {
			//checking same if transaction is not greater than 10000 then only adding in transaction array list
				transactionSet.add(transaction[i]);
				if (transaction[i] >= 0) {

					creditedTransactionCount++;
					totalCreditedAmt+=transaction[i];
				} else {
					debitedtransactionCount++;
					totalDebitedAmt+=transaction[i];
				}

			}
		}

		
		System.out.println("Total transaction count is "+transactionSet.size());
		System.out.println("Total transaction are  "+transactionSet);
		System.out.println("Total Credited count is "+creditedTransactionCount);
		System.out.println("Total Debited transaction is "+debitedtransactionCount);
		System.out.println("Total Suspecious transaction  is "+suspeciousTransationCount +" And transactions are "+suspiciousTransactionList);
		System.out.println("Total credited amount "+totalCreditedAmt);
		System.out.println("Total debited amount "+totalDebitedAmt);
		int totalAvailableBal=totalCreditedAmt+totalDebitedAmt;
		System.out.println("Total available balance in account "+totalAvailableBal);
		
		
		/*Output of above program is :- 
		 * Total transaction count is 9 
		 * Total transaction are [50000, -2000, 3000,-15000, -200, -300, 4000, -300, 11000] 
		 * Total Credited count is 4 
		 * Total Debited transaction is 5 
		 * Total Suspecious transaction is 2 And transactionsare [50000, 11000] 
		 * Total credited amount 68000 
		 * Total debited amount -17800
		 * Total available balance in account 50200
		 */
		
		

	}

}
