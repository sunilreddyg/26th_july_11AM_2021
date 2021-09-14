package mq.java.Constructor;

public class Constructor_With_Parameters 
{
	
	int a;
	
	public Constructor_With_Parameters(int num) 
	{
		a=num;
	}
	
	//instant method
	public void dividedby()
	{
		System.out.println(a/2);
	}
	
	public static void main(String[] args) 
	{
		
			Constructor_With_Parameters obj=new Constructor_With_Parameters(200);
			obj.dividedby();
	}

}
