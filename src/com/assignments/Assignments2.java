package com.assignments;

public class Assignments2 {

	public static void main(String[] args) {
		
		
		
		String [][][] semester= {
				{
					//semester 1 and 6 subject along with marks
					{"Mathematics1", "78"},
					{"Physics", "85"},
					{"Chemistry", "91"},
					{"Computer Programming", "74"},
					{"Engineering Drawing", "88"},
					{"Basic Electrical", "79"},	
				},
				
				{
					//semester 2 and 6 subject along with marks
					{"Mathematics || ", "82"},
					{"Mechanics", "77"},
					{"Env Sci", "93"},
					{"Basic Electronicx", "69"},
					{"Engineering Physics", "84"},
					{"Engineering grafics", "90"},
				},
				
				{	
					//semester 3 and 6 subject along with marks
					{"Data Structure", "88"},
					{"Discrete athematics", "81"},
					{"Digital electronics", "76"},
					{"Operating system", "92"},
					{"Signal and System", "85"},
					{"Object orianted Programing", "78"},	
				},
				
				{	
					//semester 4 and 6 subject along with marks
					{"Algorithms", "91"},
					{"Computer Networks", "73"},
					{"Database System", "89"},
					{"Microprocessor", "80"},
					{"Communication Engineering", "76"},
					{"Software Engineering", "87"},	
				},
				
				{	
					//semester 5 and 6 subject along with marks
					{"Probability and stats", "86"},
					{"Mechanic learning", "88"},
					{"Compiler design", "84"},
					{"Theory of computation", "95"},
					{"Embedded system", "73"},
					{"Computer Graphics", "90"},	
						
				}
		};
		
		// Print semester 3 :- Subject 4 and Subject 5 names and Marks Respectively 
		System.out.println(semester[2][2][0]+":-"+semester[2][2][1]+" And "+semester[2][3][0]+":-"+semester[2][3][1]);
		
		// Print semester 5 :- Subject 3 and Subject 6 names and Marks Respectively 
		System.out.println(semester[4][2][0]+":-"+semester[4][2][1]+" And "+semester[4][5][0]+":-"+semester[4][5][1]);
	}

}
