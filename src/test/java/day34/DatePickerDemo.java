package day34;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo 
{
  public static void main(String[] args)
  {
	WebDriver driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.manage().window().maximize();
	
	driver.get("https://jqueryui.com/datepicker/");
//	Switch to frame
	
	driver.switchTo().frame(0);
//	Method 1 using Sendkeys()
	
//	driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("06/07/2024");
	
	//Method 2 Using Date Picker
	//Expected Data
	String year = "2025";
	String month = "May";
	String date = "20";
	
	driver.findElement(By.xpath("//input[@id='datepicker']")).click();
	
//	select month and year
	while(true)
	{
		String currentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		String currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
        
		if(currentMonth.equals(month) && currentYear.equals(year))
		{
			break;
		}
		
		driver.findElement(By.xpath("//span[text()='Next']")).click();
	}
	
//	Select the date
	
	List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
	
	for(WebElement dt:allDates)
	{
		if(dt.getText().equals(date))
		{
			dt.click();
			break;
		}
	}
	
	driver.quit();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
}
}
