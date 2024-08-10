package day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods 
{
	public static void main(String[] args) 
	{
		 WebDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.get("https://demo.nopcommerce.com/register");
		 
//		 WebElement logo =  driver.findElement(By.xpath("//div[@class='header-logo']/a/img"));
	
		//isDisplayes() - we can check display status of the element
//		 boolean logoisdisplay = logo.isDisplayed();
//		System.out.println(logoisdisplay);
		
		//isEnabled() - We can check enable/disable status of the element/operational element
//		boolean isenabled = driver.findElement(By.xpath("//input[@id='small-searchterms']")).isEnabled();
//		System.out.println(isenabled);
		
        //isSelected() - we can use to check the element is selected or not
		WebElement malebutton = driver.findElement(By.xpath("//input[@id='gender-male']"));
		WebElement femalebutton = driver.findElement(By.xpath("//input[@id='gender-female']"));
		femalebutton.click();
		System.out.println(malebutton.isSelected()); //return false coz not selected
         System.out.println(femalebutton.isSelected()); // return true
     }
}
