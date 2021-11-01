package framework.DataDriven.PropertyFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Read_Data_From_PropertyFiles {

	public static void main(String[] args) throws IOException
	{
		
		
		//Target file location
		FileInputStream fi=new FileInputStream("src\\framework\\DataDriven\\PropertyFile\\InputData.properties");
		System.out.println("file is located");
		
		//Create object for properties
		Properties repository=new Properties();
		repository.load(fi);  //This action load all input data to repository
		
		//Get Any value from repository using keyname
		String pageurl=repository.getProperty("url");
		System.out.println(pageurl);
		
		//Get Any value from repository using keyname
		String ValidID=repository.getProperty("username.valid");
		System.out.println(ValidID);
		
		
	}

}
