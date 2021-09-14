package mq.java.variables.Initilize_Data;

public class Final_Keyword 
{
	
	final String EmployerID="E10012";
	
	public void methodA()
	{
		System.out.println(EmployerID);
	}

	public static void main(String[] args) 
	{
		Final_Keyword obj=new Final_Keyword();
		obj.methodA();
		System.out.println(obj.EmployerID);  
		//Final Keyword doesn't allow to override varaible value
		

	}

}
