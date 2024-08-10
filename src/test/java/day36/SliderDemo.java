package day36;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDemo
{
public static void main(String[] args) 
{
	WebDriver driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.manage().window().maximize();
	
	driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
	
	// Minimum Slider
	WebElement min_slider = driver.findElement(By.xpath("//div[@class='price-range-block']//span[@style='left: 0%;']"));
	
	System.out.println("Location of the min slider = "+min_slider.getLocation());
	
	Actions act = new Actions(driver);
	act.dragAndDropBy(min_slider, 100, 250).perform();
	
	
	//Maximum Slider
	WebElement max_slider = driver.findElement(By.xpath("//div[@class='price-range-block']//span[@style='left: 100%;']"));
	System.out.println("Location of the max slider = " + max_slider.getLocation());
	act.dragAndDropBy(max_slider, -80, 250).perform();
	
	
	


	
	
	
	
	
}
}
