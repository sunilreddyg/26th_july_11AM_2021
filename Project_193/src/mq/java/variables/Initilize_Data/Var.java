package mq.java.variables.Initilize_Data;

public class Var 
{
	String name;   
	//Because it is not define final it accept runtime changes
	
	public void methodA()
	{
		System.out.println(name);
	}

	public static void main(String[] args) {
		
		Var obj=new Var();
		
		obj.name="SunilReddy";  //Assinging value to global variable 
		obj.methodA();
		
		obj.name="ArjunReddy"; //Assinging value to global variable 
		obj.methodA();

	}

}
