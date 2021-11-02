package oops.Inheritance;

public class ChildB extends ChildA
{
	
	

	public static void main(String[] args) {
		
		ChildA obj=new ChildB();
		obj.method1();   //Parent Class
		obj.method2();   //ChildA class method
		
		
		Parent ref=new ChildB();
		ref.method1();  //Parent Class

	}

}
