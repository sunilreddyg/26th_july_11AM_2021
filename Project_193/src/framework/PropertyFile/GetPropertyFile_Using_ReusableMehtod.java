package framework.DataDriven.PropertyFile;

public class GetPropertyFile_Using_ReusableMehtod {

	public static void main(String[] args) 
	{
		
		Get_PropetyFiles.getpropertyfile_Connection();
		System.out.println(Get_PropetyFiles.getpropertyvalue("username.invalid"));
	}

}
