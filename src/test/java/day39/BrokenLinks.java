package day39;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * 1. Link href = "https://xyz.com"
 * 2. https://xyz.com ---> server ---> status code
 * 3. Status code >= 400 broken link
 *    Status code < 400 not a broken link
 * */

public class BrokenLinks {
	public static void main(String[] args) { 
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://www.deadlinkcity.com/");
        driver.manage().window().maximize();
        
        List<WebElement> links =  driver.findElements(By.tagName("a"));
        
        System.out.println("Total number of links: "+ links.size());
        
        int noOfBrokenLinks = 0;
         
        for(WebElement linkElement: links)
        {
        	String hrefAttValue = linkElement.getAttribute("href");
        	
        	if(hrefAttValue==null || hrefAttValue.isEmpty())
        	{
        		System.out.println("href attribute value is null or empty so not possible to check");
        		continue;
        	}
        	//hit url to the server
        	try
        	{
        	   URL linkurl = new URL(hrefAttValue);//converted href from String to url format
        	   HttpURLConnection conn = (HttpURLConnection) linkurl.openConnection(); //open connection to the server
        	
        	   conn.connect(); //Connect to server and sent request to server
        	
        	   if(conn.getResponseCode()>=400)
        	   {
        		System.out.println(hrefAttValue +" ====> Broken link");
        		noOfBrokenLinks++;
        	   }
        	   else
        	   {
        		System.out.println(hrefAttValue + " Not a broken link");
        	   }
        	}
        	catch(Exception e)
        	{
        		System.out.println(e);
        	}
        }
        
        System.out.println("Number of broken links :" + noOfBrokenLinks);
        
        
        
        
        
        driver.quit();
        
        
        
        
        
        
        
        
        
        
        
       } 
}
