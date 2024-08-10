package day40;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataReading
{
public static void main(String[] args) throws IOException 
{
   String path = System.getProperty("user.dir")+"\\TestData\\data.xlsx";	
   
   FileInputStream file = new FileInputStream(path);
   
   XSSFWorkbook workbook = new XSSFWorkbook(file);
   
   XSSFSheet sheet = workbook.getSheet("Sheet1");
   int numOFRows = sheet.getLastRowNum();
   int numOfCell = sheet.getRow(1).getLastCellNum();
   
   for(int r=0; r<=numOFRows; r++)
   {
	   XSSFRow currentRow = sheet.getRow(r);
	   
	   
	   for(int c=0; c<numOfCell; c++)
	   {
		
		  XSSFCell currentCell = currentRow.getCell(c);
		  System.out.print(currentCell.toString()+"\t");
		  
	   }
	   System.out.println();
   }
   
}
}
