package test;

import java.util.Scanner;

import Domain.Product;
import Factory.ProductFactory;

public class ProductSimulator 
{
	public static void main(String[] args) {
		System.out.println("Select Product");
		System.out.println("1. Mobile");
		System.out.println("2.Laptop");
		Scanner s =new Scanner(System.in);
		
		int choice =s.nextInt();
		
		ProductFactory pf = new ProductFactory();
		Product p1 = pf.getProduct(choice);
		
		System.out.println("Enter the Product Price");
		double price=s.nextDouble();
		
		p1.productType();
		p1.productCost(price);
	}
}
