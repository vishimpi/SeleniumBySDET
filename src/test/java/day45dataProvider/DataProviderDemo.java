package day45dataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/*
 * DataProvider = its a method which will create some data and pass it to the another 
 *                test method.
 *                without using looping u can use data provider
 *                it always return 2 dimensional Object array (line 63)
 * */

public class DataProviderDemo
{ 
	
	WebDriver driver;
	@BeforeClass
	void setup()
	{
       driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
       
	}

	@Test(dataProvider="dp")
	void testlogin(String email, String pwd) throws InterruptedException
	{
      driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);
      driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(pwd);
      driver.findElement(By.xpath("//input[@value='Login']")).click();
      Thread.sleep(2000);
      
      boolean status = driver.findElement(By.xpath("//h2[text()='My Account']")).isDisplayed();
      
      if(status==true)
      {
    	  driver.findElement(By.xpath("//a[text()='Logout'][@class='list-group-item']")).click(); 
    	  Assert.assertTrue(true);
      }
      else
      {
    	  Assert.fail();
      }
	}

	@AfterClass
	void teardown()
	{
          driver.quit();
	}
	
	@DataProvider(name="dp", indices= {0})
	Object[][] loginData()
	{
		Object data[][] = {{"demo999@gmail.com", "Demo@123"},
				           {"pavanol123@gmail.com", "test@123"},
		                   {"john@gmail.com", "test@123"}};
		
		return data;
				      
	}
				
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
