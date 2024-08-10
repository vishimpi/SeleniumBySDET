package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownAssignment
{
    public static void main(String[] args) 
    {
    	WebDriver driver = new ChromeDriver();
    	System.out.println("Browser is opened");
    	
    	driver.manage().window().maximize();
    	System.out.println("window is max");
    	
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	System.out.println("implicit wait is applied");
    	
    	driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
    	System.out.println("url is opened");
    	
    	WebElement drpdown = driver.findElement(By.xpath("//select[@id='country-list']"));
    	drpdown.click();
    	List<WebElement> options = driver.findElements(By.xpath("//option[@value='1' or @value='2' or @value='3' or @value='4' or @value='5']"));
    	
//    	Select sel = new Select(drpdown);
//    	sel.selectByValue("1");
    	
    	int optionssize = options.size();
    	System.out.println("Size of options = " + optionssize);
    	
    	for(WebElement op:options)
    	{
    		String printoption = op.getText();
    		System.out.println("option printing " + printoption);
    		
    		if(printoption.equals("India"))
    		{
    			op.click();
    		}
    	}
   	
    	driver.quit();
    	
	}
}
