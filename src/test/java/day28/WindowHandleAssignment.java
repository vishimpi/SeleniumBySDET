package day28;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleAssignment 
{
public static void main(String[] args) 
{
	WebDriver driver = new ChromeDriver();
	System.out.println("Browser is opened");
	
	driver.manage().window().maximize();
	System.out.println("window is max");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	System.out.println("implicit wait is applied");
	
	driver.get("https://testautomationpractice.blogspot.com/");
	System.out.println("url is opened");
	
	driver.findElement(By.xpath("//input[@class='wikipedia-search-input']")).sendKeys("Java");
	System.out.println("input java / provide String ");
	
	driver.findElement(By.xpath("//input[@class='wikipedia-search-button']")).click();
	System.out.println("Search button press");
	
	List<WebElement> results = driver.findElements(By.xpath("//a[contains(text(),'Java')]"));
	
	int countlinks = results.size();
	System.out.println("count number of links "+ countlinks);
	
	for( WebElement i : results)
	{
		i.click();
		
	}
	System.out.println("Clicked on each link");
	
	Set<String> linksId = driver.getWindowHandles();
	
	for (String ids :linksId )
	{
		System.out.println("All window ids "+ ids);
		
		String title = driver.switchTo().window(ids).getTitle();
		System.out.println(title);
		
		if(title.equals("Java (programming language) - Wikipedia")  || title.equals("Java version history - Wikipedia"))
		{
			driver.close();
		}
	}
	System.out.println("Specific browser window is closed");
	
	

}
}
