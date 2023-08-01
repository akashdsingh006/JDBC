package com.jdbc.test;

import java.util.Scanner;

public class StudentInputClass 
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		Scanner sys=new Scanner(System.in);
		
		
		while(true)
		{
			System.out.println("Enter 1 to insert data");
			System.out.println("Enter 2 to delete data");
			System.out.println("Enter 3 to display data");
			System.out.println("Enter 4 roll number number for which you want to change data");
			System.out.println("Enter 5 to exit");
			int choice=in.nextInt();
			switch(choice)
			{
			case 1:
				
					System.out.println("Enter Name");
					String name=in.next();
					
					System.out.println("Enter City");
					String city=in.next();
					
					System.out.println("Enter Roll Number");
					int roll=in.nextInt();
					
					System.out.println("Enter Class");
					int cls=in.nextInt();
					
					Student st=new Student(roll,cls,name,city);
					
					StudentOperations.insertIntoTable(st);
				break;
				
			case 2:
					
					System.out.println("Enter roll number whose data you want to delete");
					 roll=in.nextInt();
					 StudentOperations.deleteDataFromTable(roll);
				break;
				
			case 3:
					System.out.println("Data Records");
					StudentOperations.getData();
				break;
			case 4:
				System.out.println("Enter roll number number for which you want to change data");
				roll=in.nextInt();
				System.out.println("Enter city");
				city=in.next();
				StudentOperations.updateData(roll,city);
				break;
			case 5: 
					System.exit(0);
					break;
			default:
				System.out.println("Enter valid choice");
			}
		}
		
		
	}
}
