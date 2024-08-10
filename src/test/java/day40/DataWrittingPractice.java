package day40;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataWrittingPractice
{
public static void main(String[] args) throws IOException
{
	String path = System.getProperty("user.dir")+"\\Testdata\\data11.xlsx";
	FileOutputStream file = new FileOutputStream(path);
	
	XSSFWorkbook wrkbk = new XSSFWorkbook();
	
	XSSFSheet sheet = wrkbk.createSheet("data");
	XSSFRow row = sheet.createRow(0);
	XSSFCell cell = row.createCell(0);
	
	cell.setCellValue("vivek");
	wrkbk.write(file);
	wrkbk.close();
	file.close();
	
}
}
