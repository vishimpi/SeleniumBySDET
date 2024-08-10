package day32;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable 
{
public static void main(String[] args) 
{
	WebDriver driver = new ChromeDriver();
	System.out.println("Browser is opened");
	
	driver.manage().window().maximize();
	System.out.println("window is max");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	System.out.println("implicit wait is applied");
	
	driver.get("https://testautomationpractice.blogspot.com/");
	System.out.println("url is opened");
	
	//find total number of rows in table

	List<WebElement> row = driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
	
	int sizeOftablerow = row.size();
	System.out.println(sizeOftablerow);
	
	
	//find total number of column in table

	List<WebElement> column = driver.findElements(By.xpath("//table[@name='BookTable']//tr//th"));
    
	int sizeofcolunm = column.size();
	System.out.println(sizeofcolunm);
	
	//read data from specific row and column (ex: 5th row and 1st column)
	WebElement tdata = driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]"));
	String printData = tdata.getText();
	System.out.println(printData);
	
	
	//read all data from table
	
	for(WebElement data:row)
	{
		String printalldata = data.getText();
		System.out.println(printalldata+"\t");
	}
	
	//print the book name whose author is mukesh
	for(int r=2; r<=row.size(); r++)
	{
	String authorname = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
//    System.out.println(authorname);
    
    if(authorname.equals("Mukesh"))
    {
    String bookname = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
    System.out.println(bookname+"  "+authorname);
    }
    
    
    
	}
	
	
	
	
	driver.quit();
	
	
	
	
	
	
	
	
	
	
	
}
}
