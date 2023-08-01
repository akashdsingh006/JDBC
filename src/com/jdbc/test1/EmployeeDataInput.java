package com.jdbc.test1;

import java.util.Scanner;

public class EmployeeDataInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in=new Scanner(System.in);
		//EmployeeOperations eo=new EmployeeOperations();

		System.out.println("Enter your choice");
		int choice;
		while(true)
		{
			System.out.println("Enter 1 to add data into employee database");
			System.out.println("Enter 2 to delete data from employee database");
			System.out.println("Enter 3 to update data into employee database");
			System.out.println("Enter 4 to read data from employee database");
			System.out.println("Enter 5 to exit");
			choice=in.nextInt();
			
			switch(choice)
			{
			case 1:
				System.out.println("Enter employee ID");
				int empID=in.nextInt();
				System.out.println("Enter employee name");
				String name=in.next();
				name=name+in.nextLine();
				System.out.println("Enter employee salary");
				double salary=in.nextDouble();
				System.out.println("Enter employee city");
				String city=in.next();
				System.out.println( "Enter employee age");
				int age=in.nextInt();
				
				EmployeeDAO emp=new EmployeeDAO(empID, name, salary, city, age);
				EmployeeOperations.addData(emp);
				
				break;
			
			case 2:
				System.out.println("Enter employee ID whose data you want to remove");
				empID=in.nextInt();
				EmployeeOperations.removeData(empID);
				break;
				
			case 3:
				System.out.println("Enter employee ID whose data you want to update");
				empID=in.nextInt();
				System.out.println("Enter employee name");
				name=in.next();
				name=name+in.nextLine();
				System.out.println("Enter employee salary");
				salary=in.nextDouble();
				EmployeeOperations.updateData(empID,name,salary);
				break;
			
			case 4:
				System.out.println("Data from table");
				EmployeeOperations.readData();
				break;
			case 5:
				System.exit(0);
				break;
			default:
				System.out.println("Enter valid option");
			}
			
		}
	}

}
