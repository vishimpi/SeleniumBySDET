package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BoostrapDropDown 
{
 public static void main(String[] args) 
 {
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser is opened");
		
		driver.manage().window().maximize();
		System.out.println("window is max");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("implicit wait is applied");
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		System.out.println("url is opened");
		
		//select single option from drop down
		
		driver.findElement(By.xpath("//button[contains(@class, 'multiselect ')]")).click();
		
		driver.findElement(By.xpath("//input[@value='Java']")).click();
		
		//capture all the options and find out size
		
		List <WebElement> checkboxes = driver.findElements(By.xpath("//ul[contains(@Class,'multiselect')]//label"));
		int noOfBox = checkboxes.size();
		
		System.out.println(noOfBox);
				
		
		
//		printing options frm dropdown boxes name
		for(WebElement options : checkboxes)
		{
			System.out.println(options.getText());
		}
		
		//select multi option from drop
		for(WebElement options : checkboxes)
		{
			String option = options.getText();
			if(option.equals("MySQL") || option.equals("Python"))
			{
				options.click();	
			}
				
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
 }
}
