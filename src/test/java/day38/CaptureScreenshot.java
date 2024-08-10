package day38;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

@SuppressWarnings("unused")
public class CaptureScreenshot 
{
  public static void main(String[] args) 
  {
	  WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.nopcommerce.com/");
		
		//full page screenshot
//		TakesScreenshot ts = (TakesScreenshot)driver;
//		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
//		File dest = new File(System.getProperty("user.dir")+"\\ScreenShots\\fullpage.png");
//		sourceFile.renameTo(dest);//copy source file into target file
		
		
		//capture snap of specific section
//		WebElement featureProducts = driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
//		File sourceFile = featureProducts.getScreenshotAs(OutputType.FILE);
//		File dest = new File(System.getProperty("user.dir")+"\\ScreenShots\\featureProducts.png");
//		sourceFile.renameTo(dest);//copy source file into target file
		
		
		//capture snap of specific WebElement
		WebElement logo = driver.findElement(By.xpath("//div[@class='header-logo']//img"));
		File sourceFile = logo.getScreenshotAs(OutputType.FILE);
		File dest = new File(System.getProperty("user.dir")+"\\ScreenShots\\logo.png");
		sourceFile.renameTo(dest);//copy source file into target file
	
		driver.quit();
   }
}
