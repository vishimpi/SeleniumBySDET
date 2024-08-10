package day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction 
{
public static void main(String[] args) 
{
WebDriver driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.manage().window().maximize();
	
	driver.get("https://demo.opencart.com/");
	
	WebElement dekstops = driver.findElement(By.xpath("//a[text()='Desktops']"));
	
	WebElement mac = driver.findElement(By.xpath("//li//a[text()='Mac (1)']"));
	
	Actions act = new Actions(driver);
	
	act.moveToElement(dekstops).moveToElement(mac).click().perform();
	
	

}
}
