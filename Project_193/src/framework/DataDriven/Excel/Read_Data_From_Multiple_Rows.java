package framework.DataDriven.Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data_From_Multiple_Rows 
{

	public static void main(String[] args) throws IOException 
	{
		
		//Target File location
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		System.out.println("file is located");
		
		//Get Existing workbook
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Get Sheet using workbook
		XSSFSheet sht=book.getSheet("Sheet3");
		
		//Get row data counjt
		int LRcount=sht.getLastRowNum();
		int FRcount=sht.getFirstRowNum();
		
		System.out.println("Data Started at row is --> "+FRcount);
		System.out.println("Data Ended at row is --> "+LRcount);
		
		for (int i = FRcount+1; i < LRcount+1; i++) 
		{
			
			String UID=sht.getRow(i).getCell(0).getStringCellValue();
			String PWD=sht.getRow(i).getCell(1).getStringCellValue();
			System.out.println(UID+"  "+PWD);
		}
		
		
		
		
	}

}
