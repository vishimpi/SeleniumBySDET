package day36;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardActionDemo 
{
public static void main(String[] args) 
{
	WebDriver driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.manage().window().maximize();
	
	driver.get("https://text-compare.com");
	
	WebElement text1 = driver.findElement(By.xpath("//textarea[@id='inputtext1']"));
	WebElement text2 = driver.findElement(By.xpath("//textarea[@id='inputtext2']"));
	
	text1.sendKeys("WELCOME");
}
}
