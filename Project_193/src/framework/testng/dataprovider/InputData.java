package framework.testng.dataprovider;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class InputData 
{
  @Test(dataProvider = "dp",enabled=false)
  public void tcoo1(String phonename, String description,double price)
  {
	  
  }
  
  @Test(dataProvider="userinfo")
  public void Getuserinfo(String uid, String pwd)
  {
	  
  }

  @DataProvider
  public Object[][] dp() 
  {
    return new Object[][] 
    {
      new Object[] {"iphone11","256 GB",78000.00 },
      new Object[] {"Samsung","128 GB",68000.00 },
      new Object[] {"iphone13","128 GB",48000.00 },
      new Object[] {"iphone13","128 GB",48000.00 },
    };
  }
  
  
  @DataProvider   //Declare method with static inorder to use outside class
  public static String[][] userinfo()
  {
	  String data[][]=new String[3][2];
	  
	  data[0][0]="user1";
	  data[0][1]="pwd1";
	  
	  data[1][0]="user2";
	  data[1][1]="pwd2";
	  
	  data[2][0]="user3";
	  data[2][1]="pwd3";
	  
	  return data;
  }
}
