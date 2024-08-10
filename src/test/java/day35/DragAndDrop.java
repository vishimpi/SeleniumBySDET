package day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop 
{
	 public static void main(String[] args) throws InterruptedException 
	   {
		WebDriver driver = new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.manage().window().maximize();
			
			driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

			WebElement rome = driver.findElement(By.xpath("//div[@id='box6'][text()='Rome']"));
			WebElement italy = driver.findElement(By.xpath("//div[@id='box106'][text()='Italy']"));
			
			Actions act = new Actions(driver);
			act.dragAndDrop(rome, italy).perform();

	   }
}