package day29;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckboxes 
{
  public static void main(String[] args) throws InterruptedException 
  {
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser is opened");
		
		driver.manage().window().maximize();
		System.out.println("window is max");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("implicit wait is applied");
		
		driver.get("https://testautomationpractice.blogspot.com/");
		System.out.println("url is opened");
		
		//1. Select specific check box

//		driver.findElement(By.xpath("//input[@id='sunday']")).click();
		
		//2. select all check box
	    List<WebElement> checkboxes = 	driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
	
//	    int boxsize = checkboxes.size();
//	    for(WebElement i:checkboxes)
//	    {
	    
//		i.click();
//	    }
	    
	    //3. Select friday check boxes
//	    int boxsize = checkboxes.size(); //7
//        int b = boxsize-2; //7-2=5 index that is friday 
//    	checkboxes.get(b).click(); //so click friday

    	//4. select last 3 box
//	    for(int i=4; i<checkboxes.size(); i++)
//	    {
//	    	checkboxes.get(i).click();
//	    }
	    
//	    5.Select 1st 3 checkboxes
//		for(int i=0; i<3; i++)
//        {
//	    	checkboxes.get(i).click();
//	    }
	    
		//5 unselect check boxes if they are selscted
		
	    for(int i=0; i<3; i++)
        {
	    	checkboxes.get(i).click();
	    }
	    
	    Thread.sleep(3000);
	    
	    for(int i=0; i<checkboxes.size(); i++)
        {
	    	if(checkboxes.get(i).isSelected())
	    	{
	    	checkboxes.get(i).click();
	    	}
	    }
	    
	    
	    
	    
	    
	    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
  }
}
