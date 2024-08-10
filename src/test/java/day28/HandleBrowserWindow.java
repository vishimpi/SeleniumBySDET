package day28;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserWindow 
{
  public static void main(String[] args) 
  {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
	
	Set<String> windowIds = driver.getWindowHandles();
	System.out.println(windowIds);
	//Approach 1
	
	List<String> windowlist = new ArrayList<String>(windowIds);
	String parentId = windowlist.get(0);
	String childId = windowlist.get(1);
	
	driver.switchTo().window(childId);
	System.out.println(driver.getTitle());
	
	
	driver.switchTo().window(parentId);
	System.out.println(driver.getTitle());
	
	
	
//	Apporoch 2
	for(String id:windowIds)
	{
		String title = driver.switchTo().window(id).getTitle();
		
		if(title.equals("OrangeHRM"))
		{
			System.out.println(driver.getCurrentUrl());
			//Some validation on parent window
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

  }
}
