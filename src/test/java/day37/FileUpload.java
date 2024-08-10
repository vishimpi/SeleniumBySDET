package day37;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload
{
   public static void main(String[] args) 
   {
	   WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		
		//single file Upload
//		WebElement fileUpload = driver.findElement(By.xpath("//input[@id='filesToUpload']"));
//		fileUpload.sendKeys("V:\\notes++\\log4j code.txt");
//		
//		if(driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals("log4j code.txt"))
//		{
//			System.out.println("File successfully Uploaded");
//			
//		}
//		else
//		{
//			System.out.println("upload failed");
//		}
		
		//multiple files upload
		String file1 = "V:\\notes++\\log4j code.txt";
		String file2 = "V:\\notes++\\log4j code1.txt";
		
		WebElement fileUpload1 = driver.findElement(By.xpath("//input[@id='filesToUpload']"));
		fileUpload1.sendKeys(file1+"\n"+file2); // \n is representing next line
		
		int noOfFileUploaded = driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();
		if(noOfFileUploaded==2)
		{
			System.out.println("All file are uploaded");
		}
		else
		{
			System.out.println("Upload failed");
		}
   }
}
