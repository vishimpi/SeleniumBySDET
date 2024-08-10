package day32;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleAutoSuggesion 
{
  public static void main(String[] args) throws InterruptedException 
  {
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser is opened");
		
		driver.manage().window().maximize();
		System.out.println("window is max");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("implicit wait is applied");
		
		driver.get("https://www.google.com/");
		System.out.println("url is opened");

		
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("selenium");
		Thread.sleep(3000);

		
		List<WebElement> suggesions = driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@role='option']"));
		
		System.out.println("Size of suggesions " + suggesions.size());
		
		for (WebElement sug:suggesions)
		{
			String printSugg = sug.getText();
			System.out.println(printSugg);
			
			
			if(printSugg.equals("selenium download"))
		    {
				sug.click();
     			break;
		    }
			
			
			
			
			
			
		}
  }
}
