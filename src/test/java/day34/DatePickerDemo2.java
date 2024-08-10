package day34;

import java.time.Duration;
import java.time.Month;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePickerDemo2 
{
	//user define function for converting month from string = month Object
	static Month convrtMonth(String month)
	{
		HashMap <String, Month> monthMap = new HashMap <String, Month>();
		monthMap.put("January", Month.JANUARY);
		monthMap.put("February", Month.FEBRUARY);
		monthMap.put("March", Month.MARCH);
		monthMap.put("April", Month.APRIL);
		monthMap.put("May", Month.MAY);
		monthMap.put("June", Month.JUNE);
		monthMap.put("July", Month.JULY);
		monthMap.put("August", Month.AUGUST);
		monthMap.put("September", Month.SEPTEMBER);
		monthMap.put("October", Month.OCTOBER);
		monthMap.put("November", Month.NOVEMBER);
		monthMap.put("December", Month.DECEMBER);
		
		Month vmonth = monthMap.get(month);
		
		if(vmonth == null)
		{
			System.out.println("Invalid Month...");
		}
        
		return vmonth;
		
	}
	
	static void selectDate(WebDriver driver, String reqyear, String reqmonth, String reqdate)
	{
		
		//Select year
		WebElement yearDropD = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		
		Select selectyear = new Select(yearDropD);	
		selectyear.selectByValue(reqyear);
		
		//Select month
		
		while(true)
		{
		String displayMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		
		//convert reqmonth and  displayMonth into Months Object
		
		Month expectedMonth = convrtMonth(reqmonth);
		Month currentMonth = convrtMonth(displayMonth);
		
		//compare
		int result = expectedMonth.compareTo(currentMonth);// this will return 3 value <0 or 0 or >0
		//if its 0 then months are equal
		//if its >0 then future months
		//if its <0 them past months
		
		if(result<0)
		{
			//past month
			driver.findElement(By.xpath("//span[text()='Prev']")).click();
		}
		else if(result>0)
		{
			//future month
			driver.findElement(By.xpath("//span[text()='Next']")).click();

		}
		else
		{
			break;
		}
		
		}
		
		
		//Select Date
		List<WebElement> alldates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//td//a"));
		
		for(WebElement dt:alldates)
		{
			if(dt.getText().equals(reqdate))
			{
				dt.click();
				break;
			}
		}
		
		
	}
	
	
	
public static void main(String[] args) 
{
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.manage().window().maximize();
	
	driver.get("https://testautomationpractice.blogspot.com/");
	
	String reqyear = "2025";
	String reqmonth = "April";
	String reqdate = "15"; 
	
	driver.switchTo().frame("frame-one796456169");
	driver.findElement(By.xpath("//span[@class='icon_calendar']")).click();
	
	selectDate(driver, reqyear, reqmonth, reqdate);
	
	
	
}
}
