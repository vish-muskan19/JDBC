package com.JDBC;

import java.sql.*;

public class viewAll_values {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC","root","root");
		Statement st = con.createStatement();
		String viewAllValues = "Select * from emp";
		
		ResultSet r = st.executeQuery(viewAllValues);
		
		while (r.next()) 
		{
			System.out.println(r.getString(1)+ " " + r.getString(2) + " " + r.getString(3));
		}
		con.close();
		st.close();
	}

}
