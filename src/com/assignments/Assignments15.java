package com.assignments;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Assignments15 {

	public static void main(String[] args) {
		String paragraph="Java is a popular programming language. Java is used for web development "
				+ "mobile application, and more";
		
		String [] result= paragraph.split(" ");
		//total word in paragraph
		System.out.println(result.length);
		
		int count=0;
		
		HashMap<String, Integer> totalWord=new HashMap<String, Integer>();
		
		for(String word:result) {
			if(totalWord.containsKey(word)) {
				totalWord.put(word, totalWord.get(word)+1);
			}else {
				totalWord.put(word, 1);
			}
			
		}
		
		System.out.println(totalWord);
		
		//Index of Java in paragraph
		for(int i=0;i<result.length;i++)
		{
			if(result[i].equalsIgnoreCase("Java")) {
				System.out.println("Java is present at index :- "+i);
			}
			
		}

	}

}
