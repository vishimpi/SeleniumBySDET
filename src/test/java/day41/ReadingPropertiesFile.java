package day41;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class ReadingPropertiesFile
{
  /*
   *properties files are similar like text file  
   *common data which is req for multiple test cases we will maintain in the properties file
   * */

	
	public static void main(String[] args) throws IOException
	{
	  //location of properties file
	  FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\TestData\\config.properties");
	 
	  //loading properties file
	  Properties propObj = new Properties(); 
	  propObj.load(file);
	  
	  //Reading Data from properties file
	String url = propObj.getProperty("appurl");
	String email = propObj.getProperty("email");
	String pwd = propObj.getProperty("password");
	String orid = propObj.getProperty("orderid");
	String custid = propObj.getProperty("custid");
	
	System.out.println(url+" "+email+" "+pwd+" "+orid+" "+custid);
	
	//Reading all the keys from properties file
//	Set<String> keys= propObj.stringPropertyNames();//approach1
//	System.out.println(keys);
	
	//approach2
	Set<Object> keys = propObj.keySet();
	System.out.println(keys);
	
	//read all values from file
	Collection <Object> values = propObj.values();
	System.out.println(values);
	
	file.close();
	
	
	
	
	
	
	} 
}
