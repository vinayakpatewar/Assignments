package com.assignments;

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
		
		Map<String, Integer> totalWord=new LinkedHashMap<String, Integer>();
		
		for(int i=0;i<result.length;i++)
		{
			totalWord.put(result[i], i);
			
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
