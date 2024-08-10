package day40;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WrittingDataInSpecificRowAndCell
{
  public static void main(String[] args) throws IOException
  {
		//create new xlsx file
		String path = System.getProperty("user.dir")+"\\Testdata\\MyfileRandom.xlsx";
		FileOutputStream file = new FileOutputStream(path);
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Data");
		
		XSSFRow row = sheet.createRow(3);
		XSSFCell cell = row.createCell(4);
		
		cell.setCellValue("Vivek");
	
		workbook.write(file); // attach wrkbook to file
		workbook.close();
		file.close();
		
		System.out.println("File is created......");
  }
}
