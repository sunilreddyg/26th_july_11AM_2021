package framework.DataDriven.Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Read_Excel_File {

	public static void main(String[] args) throws FileNotFoundException 
	{
		/*
		 * Inorder to read excel binary files we shoudl use 
		 * FileinputStream Class
		 */
		
		File file=new File("TestData\\InputData.xlsx");
		FileInputStream fi=new FileInputStream(file);
		System.out.println("File is located");
		

	}

}
