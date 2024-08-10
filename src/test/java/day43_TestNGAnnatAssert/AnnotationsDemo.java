package day43_TestNGAnnatAssert;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*
 * @Test
 * @BeforeMethod
 * @AfterMethod
 *             TC1
 *             1.Login --> @BeforeMethod
 *             2.search--> @Test 
 *             3.logout--> @AfterMethod
 *             4.login
 *             5.adv search --> @Test 
 *             6.logout
 * 
 * @BeforeClass
 * @AfterClass
 * 
 * @BeforeTest
 * @AfterTest
 * 
 * @BeforeSuite
 * @AfterSuite
 * */

public class AnnotationsDemo
{

	@BeforeMethod
	void login()
	{
		System.out.println("This is login...");
	}
	
	@Test(priority=1)
	void search()
	{
		System.out.println("This is this is search...");
	}
	
	@Test(priority=2)
	void advsearch()
	{
		System.out.println("This is this is advsearch...");
	}
	
	@AfterMethod
	void logout()
	{
		System.out.println("This is logout...");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
