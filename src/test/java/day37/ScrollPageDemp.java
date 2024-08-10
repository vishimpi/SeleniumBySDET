package day37;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollPageDemp
{
  public static void main(String[] args) throws InterruptedException 
  {
	  WebDriver driver = new ChromeDriver();
		
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.manage().window().maximize();
			
			driver.get("https://demo.nopcommerce.com/");
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			
			//1. scroll down page by pixel number
			
			//js.executeScript("window.scrollBy(0, 1200)", "");
			//System.out.println(js.executeScript("return window.pageYOffset;"));
			
			//2. scroll till element is visible
			WebElement ele = driver.findElement(By.xpath("//div[@class='title']//strong[text()='Community poll']"));
			js.executeScript("arguments[0].scrollIntoView()", ele);
			System.out.println(js.executeScript("return window.pageYOffset;"));
			
			//3. scroll till end of page
			js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
			System.out.println(js.executeScript("return window.pageYOffset;"));
			
			Thread.sleep(3000);
			//4. scroll back to initial point
			js.executeScript("window.scrollBy(0, -document.body.scrollHeight)");

  }
}
