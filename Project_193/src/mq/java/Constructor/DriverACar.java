package mq.java.Constructor;

public class DriverACar 
{

	public DriverACar() 
	{
		System.out.println("Hold Clutch");
	}
	
	//instant Method
	public void Gare1()
	{
		System.out.println("Changed to gare1");
	}
	
	//Instance Method
	public void Gare2()
	{
		System.out.println("changed to gare2");
	}

	public static void main(String[] args) {
		
		new DriverACar().Gare1();
		new DriverACar().Gare2();
		
		
		DriverACar obj=new DriverACar();
		obj.Gare1();
		obj.Gare2();
		
		

	}

}
