package framework.testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assertions {
  @Test
  public void tc001()
  {
	  Assert.assertEquals("mindq", "mindq");
	  Reporter.log("Both strings are equal");
  }
  
  
  @Test
  public void tc002()
  {
	  String name="Sunil";
	  boolean flag=name.contains("S");
	  Assert.assertTrue(flag);
	  System.out.println("Expected characters available");
  }
  
  

}
