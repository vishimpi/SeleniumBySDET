package day29;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling 
{
  public static void main(String[] args) throws InterruptedException
 {
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser is opened");
		
		driver.manage().window().maximize();
		System.out.println("window is max");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("implicit wait is applied");
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		System.out.println("url is opened");
		
		//1) normal alert with ok button
		
//		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
//		Thread.sleep(3000);
//		Alert alt = driver.switchTo().alert();
//		System.out.println(alt.getText());
//		alt.accept();
		
		//2)Confirmation Alert - ok & cancel
//		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
//     	Thread.sleep(3000);
//		Alert alt = driver.switchTo().alert();
//		System.out.println(alt.getText());
//		alt.dismiss();
		
		//3) giving promt to alert
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
     	Thread.sleep(3000);
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.sendKeys("Vivek Bhau");	
     	Thread.sleep(3000);

		alt.accept();
     	Thread.sleep(3000);

		driver.quit();
 }
}
