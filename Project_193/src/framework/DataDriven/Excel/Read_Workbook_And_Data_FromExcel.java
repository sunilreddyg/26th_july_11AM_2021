package framework.DataDriven.Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Workbook_And_Data_FromExcel {

	public static void main(String[] args) throws IOException
	{
		
		//Target file location
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		System.out.println("File located");
		
		//Get Workbook Access
		XSSFWorkbook book=new XSSFWorkbook(fi);
		System.out.println("Workbook is accessed");
		
		//Read Sheet Using above workbook
		XSSFSheet sht=book.getSheet("config");
		
		//Get Row Using aboave sheet
		XSSFRow row=sht.getRow(1);
		
		//Get Cell
		XSSFCell cell=row.getCell(0);
		
		//Read string characters at cell
		String browsername=cell.getStringCellValue();
		System.out.println(browsername);
		
		
		//Read url
		String url=row.getCell(1).getStringCellValue();
		System.out.println(url);
		
		//Read OS
		String OS=row.getCell(2).getStringCellValue();
		System.out.println(OS);
		
		//Get Thread Count
		String count=row.getCell(3).getStringCellValue();
		System.out.println(count);
		
	

	}

}
