package tutorial_data;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.jar.Attributes.Name;



public class ProductToDatabase {

	public static boolean insterTo(Product po) {
		boolean isInserted = false;

		try {
			Connection con = CP.createC();
			String q = "Insert into product_list(pname,ptype) value(?,?)";
			PreparedStatement preparedStatement = con.prepareStatement(q);
			preparedStatement.setString(1, po.getPname());
			preparedStatement.setString(2, po.getPtype());
			preparedStatement.execute();
			isInserted = true;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("ex" + e);
		}
		return isInserted;
	}
	
	public static boolean ReadProductList() {
		boolean isReadable=false;
		try {
			Connection con=CP.createC();
			String q="select * from product_list";
			Statement  stmStatement=con.createStatement();
		    ResultSet set=	stmStatement.executeQuery(q);
		    while(set.next()) {
			   int id=set.getInt(1);
			   String pname=set.getString(2);
			   String ptype=set.getString(3);
			   System.out.println("Product id :"+id+"\nProduct Name: "+ pname+"\nProduct type:" + ptype);
			   
		   }
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		return isReadable;
	}

	public static boolean updateProductList(int productId,String pname) {
		boolean isUpdated=false;
		try {
			Connection con=CP.createC();
			String q1="update product_list set pname =? where pid=?";
			PreparedStatement preparedStatement=con.prepareStatement(q1);
			preparedStatement.setString(1, pname);
			preparedStatement.setInt(2, productId);
			preparedStatement.executeUpdate();
			isUpdated=true;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("exwpton"+e);
		}
	
		return isUpdated;
	}
	
	public static boolean delete(int productId) {
		boolean isUpdated=false;
		try {
			Connection con=CP.createC();
			String q1="delete from product_list where pid=?";
			PreparedStatement preparedStatement=con.prepareStatement(q1);
			preparedStatement.setInt(1, productId);
			preparedStatement.executeUpdate();
			isUpdated=true;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("exwpton"+e);
		}
	
		return isUpdated;
	}
}