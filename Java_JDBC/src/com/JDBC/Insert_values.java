package com.JDBC;

import java.sql.*;

public class Insert_values {
	
	public static void main(String[] args) throws Exception {
	
	Class.forName("com.mysql.jdbc.Driver");
	Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC","root","root");
	Statement st =con.createStatement();
	String sk = "insert into emp values(111,'amit',56200),(2,'muskan',85200),(3,'ashen',95100)";
	
	try 
	{
		st.execute(sk);
		System.out.println("Record in insertred inside table ");
	} 
	catch (Exception e) 
	{
		System.out.println("Error "+ e.toString());
	}
	
	}
}
