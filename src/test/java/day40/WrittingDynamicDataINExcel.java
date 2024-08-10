package day40;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WrittingDynamicDataINExcel
{
public static void main(String[] args) throws IOException
{
	//create new xlsx file
	String path = System.getProperty("user.dir")+"\\Testdata\\Myfile_dynamic.xlsx";
	FileOutputStream file = new FileOutputStream(path);
	
	XSSFWorkbook workbook = new XSSFWorkbook();
	XSSFSheet sheet = workbook.createSheet("Data");
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter how many rows?");
	int noOfRows = sc.nextInt();//here we use nextInt coz num of rows in number value
	
	System.out.println("Enter how many cell?");
	int noOfCells = sc.nextInt(); //here we use nextInt coz num of cells in number value
	
	for(int r=0; r<=noOfRows; r++)
	{
		XSSFRow currentRow = sheet.createRow(r);
		
		for(int c=0; c<noOfCells; c++)
		{
			XSSFCell cell = currentRow.createCell(c);
			cell.setCellValue(sc.next()); // here we use next coz we dont know what value user can enter
			
		}
	}
	
	workbook.write(file); // attach wrkbook to file
	workbook.close();
	file.close();
	
	System.out.println("File is created......");
}
}
