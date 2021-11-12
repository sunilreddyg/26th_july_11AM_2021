package framework.testng.listeners;

import org.testng.annotations.Test;

public class SampleTest 
{
	
	@Test(groups= {"smoke"})
	  public void tc001() 
	  {
		  System.out.println("tc001 executed");
	  }
	  
	  @Test(groups="Reg2")
	  public void tc002() 
	  {
		  System.out.println("tc002 executed");
	  }
	  
	  
	  @Test(groups="smoke")
	  public void tc003() 
	  {
		  System.out.println("tc003 executed");
	  }

}
