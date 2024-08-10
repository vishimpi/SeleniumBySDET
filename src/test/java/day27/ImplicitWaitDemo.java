package day27;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitWaitDemo {

	public static void main(String[] args) 
	{
		
			WebDriver driver = new ChromeDriver();
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			
//			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			driver.manage().window().maximize();
			
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			
			WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
	
		      username.sendKeys("Admin");
		      
			
			
			
			
			
//			driver.quit();
		}
		}

	


