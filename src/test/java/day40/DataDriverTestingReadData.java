package day40;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/*
 *We use Apache POI library to do Data Driven Testing
 *****Excel Structure******
 *Excel file ---> WorkBook--->Sheets--->Rows--->cells
 * FileInputStream Class --> to read data
 * FileOutputStream Class --> to write data
 * XSSFWorkbook Class --- workbook
 * XSSFSheet Class -- Sheet
 * XSSFRow Class -- Row // rows are counting from 0
 * XSSFCell Class -- Cell // cells are counting from 1
 * 1. Read Data from Excel File we will see in this Class
 */

public class DataDriverTestingReadData 
{
   public static void main(String[] args) throws IOException
  {
	   String pathofFile = System.getProperty("user.dir")+"\\TestData\\data.xlsx";
	   
	   FileInputStream file = new FileInputStream(pathofFile);
  
	   XSSFWorkbook workbook = new XSSFWorkbook(file);
	  
	   XSSFSheet sheet = workbook.getSheet("Sheet1");
	   int numofrows = sheet.getLastRowNum();
	   
	   XSSFRow row = sheet.getRow(1);
	   int numofcell = row.getLastCellNum();
	   
	   System.out.println("number of rows "+ numofrows);
	   System.out.println("number of cells "+ numofcell);
  
       for(int r=0; r<=numofrows; r++)
       {
    	   XSSFRow currentRow = sheet.getRow(r);
    	   
    	   
    	   for(int c=0; c<numofcell; c++)
    	   {
    		   XSSFCell cell = currentRow.getCell(c);
    		  String data = cell.toString();
    		  System.out.print(data+"\t");
    	   }
    	          System.out.println();
       }
  
  workbook.close();
  file.close();
  
  
  
  
  
  
  
  }
}
