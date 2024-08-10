package day46TestNGListeners;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(day46TestNGListeners.MyListeners.class)
public class OrangeHRM
{
	WebDriver driver;
	@BeforeClass
	void setup() throws InterruptedException
	{
	   driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
       Thread.sleep(5000);
	}

	@Test(priority=1)
	void testLogo() 
	{
      
      boolean status = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
      Assert.assertEquals(status, true);
     
	}
	

	@Test(priority=2)
	void testURL()
	{
      Assert.assertEquals(driver.getCurrentUrl(), "https:/opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	
	@Test(priority=3, dependsOnMethods = {"testURL"})
	void testTitle()
	{
      Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}

	
	@AfterClass
	void teardown()
	{
          driver.quit();
	}
}
