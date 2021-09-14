package mq.java.methods.TypesofMethods;

public class MethodTypes 
{
	//Void type method [Method doesn't return any value]
	public void setProductName()
	{
		String name="Iphone";
	}
	
	public String getProductName()
	{
		String name="Samsung";
		return name;
	}
	
	/*
	 * => Other than void all method type return value
	 * => Other than void methods we should declare return keyword at end of the method
	 * => return value should match with method type
	 * => Finally it return value to method name
	 */
	
	public int addition(int a, int b)
	{
		return a+b;
	}
	

	public static void main(String[] args) {
		
		MethodTypes obj=new MethodTypes();
		obj.setProductName();
		
		//Calling return type method
		String productname=obj.getProductName();
		System.out.println(productname);
		
		System.out.println(obj.getProductName().equals("Samsung"));
		
		
		int value=obj.addition(100, 200);
		System.out.println(value+1);
	}

}
