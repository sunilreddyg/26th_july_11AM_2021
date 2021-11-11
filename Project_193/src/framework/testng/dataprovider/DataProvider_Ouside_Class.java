package framework.testng.dataprovider;

import org.testng.annotations.Test;

public class DataProvider_Ouside_Class {

	//Include class name of dataprovider class inorder to use outside classs
	@Test(dataProvider="userinfo",dataProviderClass=InputData.class)
	public void Test_With_Data(String UID, String PWD)
	{
		
	}

}
