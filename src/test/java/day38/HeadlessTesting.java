package day38;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessTesting
{
   public static void main(String[] args) 
   {
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--headless=new"); // setting for headless mode of execution.
	
	WebDriver driver = new ChromeDriver(options);
	
	driver.get("https://demo.opencart.com/");
	System.err.println("Browser and url is open");
	
	/*headless testing is the backend testing which is run in background without using ui
	 * 1. we can do multiple taske (since execution happened backend)
	 * 2. faster execution
	 * #Disadvantages#
	 * 1. user can't see action on the page. so he can't understand flow of the test and software*/
	
	//we generally use this when we have all test cases and all are running fine with no failure then we go with headless testing 
	
}
}
