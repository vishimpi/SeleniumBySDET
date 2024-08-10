package day33;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicPageTable 
{
  public static void main(String[] args)
  {
	  WebDriver driver = new ChromeDriver();
		System.out.println("Browser is opened");
		
		driver.manage().window().maximize();
		System.out.println("window is max");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("implicit wait is applied");
		
		driver.get("https://demo.opencart.com/admin/index.php");
		System.out.println("url is opened");
		
		WebElement username = driver.findElement(By.xpath("//input[@id='input-username']"));
		username.clear();
		username.sendKeys("demo");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='input-password']"));
		password.clear();
		password.sendKeys("demo");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
  }
}
