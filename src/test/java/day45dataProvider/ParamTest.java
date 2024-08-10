package day45dataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamTest
{
	/* Parallel testing using xml file
	 * 1) Create test case
	 * 2) Create xml file to run test case
	 * 3) passed browser name parameter from xml file and received in setup()
	 * 4) execute test case on chrome, edge & firefox serial execution
	 * 5) execute test case on chrome, edge & firefox parallel execution
	 * */
	WebDriver driver;
	@BeforeClass
	@Parameters({"browser"})
	void setup(String br) throws InterruptedException
	{
		switch(br)
		{
		case "chrome": driver = new ChromeDriver(); break;
		case "firefox": driver = new FirefoxDriver(); break;
		case "edge": driver = new EdgeDriver(); break;

		default: System.out.println("Invalid browser");return;
		// return will exit from test if the browser is invalid
		}
		
		
		
		
		
		
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
	void testTitle()
	{
      Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}

	
	@Test(priority=3)
	void testURL()
	{
      Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	@AfterClass
	void teardown()
	{
          driver.quit();
	}
}
