package com.JDBC;

import java.sql.*;


public class Update_values {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC","root","root");
		Statement st = con.createStatement();
		
		String update = "update emp set no=1 where emp_name='amit'";
		try {
			
			st.execute(update);
			System.out.println("Record updated");
		} 
		catch (Exception e) {
			System.out.println("Error "+ e.toString());
		}
	}

}
