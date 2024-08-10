package day21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

/*
 Test Case
 ---------
 Launch browser
 Open URL https://demo.opencart.com/
 Validate the title should be "Your Store"
 Close browser
 
 */

public class FirstTestCase 
{
public static void main(String[] args) 
{
//	 WebDriver driver = new ChromeDriver();
	 WebDriver driver = new EdgeDriver();

	 driver.get("https://demo.opencart.com/");
	 
	 String expectedTitle = "Your Store";
	 String actualTitle = driver.getTitle();
	 
	 if(expectedTitle.equals(actualTitle))
	 {
		 System.out.println("Test Case Passed");
	 }
	 else
	 {
		 System.out.println("Test Case failed");
     }
	 
	 driver.quit();
}
}
