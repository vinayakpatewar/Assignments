package com.assignments;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

public class Assignments4 {

	public static void main(String[] args) {
	
		//Adding all data in LinkedHashMap because we want to store data in key and Value pairs
		//creating Map 1 for line 1 and adding all employee details

		Map<String, String> line1 = new LinkedHashMap<String, String>();

		line1.put("Employee ID", "E001");
		line1.put("Name", "Alice Green");
		line1.put("Age", "30");
		line1.put("Gender", "Female");
		line1.put("Department", "Engineering");
		line1.put("Position", "Software Engineer");
		line1.put("Salary", "75,000");
		line1.put("Email", "alice@example.com");
		line1.put("contact Number", "9876543213");

		//creating Map 2 for line 2 and adding all employee details
		Map<String, String> line2 = new LinkedHashMap<String, String>();

		line2.put("Employee ID", "E002");
		line2.put("Name", "Bob johnson");
		line2.put("Age", "35");
		line2.put("Gender", "Male");
		line2.put("Department", "Marketing");
		line2.put("Position", "Marketing Manager");
		line2.put("Salary", "85,000");
		line2.put("Email", "bob@example.com");
		line2.put("contact Number", "9876543214");

		//creating Map 3 for line 3 and adding all employee details
		Map<String, String> line3 = new LinkedHashMap<String, String>();

		line3.put("Employee ID", "E003");
		line3.put("Name", "Carol White");
		line3.put("Age", "28");
		line3.put("Gender", "Female");
		line3.put("Department", "Sales");
		line3.put("Position", "Sales Executive");
		line3.put("Salary", "65,000");
		line3.put("Email", "carol@example.com");
		line3.put("contact Number", "9876543215");
		
		
		
		//Creating Linked List because dont no in department in future how many employees will join
		//Added all 3 created map in Linked list by insertion order
		LinkedList<Map<String, String>> CompanyData=new LinkedList<Map<String,String>>();
		CompanyData.add(line2);
		CompanyData.add(line2);
		CompanyData.add(line3);
		
		
		//Printing 2nd Employee Email ID 
		System.out.println("Email id of "+CompanyData.get(1).get("Name")+" is :-"+CompanyData.get(1).get("Email"));
		
		
	}

}
