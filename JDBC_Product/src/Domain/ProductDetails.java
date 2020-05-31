package Domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProductDetails 
{
	static Connection con=null;
	Statement stmt =null;
	ResultSet rs=null;
	
	static
	{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/product1?user=root&password=Yellow@897");
			
		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}	
	}
	
	public void minPrice()
	{
		String query="select product_id,product_name,product_price,product_category from product_data1 where product_price=(select MIN(product_price) from product_data1);";
		
		try
		{
			stmt=con.createStatement();

			rs=stmt.executeQuery(query);
			
			if(rs.next())
			{
				System.out.println("ID \t NAME \t Price \t Category");
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getDouble(3)+"\t"+rs.getString(4));
			}
			else
			{
				System.out.println("Product not found");
			}
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	
	}
	public void maxPrice()
	{
		String query="select product_id,product_name,product_price,product_category from product_data1 where product_price=(select MAX(product_price) from product_data1);";
		
		
		try
		{
			stmt=con.createStatement();
			rs=stmt.executeQuery(query);
			
			if(rs.next())
			{
				System.out.println("ID \t NAME \t Price \t Category");
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getDouble(3)+"\t"+rs.getString(4));	
			}
			else
			{
				System.out.println("Product not found");
			}
			
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
		
	}
}
