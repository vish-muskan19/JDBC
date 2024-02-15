package com.JDBC;

import java.sql.*;

public class All_in_one {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//Load the driver
		Class.forName("com.mysql.jdbc.Driver");
		
		//Establish Connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC","root","root");
		
		//create Statement and execute Queries
		Statement st = con.createStatement();
		String s1 = "create table v1(stno int, stname char(10), stper int)";
		st.execute(s1);
		
		String s2 = "insert into v1(stno, stname, stper) values (1, 'muskan', 96),(2, 'annu', 36),(3, 'harsh', 45),(4, 'neha', 25),(5, 'anuu',75)";
		st.executeUpdate(s2);
		
		String s3 = "update v1 set stname='ashen' where stno=2";
		st.executeUpdate(s3);
		
		String s4 = "select * from v1";
		
		ResultSet r = st.executeQuery(s4);
		while (r.next()) 
		{
			System.out.println(r.getString(1)+ " " + r.getString(2) + " " + r.getString(3));
		}
		con.close();
		st.close();
	}
}
