package mq.java.variables.Initilize_Data;

public class Variable_Initilization_Using_Conditions {

	public static void main(String[] args) {
		
		
		if(true)
		{
			int a=100;  
			/*
			 * =>a is a local variable intiated inside blocks
			 * => So that we can't use a value outside blocks 
			 */
		}
		
		int b;
		if(true)
		{
			b=200;
		}
		System.out.println(b);
		
		
		int c = 0;
		boolean flag = false;
		if(flag==true)
		{
			c=100;
		}
		else if(flag==false)
		{
			c=50;
		}
		System.out.println(c);
		

	}

}
