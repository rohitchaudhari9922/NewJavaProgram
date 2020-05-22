package Factory;

import Domain.Laptop;
import Domain.Mobile;
import Domain.Product;

public class ProductFactory 
{
	public Product getProduct(int producttype) //Factory method
	{
		Product p1=null;
		switch(producttype)
		{
		case 1: p1= new Mobile();
					break;
		case 2: p1=new Laptop();
					break;
		}
		
		return p1;
	}
}
