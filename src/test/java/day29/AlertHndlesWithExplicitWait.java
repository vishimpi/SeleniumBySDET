package day29;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertHndlesWithExplicitWait 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver = new ChromeDriver();
	System.out.println("Browser is opened");
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
	driver.manage().window().maximize();
	System.out.println("window is max");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	System.out.println("implicit wait is applied");
	
	driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	System.out.println("url is opened");
	
	//1) normal alert with ok button
	
    driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
	Thread.sleep(3000);
    wait.until(ExpectedConditions.alertIsPresent()).accept();
}
}
