package day23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocators 
{
 public static void main(String[] args) throws InterruptedException
 {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
//tag id
	driver.get("https://demo.nopcommerce.com/");
//	driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-shirts");
	
//	tag class
	driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("T-shirts");

	
	
}
}
