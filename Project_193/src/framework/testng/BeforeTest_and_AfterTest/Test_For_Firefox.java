package framework.testng.BeforeTest_and_AfterTest;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Test_For_Firefox
{
	
	@BeforeTest
	public void beforetest()
	{
		System.out.println("pretest before launch firefox browser");
	}
	

	  @AfterTest
	  public void afterTest() 
	  {
		  System.out.println("posttest after firefox launch ");
	  }
	  
	  
	  @Test
	  public void Logout()
	  {
		  System.out.println("Logout");
	  }
	  
	  
	  
}
