package com.jdbc.test1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionWithDB {

	static Connection con;
	public static Connection connection()
	{
		
		String url="jdbc:postgresql://localhost:5432/postgres";
		String username="postgres";
		String pass="akash";
		
		try {
			Class.forName("org.postgresql.Driver");
			
			con=DriverManager.getConnection(url, username, pass);
			if(con!=null)
			{
				System.out.println("Connected to Database");
				return con;
			}
			else
				System.out.println("Connection problem.....");
		} 
		 catch (SQLException e) {
			// TODO Auto-generated catch block
			
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		return null;
	}
}
