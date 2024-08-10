package day37;

import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecuterDemo
{
  public static void main(String[] args)
  {
	  WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement inputbox = driver.findElement(By.xpath("//input[@id='name']"));
		
		//Alternator way of sendKeys() and click() when you get elementInterceptedException

		//sendKeys Action perform using javascriptExecutor
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value', 'scott')", inputbox);
   
		//click Action perform using javascriptExecutor
		WebElement radiobtn = driver.findElement(By.xpath("//input[@id='male'][@type='radio']"));
		js.executeScript("arguments[0].click()", radiobtn);
  }
}
