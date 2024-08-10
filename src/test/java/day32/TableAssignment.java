package day32;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TableAssignment 
{
	
  public static void main(String[] args) 
  {
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser is opened");
		
		driver.manage().window().maximize();
		System.out.println("window is max");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("implicit wait is applied");
		
		driver.get("https://blazedemo.com/");
		System.out.println("url is opened");
		
		WebElement fromportdrop = driver.findElement(By.xpath("//select[@name='fromPort']"));
		fromportdrop.click();
		
		Select sel = new Select(fromportdrop);
		
		sel.selectByValue("Boston");		
		
		WebElement toportdrop = driver.findElement(By.xpath("//select[@name='toPort']"));
		toportdrop.click();
		
		Select sel2 = new Select(toportdrop);
		
		sel2.selectByValue("Berlin");
		
		WebElement findFligth = driver.findElement(By.xpath("//input[@value='Find Flights']"));
		findFligth.click();
		
		
		//finding lowest price in table
		
//		List<WebElement> alldata = driver.findElements(By.xpath("//table[@class='table']//tbody//tr"));
		
		List<WebElement> priceElement = driver.findElements(By.xpath("//table[@class='table']//td[6]"));

		
		for(WebElement p :priceElement)
		{
					
			String allprice = p.getText();
			
			char []a=allprice.toCharArray();
			System.out.println(a);
			
			Arrays.sort(a);
			
			
			
			
		}
		
//		List<WebElement>pricelist = driver.findElements(By.xpath("//table[@class='table']//td[6]"));
		
		

		
		
  }
}
