package com.jdbc.test1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeOperations {

	static Connection con;
	public static void addData(EmployeeDAO emp)
	{
		con=ConnectionWithDB.connection();
		
		try {
			PreparedStatement pstm=con.prepareStatement("insert into employee_database(emp_id,emp_name,emp_age,emp_city,emp_salary) values (?,?,?,?,?)");
			pstm.setInt(1, emp.getEmpID());
			pstm.setString(2, emp.getName());
			pstm.setInt(3, emp.getAge());
			pstm.setString(4, emp.getCity());
			pstm.setDouble(5, emp.getSalary());
			
			pstm.execute();
			
			System.out.println("Data inserted into the table");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void removeData(int empID)
	{
		con=ConnectionWithDB.connection();
		
		try {
			PreparedStatement pstm=con.prepareStatement("delete from employee_database where emp_id=?");
			pstm.setInt(1, empID);
			
			pstm.execute();
			
			System.out.println("Data removed from the table");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void updateData(int empID,String name,double salary)
	{
		con=ConnectionWithDB.connection();
		
		try {
			PreparedStatement pstm=con.prepareStatement("update employee_database set emp_name=?,emp_salary=? where emp_id=?");
			pstm.setString(1, name);
			pstm.setDouble(2,salary);
			pstm.setInt(3,empID);
			
			pstm.executeUpdate();
			
			System.out.println("Data update in the table");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void readData()
	{
		
		con=ConnectionWithDB.connection();
		try {
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from employee_database");
			
			while(rs.next())
			{
				int empID=rs.getInt(1);
				String name=rs.getString(2);
				 double salary=rs.getDouble(5);
				 String city=rs.getString(4);
				 int age=rs.getInt(3);
				 
				 System.out.println("Emp ID : "+empID+" Name : "+name +" Salary : "+salary+" City : "+city +" Age : "+age);
			}
			
		}
		
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
}
