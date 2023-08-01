package com.jdbc.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class StudentManager {
	
	static Connection con;
	public static void connectDatabase() throws ClassNotFoundException {
		// TODO Auto-generated method stub
		
		Class.forName("org.postgresql.Driver");
		String url="jdbc:postgresql://localhost:5432/postgres";
		String username="postgres";
		String pass="akash";
		try
		{
			con=DriverManager.getConnection(url,username,pass);
			if(con!=null)
				System.out.println("Connected");
			else
				System.out.println("Error");
		}
		catch(SQLException e)
		{
			
		}
		
	}
	

}
