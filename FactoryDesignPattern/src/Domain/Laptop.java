package Domain;

public class Laptop implements Product 
{
	@Override
	public void productType() 
	{
		System.out.println("Product Type is Laptop..");
	}
	@Override
	public void productCost(double price) 
	{
		System.out.println("Actual product price is :"+price);
		double totalprice =price+price*10/100; 
		System.out.println("Total price after adding 10% gst is"+totalprice);
	}
}
