package com.JDBC;

import java.sql.*;

public class creste_table {
	
	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC","root","root");
		Statement st =con.createStatement();
		String s= "create table emp(no int, emp_name char(10), emp_salary int)";
		try {
			 
			st.execute(s);
			System.out.println("table created");
		} 
		 catch (Exception e) 
		{
			System.out.println("Error "+e.getMessage());
		}
	}

}
