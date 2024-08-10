package day28;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseSpecificWindow 
{
  public static void main(String[] args) 
  {
	  WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		
		Set <String> ids = driver.getWindowHandles();
		System.out.println(ids);
		
		for(String id : ids)
		{
			
			String title = driver.switchTo().window(id).getTitle();
			System.out.println(title);
			
			if(title.equals("Human Resources Management Software | OrangeHRM"))
			{
				driver.close();
				System.out.println("Specified window closed");
			}
		}
  }
}
