package com.assignments;

import java.nio.channels.Pipe.SourceChannel;
import java.util.Iterator;

public class Assignments14 {

	public static void main(String[] args) {

		// 1)Total no of words in sentence is 6
		String input = "Java programming is fun and challenging";
		String[] upperCaseSentence = input.split(" ");
		System.out.println("Total no of words in sentence " + upperCaseSentence.length);

		// 2)To make capital letter of each word like this Java Programming Is Fun And
		// Challenging
		String result = "";

		for (String word : upperCaseSentence) {
			String capitalizedWord = word.substring(0, 1).toUpperCase() + word.substring(1);

			result += capitalizedWord + " ";
		}
		// 3)given in put in reverse order like Challenging And Fun Is Programming Java

		System.out.println(result.trim());

		String[] reverse = result.split(" ");

		for (int i = reverse.length - 1; i >= 0; i--) {

			System.out.print(reverse[i] + " ");
		}

		// Final output is like this
//		Total no of words in sentence 6
//		Java Programming Is Fun And Challenging
//		Challenging And Fun Is Programming Java 

	}

}
