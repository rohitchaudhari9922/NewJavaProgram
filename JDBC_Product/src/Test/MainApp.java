package Test;
//Assignment Question -1
import java.sql.*;
import java.util.Scanner;

import Domain.ProductDetails;

public class MainApp 
{
	public static void main(String[] args) 
	{
	
		
		System.out.println("Enter ur choice");
		System.out.println("1.Product Detials with Minimum Price");
		System.out.println("2.Product Detials with Maximum Price");

		Scanner scan=new Scanner(System.in);
		int choice =scan.nextInt();
		
		switch(choice)
		{
			case 1: 
					ProductDetails p1 =new ProductDetails();
					p1.minPrice();
					
					break;
					
			case 2:
					ProductDetails p2 =new ProductDetails();
					p2.maxPrice();
					
					break;
		}
	}
}
