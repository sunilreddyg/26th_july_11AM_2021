package framework.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class BeforeClass_And_AfterClass 
{

  @BeforeClass //Invoke before execution of first test annotation
  public void beforeClass() 
  {
	  System.out.println("Class PreCondition");
  }

  @AfterClass //Invoke after exection of last test annotation
  public void afterClass() 
  {
	  System.out.println("Class PostConditions");
  }
  
  @Test  //invoke method to run without object creation 
  public void tc001() 
  {
	  Reporter.log("Tc001 Executed ",true);
	  //Genarate report at html file
  }

  
  @Test  //invoke method to run without object creation 
  public void tc002() 
  {
	  Reporter.log("Tc002 Executed ",true);
	  //Genarate report at html file
  }

}
