package framework.DataDriven.Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_CellType {

	public static void main(String[] args) throws IOException {
		//Target File location
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		System.out.println("file is located");
		
		//Get Existing workbook
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Get Sheet using workbook
		XSSFSheet sht=book.getSheet("Sheet5");
		
		//Get row data counjt
		int LRcount=sht.getLastRowNum();
		int FRcount=sht.getFirstRowNum();
		
		for (int i = FRcount+1; i < LRcount+1; i++) 
		{
			String Exe_status=sht.getRow(i).getCell(2).getStringCellValue();
			
			if(Exe_status.equalsIgnoreCase("y"))
			{
				XSSFCell cell=sht.getRow(i).getCell(0);
				String username=null;
				if(cell.getCellType()==CellType.STRING)
				{
					username=cell.getStringCellValue();
				}
				else if(cell.getCellType()==CellType.NUMERIC)
				{
					username=NumberToTextConverter.toText(cell.getNumericCellValue());
				}
				
				
				System.out.println(username);
				
				
			}
			
			
		}

	

	}

}
