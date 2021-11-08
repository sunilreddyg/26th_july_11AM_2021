package framework.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;

public class Before_And_AfterMethod 
{

  @BeforeMethod
  public void beforeMethod() 
  {
	  System.out.println("Test Precondition");
  }

  @AfterMethod
  public void afterMethod() 
  {
	  System.out.println("Test post Condition");
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

  
  @Test  //invoke method to run without object creation 
  public void tc003() 
  {
	  Reporter.log("Tc003 Executed ",true);
	  //Genarate report at html file
  }


}
