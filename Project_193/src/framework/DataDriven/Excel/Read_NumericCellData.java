package framework.DataDriven.Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_NumericCellData {

	public static void main(String[] args) throws Exception {
		
		//Target file location
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		System.out.println("File located");
		
		//Get Workbook Access
		XSSFWorkbook book=new XSSFWorkbook(fi);
		System.out.println("Workbook is accessed");
		
		//Read Sheet Using above workbook
		XSSFSheet sht=book.getSheetAt(1);
		
		//Get Row Using aboave sheet
		XSSFRow row=sht.getRow(1);
	
		//Get ProductID 
		double productid_in_dble=row.getCell(0).getNumericCellValue();
		
		//Convert double format value into numeric format
		String productid_in_text=NumberToTextConverter.toText(productid_in_dble);
		System.out.println("Prodcut id in text format is --> "+productid_in_text);
		
		//Read Product Price in decimal format
		double productprice=row.getCell(1).getNumericCellValue();
		System.out.println(productprice);
		
		//Convert double value into number format
		double quantity_in_dble=row.getCell(2).getNumericCellValue();
		//Convert primitive into non primitive
		Double d=new Double(quantity_in_dble);
		System.out.println("Double value in integer is --> "+d.intValue());
		
		
		//Convert double value into long value
		Double mobile_in_dble=row.getCell(3).getNumericCellValue();
		System.out.println("Mobile number is --> "+mobile_in_dble.longValue());
	}

}
