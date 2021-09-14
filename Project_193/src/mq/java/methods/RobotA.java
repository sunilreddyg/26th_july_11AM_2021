package mq.java.methods;


public class RobotA
{
	
	public void StartWalk()
	{
		System.out.println("Walk Started");
	}
	
	public void Stopwalk()
	{
		System.out.println("Walk stopped");
	}
	
	
	public static void main(String[] args)
	{
		
		new RobotA().StartWalk();
		new RobotA().Stopwalk();
	
	}


}
