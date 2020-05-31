package Prod_Category;
//Assignment Question -2
import java.sql.*;
import java.util.Scanner;

public class ProductCategory 
{
	public static void main(String[] args) 
	{
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
	
		Scanner scan =new Scanner(System.in);
		
		
		System.out.println("Enter product category");
		String pro_cat=scan.next();
		String query ="Select * from product_data1 where product_category="+pro_cat;
	//  String query="select product_name,product_category from product_data1 having product_category="+pro_cat;
	//	String query="select product_name,product_category from product_data1 where product_category IN("+pro_cat+")";
	
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
		
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/product1?user=root&password=Yellow@897");
			
			stmt=con.createStatement();
			
			rs=stmt.executeQuery(query);
			
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getDouble(3)+"\t"+rs.getString(4));
			}
		}
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}
	}
}