package com.assignments.Assignments3;

public class EmpGroups {

	public static void main(String[] args) {
	
		//Creating object of Employee class to use Employee name employee id from this Employee class
		Employees emp = new Employees();
		
		//Creating Array of EmployeeName of 3 size and adding employee name to EmployeeName Array
		String [] EmployeeName=new String[3];
		//Adding Employee name to index o means 1st element
		EmployeeName[0]=emp.EmployeeName1;
		//Adding Employee name to index 1 means 2nd element
		EmployeeName[1]=emp.EmployeeName2;
		//Adding Employee name to index 2 means 3rd element
		EmployeeName[2]=emp.EmployeeName3;
		
		//Creating Array of EmployeeId of 3 size and adding employees Id to EmployeeName Array
		int [] EmployeeId=new int[3];
		//Adding Employee id to index o means 1st element
		EmployeeId[0]=emp.EmployeeId1;
		//Adding Employee id to index 1 means 2nd element
		EmployeeId[1]=emp.EmployeeId2;
		//Adding Employee id to index 1 means 2nd element
		EmployeeId[2]=emp.EmployeeId3;
		
		//Printing Employee name Bharat with Employee id 1234 
		System.out.println("EmployeeName:-" +EmployeeName[0] +","+ "EmployeeId:-"+EmployeeId[0]);		
		

	}

}
