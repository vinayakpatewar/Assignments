package com.assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Assignments5 {

	public static void main(String[] args) {

		// 1)
		// Creating ArrayList of top 5 most populated countries in world and printing
		// If any country will be added in list then we can use link list for better memory allocation.
		List<String> topCountries = new ArrayList<String>();
		topCountries.add("India");
		topCountries.add("China");
		topCountries.add("Rasia");
		topCountries.add("US");
		topCountries.add("England");
		// Printing 2nd country from above list
		System.out.println(topCountries.get(1));

		// 2)
		// Created Hash set to store the top 10 cities of the worlds here just need to
		// print the size so used Hash set
		Set<String> topTenCities = new HashSet<String>();
		topTenCities.add("Pune");
		topTenCities.add("Banglore");
		topTenCities.add("Mumbai");
		topTenCities.add("London");
		topTenCities.add("Hong Kong");
		topTenCities.add("Dubai");
		topTenCities.add("Macau");
		topTenCities.add("Bangkok");
		topTenCities.add("Paris");
		topTenCities.add("Kuala Lumpur");

		// Printing size of topTenCities set and that is 10
		System.out.println("Total no of counties in linst :- " + topTenCities.size());

		// 3)
		// Creating Hash map for top 5 cities in United State
		Map<String, Integer> topFiveCitiesInUS = new HashMap<String, Integer>();
		topFiveCitiesInUS.put("New York City", 8335897);
		topFiveCitiesInUS.put("Los Angeles", 3822238);
		topFiveCitiesInUS.put("Chicago", 2665039);
		topFiveCitiesInUS.put("Houston", 2302878);
		topFiveCitiesInUS.put("Phoenix", 1644409);

		// Printing top 5 cities Map
		System.out.println(topFiveCitiesInUS);

		// 4)
		// Created 10 random integer of array and and doing addition of 3rd and 5th
		int[] number = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };

		// Doing addition directly in Sys out statement for 3rd and 5th value that
		// respectively 30 and 50
		System.out.println("Addition of 3rd and 4th Values from given array :-" + number[2] + number[4]);

		// 5)
		// Creating ArrayList of top 5 highest grossing movies 
		// If any movie will be added in list then we can use linked list for better memory allocation.
		
		List<String> topMovies = new ArrayList<String>();
		topMovies.add("Pushpa");
		topMovies.add("Kalki");
		topMovies.add("Stree 2");
		topMovies.add("The Greatest of All Time	");
		topMovies.add("Devara");
		
		// Printing 3rd movie from above list
		System.out.println(topMovies.get(2));

	}

}
