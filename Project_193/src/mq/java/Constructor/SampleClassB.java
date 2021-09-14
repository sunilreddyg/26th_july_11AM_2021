package mq.java.Constructor;

public class SampleClassB {

	public SampleClassB() 
	{
		System.out.println("Constcutor executed");
	}
	
	public static void main(String args[])
	{
		
		/*
		 * Calling Public class Constructor
		 * 		new Classname();
		 */
		new SampleClassA();
	}

}
