package com.JDBC;

import java.sql.*;


public class search {
	
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC","root","root");
		Statement st = con.createStatement();
		String serach = "select * from emp where no=3";
		
		try
		{
			ResultSet r= st.executeQuery(serach);
			if (r.next()) 
			{
				System.out.println(r.getString(1) + " " + r.getString(2) + " " + r.getString(3));
			} 
			else 
			{
				System.out.println("Records not exist");
			}
		} 
		catch (Exception e)
		{
			System.out.println("Error "+ e.toString());
		}
		con.close();
		st.close();
	}

}
