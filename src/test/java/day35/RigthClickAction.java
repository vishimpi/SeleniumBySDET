package day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RigthClickAction 
{
	public static void main(String[] args) 
	{
	WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement rigthClickMe = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		
		Actions act = new Actions(driver);
		act.contextClick(rigthClickMe).build().perform();
		
		driver.findElement(By.xpath("//li//span[text()='Copy']")).click();//click on copy
		
		driver.switchTo().alert().accept();
		
	}	
}
