package tutorial_data;

import java.sql.Connection;
import java.sql.DriverManager;

public class CP {
	
static Connection con;
	
	public  static Connection createC() {
		
		try {
			//load driver
			//Class.forName("com.mysql.jdbc.Driver");
			//Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url="jdbc:mysql://localhost:3306/product_data";
			String userName="root";
			String pass="root";
			
			con=DriverManager.getConnection(url, userName, pass);
			System.out.println("Connection is done");
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Wxeptiop: "+e);
		}
		
		return con;
	}

}
