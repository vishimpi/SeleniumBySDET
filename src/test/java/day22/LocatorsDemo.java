package day22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo 
{
public static void main(String[] args) 
{
	WebDriver driver = new ChromeDriver();
	
    driver.get("https://demo.opencart.com/");
	driver.manage().window().maximize();
	
//	name locator
//	driver.findElement(By.name("search")).sendKeys("mac");

//	id
//	boolean isDisplayStatus = driver.findElement(By.id("logo")).isDisplayed();
//	System.out.println(isDisplayStatus);
	
//	linkText
//	driver.findElement(By.linkText("Tablets")).click();
	
//	multiple WebElements
	
//	List<WebElement> headerlinks = driver.findElements(By.className("list-inline-item"));
	
//	System.out.println("total number of header links "+headerlinks.size());
	
	
//	tagname
//	List<WebElement> linksonpage = driver.findElements(By.tagName("a"));
	
//	System.out.println("Totl number of links "+ linksonpage.size());
	
//	count total number of image 
	
	List<WebElement> imagesonpage = driver.findElements(By.tagName("img"));
	
	System.out.println("Totl number of links "+ imagesonpage.size());
	
	
	
	
	
	
}
}
