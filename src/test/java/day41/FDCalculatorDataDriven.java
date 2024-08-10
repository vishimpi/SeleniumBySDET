package day41;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/*
 * 1. Functionality (Test Case)
 * 2. Prepare test data in excel
 * 3. Develop automation script
 * */
public class FDCalculatorDataDriven
{
  public static void main(String[] args) throws IOException, InterruptedException
  {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
   
    String filePath = System.getProperty("user.dir")+"\\TestData\\moneyControlData.xlsx";
  
    int rows =  ExcelUtils.getRowCount(filePath, "Sheet1");
    
    for(int i=1; i<=rows; i++)
    {
    	//1.read data from excel
    	
    	String principle = ExcelUtils.getCellData(filePath, "Sheet1", i, 0);
    	String rateofinterest = ExcelUtils.getCellData(filePath, "Sheet1", i, 1);
    	String per1 = ExcelUtils.getCellData(filePath, "Sheet1", i, 2);
    	String per2 = ExcelUtils.getCellData(filePath, "Sheet1", i, 3);
    	String frequency = ExcelUtils.getCellData(filePath, "Sheet1", i, 4);
    	String exp_maturityValue = ExcelUtils.getCellData(filePath, "Sheet1", i, 5);
    	
    	//2.pass data in application
    	driver.findElement(By.id("principal")).sendKeys(principle);
    	driver.findElement(By.xpath("//input[@id='interest']")).sendKeys(rateofinterest);
    	driver.findElement(By.xpath("//input[@id='tenure']")).sendKeys(per1);
    	
    	//drop down
    	Select perdrp = new Select(driver.findElement(By.xpath("//select[@id='tenurePeriod']")));
    	perdrp.selectByVisibleText(per2);
    	
    	Select freqdrp = new Select(driver.findElement(By.xpath("//select[@id='frequency']")));
    	freqdrp.selectByVisibleText(frequency);
    	
    	//clicking on calculate
        driver.findElement(By.xpath("//img[@src='https://images.moneycontrol.com/images/mf_revamp/btn_calcutate.gif']")).click();
        
        //validation
        String act_maturityValue = driver.findElement(By.xpath("//span[@id='resp_matval']//strong")).getText();
        
        
        if(Double.parseDouble(exp_maturityValue)==Double.parseDouble(act_maturityValue))
        {
        	System.out.println("passed");
        	ExcelUtils.setCellData(filePath, "Sheet1", i, 7, "passed");
        	ExcelUtils.fillGreenColor(filePath, "Sheet1", i, 7);
        }
        else
        {
        	System.out.println("failed");
        	ExcelUtils.setCellData(filePath, "Sheet1", i, 7, "failed");
        	ExcelUtils.fillRedColor(filePath, "Sheet1", i, 7);
        	
        }
        Thread.sleep(2000);
        driver.findElement(By.xpath("//img[@src='https://images.moneycontrol.com/images/mf_revamp/btn_clear.gif']")).click();
    } //ending of for loop
    
    driver.quit();
  }  
}
