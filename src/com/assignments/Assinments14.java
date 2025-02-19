package com.assignments;

import java.util.Iterator;

public class Assinments14 {

	public static void main(String[] args) {
		// 1)Count total no of word in sentence

		// This is the original string
		String sentence = "Java programming is fun and challenging";
		// removing space from string to count char and printing the same
		String sentence1 = sentence.replace(" ", "");
		// total no of char in given string is 34
		System.out.println("Total no of char " + sentence1.length());

		// 2)Reverse the original string
		String reverse = "";

		for (int i = sentence.length() - 1; i >= 0; i--) {
			reverse = reverse + sentence.charAt(i);

		}
		// reverse of above given string is "gnignellahc dna nuf si gnimmargorp avaJ"
		System.out.println(reverse);

		// 3)Convert each char first letter in upper case

		String input = "Java programming is fun and challenging";
		String[] upperCaseSentence = input.split("");
		String result = "";

		for(String word:upperCaseSentence) {
            String capitalizedWord = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();

            result += capitalizedWord;
		}
		System.out.println(result.trim());

	}

}
