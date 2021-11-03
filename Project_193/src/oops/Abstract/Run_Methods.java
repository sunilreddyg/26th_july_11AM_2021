package oops.Abstract;

public class Run_Methods 
{

	public static void main(String[] args) 
	{
		Repo obj=new ChildA();
		obj.method1();  //Abstarct method
		obj.method2();  //Abstarct method
		obj.method3();   
		
		System.out.println(Repo.name);

	}

}
