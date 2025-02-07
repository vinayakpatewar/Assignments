package com.assignments;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Assignments8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, String> employeeTable = new LinkedHashMap<String, String>();
		employeeTable.put("Name", "Alice Johnson");
		employeeTable.put("Base Salary", "75000");
		employeeTable.put("Experiance", "5");
		employeeTable.put("Year End Rating ", "4.2");

		List<Object> empl1 = new ArrayList<>();

		// Adding String and Integer data
		empl1.add("Alice johnson");
		empl1.add(75000);
		empl1.add(5);
		empl1.add(4.2);
		
		List<Object> empl2 = new ArrayList<>();

		// Adding String and Integer data
		empl2.add("Bob smith");
		empl2.add(68000);
		empl2.add(3);
		empl2.add(3.8);
		
		Object [] allEmployee= {empl1.toArray(),empl2.toArray()	};
		for(Object emp:allEmployee) {
			System.out.println(emp.toString());
			
			
		}
		
	}

	void hike(int basicSalary, int variablepay, int bonus, int rewards) {

		int hike = (basicSalary * variablepay / 100) + bonus + rewards;

	}

}
