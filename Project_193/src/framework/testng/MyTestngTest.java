package framework.testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTestngTest 
{
  
  @Test  //invoke method to run without object creation 
  public void tc001() 
  {
	  Reporter.log("Tc001 Executed ");
	  //Genarate report at html file
  }

  
  @Test  //invoke method to run without object creation 
  public void tc002() 
  {
	  Reporter.log("Tc001 Executed ");
	  //Genarate report at html file
  }
}
