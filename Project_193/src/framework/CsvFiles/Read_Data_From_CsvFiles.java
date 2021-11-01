package framework.DataDriven.CsvFiles;

import java.io.FileReader;

import com.opencsv.CSVReader;

public class Read_Data_From_CsvFiles {

	public static void main(String[] args) throws Exception {
	
		//Target file
		String filepath="src\\framework\\DataDriven\\CsvFiles\\InputData.csv";
		FileReader reader=new FileReader(filepath);
		System.out.println("file is located");
		
		//Create object for csv reader
		CSVReader csv=new CSVReader(reader);
		
		//Read first record from file
		String headers[]=csv.readNext();
		System.out.println(headers[0]+"      "+headers[1]);
		
		//Read second record from file
		String Rec[]=csv.readNext();
		System.out.println(Rec[0]+"    "+Rec[1]);
		
		
		String read[];
		while((read=csv.readNext())!=null)
		{
			System.out.println(read[0]+"     "+read[1]);
		}
		
		
	}

}
