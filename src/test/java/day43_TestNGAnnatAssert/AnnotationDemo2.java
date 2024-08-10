package day43_TestNGAnnatAssert;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AnnotationDemo2
{
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
	 *             TC2
	 *             1.Login --> @BeforeClass //execute only once 
	 *             2.search--> @Test
	 *             3.adv search --> @Test  
	 *             3.logout--> @AfterClass
	 *            
	 * 
	 * @BeforeTest
	 * @AfterTest
	 * 
	 * @BeforeSuite
	 * @AfterSuite
	 * */
	
	

		@BeforeClass
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
		
		@AfterClass
		void logout()
		{
			System.out.println("This is logout...");
		}
	
}
