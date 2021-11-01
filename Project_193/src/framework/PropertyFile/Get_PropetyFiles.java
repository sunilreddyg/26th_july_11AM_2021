package framework.DataDriven.PropertyFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Get_PropetyFiles 
{
	static FileInputStream fi;
	static Properties repository;
	static String filepath="src\\framework\\DataDriven\\PropertyFile\\InputData.properties";
	
	public static void getpropertyfile_Connection() 
	{
		try {
			fi=new FileInputStream(filepath);
			repository=new Properties();
			repository.load(fi);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static String getpropertyvalue(String keyname)
	{
		return repository.getProperty(keyname);
	}

}
