package mq.java.methods.parameters;

public class Product 
{
	
	void print_product(String productname)
	{
		System.out.println(productname);
	}
	
	void print_product_info(String productname, double price)
	{
		System.out.println(productname);
		System.out.println(price);
	}

	public static void main(String[] args) 
	{
		
		Product product=new Product();
		product.print_product("Iphone");
		
		product.print_product_info("Iphone", 65000.00);
		product.print_product_info("Samsung", 50000.00);

	}

}
