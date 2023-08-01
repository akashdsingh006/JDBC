package com.jdbc.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentOperations {
	
	//static Connection con=StudentManager.con;

	public static void insertIntoTable(Student st)
	{
		try {
			StudentManager.connectDatabase();
			
			//Student st=new Student();
			String name=st.getName();
			String city=st.getCity();
			int cls=st.getCls();
			int roll=st.getRoll();
			
			Connection con=StudentManager.con;
			PreparedStatement pstm=con.prepareStatement("insert into student_db(roll,class,name,city) values (?,?,?,?)");
			
			pstm.setInt(1, roll);
			pstm.setInt(2, cls);
			pstm.setString(3, name);
			pstm.setString(4, city);
			
			pstm.execute();
			System.out.println("Data inserted into Table");
		} 
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		catch(SQLException e)
		{
			//e.printStackTrace();
		}
		
	}
	
	public static void deleteDataFromTable(int roll)
	{
		
			try {
				StudentManager.connectDatabase();
				
				//Student st=new Student();
				//int roll=st.getRoll();
				
				Connection con=StudentManager.con;
				PreparedStatement pstm=con.prepareStatement("DELETE FROM student_db where roll=?");
				
				pstm.setInt(1, roll);
				
				pstm.execute();
				System.out.println("Data deleted from Table");
			} 
			catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			catch(SQLException e)
			{
				
			}
			
		
	}
	
	public static void getData()
	{
		try {
			StudentManager.connectDatabase();
			
			Connection con=StudentManager.con;
			Statement st=con.createStatement();
			
			ResultSet rs=st.executeQuery("select * from student_db");
			while(rs.next())
			{
				String name= rs.getString("name");
				String city=rs.getString("city");
				int roll=rs.getInt("roll");
				int cls=rs.getInt("class");
				
				System.out.print("Name "+name +" Class "+cls+ " Roll "+roll+ " City "+city);
				System.out.println();
			}
			
			//pstm.executeQuery();
		} 
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(SQLException e)
		{
			e.printStackTrace();

		}
	}
	
	public static void updateData(int roll,String city)
	{
		try
		{
			StudentManager.connectDatabase();
			Connection con=StudentManager.con;
			
			PreparedStatement pstm=con.prepareStatement("update student_db set city=? where roll=?");
			pstm.setString(1, city);
			pstm.setInt(2, roll);
			pstm.executeUpdate();
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
