 package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown 
{
public static void main(String[] args) 
{
	
	WebDriver driver = new ChromeDriver();
	System.out.println("Browser is opened");
	
	driver.manage().window().maximize();
	System.out.println("window is max");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	System.out.println("implicit wait is applied");
	
	driver.get("https://testautomationpractice.blogspot.com/");
	System.out.println("url is opened");
	
	WebElement dropdown = driver.findElement(By.xpath("//Select[@id='country']"));
		
	Select sel = new Select(dropdown);
//	sel.selectByValue("india");
	
	//capture option from DropDown
	
	List<WebElement> options = sel.getOptions();
	System.out.println("Number of option in a drop down " + options.size());
	
	
//	Printing the option
	
//	for(int i=0; i<options.size(); i++)
//	{
//		String optiontext = options.get(i).getText();
//		System.out.println("Name of all option in dropdown " + optiontext);
//	}
	
	
	//using for each loop
	
	for(WebElement op : options)
	{
		System.out.println(op.getText());
		if(op.getText().equals("India"))
		{
			op.click();		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
