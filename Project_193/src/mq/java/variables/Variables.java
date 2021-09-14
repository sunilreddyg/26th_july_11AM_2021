package mq.java.variables;

public class Variables
{
	//Instant Variables [Global Variable]
	int num=100;
	String username="darshan";
	boolean status=true;
	
	public void print_variables()
	{
		System.out.println(num);
		System.out.println(username);
		System.out.println(status);
	}

	public static void main(String[] args)
	{	
			Variables var=new Variables();
			int v1=var.num;
			System.out.println(v1);
			
			String v2=var.username;
			System.out.println(v2);
			
			boolean v3=var.status;
			System.out.println(v3);
			
			
			//Calling Instant method
			var.print_variables();
	}

}
