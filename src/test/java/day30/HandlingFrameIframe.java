package day30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrameIframe 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver = new ChromeDriver();
	System.out.println("Browser is opened");
	
	driver.manage().window().maximize();
	System.out.println("window is max");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	System.out.println("implicit wait is applied");
	
	driver.get("https://ui.vision/demo/webtest/frames/");
	System.out.println("url is opened");
	
//	Frame 1
	
	WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));

	driver.switchTo().frame(frame1);
	
	driver.findElement(By.xpath("//form[@name='name1']/div/input")).sendKeys("Vivek Bhau");
	Thread.sleep(3000);
	
	driver.switchTo().defaultContent(); 
	//by using this we go back to main page coz we cant go from one frame to another frame directly
	
	//Frame 2
	WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
    
	driver.switchTo().frame(frame2);
	driver.findElement(By.xpath("//form[@name='name2']/div/input")).sendKeys("Vivek Bhau");
	Thread.sleep(3000);

	driver.switchTo().defaultContent(); 

	//frame 3
	WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
    
	driver.switchTo().frame(frame3);
	driver.findElement(By.xpath("//form[@name='name3']/div/input")).sendKeys("Vivek Bhau");
	Thread.sleep(3000);
	
	//inner Frame

	driver.switchTo().frame(0);
	driver.findElement(By.xpath("//div[@id='i8']//div[@class='AB7Lab Id5V1']")).click();
	

}
}
