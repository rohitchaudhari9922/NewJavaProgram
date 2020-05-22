package Domain;

public class Mobile implements Product 
{
	
	@Override
	public void productType() 
	{
		System.out.println("Product Type is Mobile..");
	}
	@Override
	public void productCost(double price) 
	{
		System.out.println("Actual product price is :"+price);
		double totalprice =price+price*5/100; 
		System.out.println("Total price after adding 5% gst is"+totalprice);
	}
}
