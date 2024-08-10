package day22_RelativeLocators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RelativeLocators
{
	WebDriver driver;
 @BeforeClass
 public void setup()
 {
	
	 driver = new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 driver.manage().window().maximize();
	 driver.get("https://automationbookstore.dev/");
 }
 
 @AfterClass
 public void tearDown()
 {
	 driver.quit();
 }
  
 // Book5 is left of Book6 & below Book1
 
 @Test(description = "Test Book5 is left of Book6 & below Book1")
 public void test1()
 {
	WebElement book5 = driver.findElement(RelativeLocator.with(By.tagName("li"))
			.toLeftOf(By.id("pid6")).below(By.id("pid1")));
	
	String idvalue =  book5.getAttribute("id");
	System.out.println(idvalue);
	
	 Assert.assertEquals("pid5", idvalue, idvalue);
 }
 
 
 
 
 
 
 
 
}
