package day26;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	String title = driver.getTitle();
	
	if(title.equals("OrangeHRM"))
	{
		System.out.println("Test case is passed");
	}
	else
	{
		System.out.println("Test case is failed");
	}
	
	
	String url = driver.getCurrentUrl();
	if(url.equals("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"))
	{
		System.out.println("Test case1 is passed");
	}
	else
	{
		System.out.println("Test case1 is failed");
	}
	
	
//	getWindowHandle return the id of browser window
	
	String windowhandleid = driver.getWindowHandle();
	
	System.out.println(windowhandleid);
	
	Thread.sleep(5000);
	
//	getWindowHandles 
	
	driver.findElement(By.linkText("OrangeHRM, Inc")).click();
	
	Set<String> windowaid = driver.getWindowHandles();
	System.out.println(windowaid);
	
	
	Object [] idset = windowaid.toArray();
	System.out.println(idset[1]);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	driver.quit();
}
}
