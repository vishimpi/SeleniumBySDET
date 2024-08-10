package day38;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLhandling //Secure Socket Later
{
public static void main(String[] args)
{
	ChromeOptions options = new ChromeOptions();
	options.setAcceptInsecureCerts(true); // accept SSL certs
	
	WebDriver driver = new ChromeDriver(options);
	driver.manage().window().maximize();
	
	driver.get("https://expired.badssl.com/");
	
	System.out.println("Title of the page: "+ driver.getTitle());   
}
}
