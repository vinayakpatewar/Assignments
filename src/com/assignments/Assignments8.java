package com.assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Assignments8 {

	public static void main(String[] args) {
        // All Employee names storing in String Array
        String[] employees = {"Alice Johnson", "Bob Smith", "Carol Davis", "David Brown", "Eva Green"};

        // All employee Data apart from name storing separate Double array 
        Double[] employeeData1 = {75000.0, 5.0, 4.2};
        Double[] employeeData2 = {68000.0, 3.0, 3.8};
        Double[] employeeData3 = {82000.0, 7.0, 4.5};
        Double[] employeeData4 = {90000.0, 10.0, 2.0};
        Double[] employeeData5 = {60000.0, 2.0, 3.5};

        // Storing all above data in map for Hike calculation 
        Map<String, Double[]> empData = new HashMap<>();
        empData.put(employees[0], employeeData1);
        empData.put(employees[1], employeeData2);
        empData.put(employees[2], employeeData3);
        empData.put(employees[3], employeeData4);
        empData.put(employees[4], employeeData5);

        // Map to store hike percentage
        Map<String, Double> hikeMap = new HashMap<>();

        // Calculate hike for each employee
        for (String emp : employees) {
        	
        	//getting value from map
            Double[] data = empData.get(emp); 
            
            double baseSalary = data[0];
            double experience = data[1];
            double rating = data[2];
            double variablePayPercentage;
            double bonus;
            double reward = 0;

            // Determine variable pay and bonus based on rating
            if (rating >= 4) {
                variablePayPercentage = 15;
                bonus = 1500;
            } else if (rating >= 3) {
                variablePayPercentage = 10;
                bonus = 1200;
            } else {
                variablePayPercentage = 3;
                bonus = 300;
            }

            // Additional reward for employees with 5+ years of experience
            if (experience >= 5) {
                reward = 5000;
            }

            // Calculate total hike amount
            double hike = (baseSalary * variablePayPercentage / 100) + bonus + reward;
            double hikePercentage = (hike / baseSalary) * 100;

            // Store the calculated hike percentage
            hikeMap.put(emp, hikePercentage);
        }

        // Print hike details
        System.out.println("Employee Hike Details:");
        System.out.println(hikeMap);
    }
}
