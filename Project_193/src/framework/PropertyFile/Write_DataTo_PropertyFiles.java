package framework.DataDriven.PropertyFile;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Write_DataTo_PropertyFiles
{

	public static void main(String[] args) throws IOException 
	{
		
		
		//Create object for propertyFiles
		Properties repository=new Properties();
		
		//Add Object to properties
		repository.setProperty("Result1","Tc001_Testpass");
		repository.setProperty("Result2","Tc002_TestFail");
		repository.setProperty("Result3","Tc003_Testpass");
		
		//Store Object to Input File
		FileOutputStream fo=new FileOutputStream("TestData\\OP.properties");
		repository.store(fo, "Test001_UserLogin");

	}

}
