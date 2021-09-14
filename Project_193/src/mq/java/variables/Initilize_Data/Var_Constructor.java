package mq.java.variables.Initilize_Data;

public class Var_Constructor 
{
	
	int a;
	public Var_Constructor(int num) 
	{
		a=num;  
		//Constrcutor parameter initilizing data to global variable
	}
	
	public void methodA()
	{
		System.out.println(100+a);
	}
	
	public static void main(String[] args) 
	{
		
		/*
		 * Initilize data to Global Variable
		 * using constructor
		 */
		Var_Constructor var=new Var_Constructor(250);
		var.methodA();

	}

}
