package day42_TestNG;

import org.testng.annotations.Test;

/* Test New Generation
 * TestNG - Its a unit testing tool/Framework, works with java only
 *          **Advantages** 
 *          test case & test suites
 *          Grouping of test cases
 *          Prioritize
 *          Parameterization
 *          Parallel testing
 *          Reports
 * 
 * @Test - 
 *        we use this annotation instead of Main Method         
 *        # TestNG execute test methods based on alphabetical order. 
 *        # TestNG execute test methods only if they have any annotation
 *        
 * priority - 
 *        
 *        # To overcome it we use priority keyWord
 *        # Once u provide priority to the test methods, then order of methods not consider(priority is consider)
 *        # priorities can be random numbers(no need to have consecutive numbers)
 *        # if we not specify priority then by default it consider zero - 0.
 *        # if we give same priority to multiple methods then it consider alphabetical order to execute
 *        # we can also provide negative numbers to methods.
 *        
 * TestNG.xml file - 
 *        # we execute test cases using TestNG.xml file  
 *        # it can have multiple classes and tests
 *        # we can execute group of test cases in single xml file
 *        # reports are automatically generated in TestNG
 *        
 *        
 *        Test suite ==> test cases ==> test Steps ==> xml file ==> classes
 *        
 *        
 *        
 *           
 * */


public class TestNGDemo1
{
	@Test(priority=1)
	public void openapp()
	{
		System.out.println("opening Application.....");
	}

	@Test(priority=2)
	public void login()
	{
		System.out.println("Login to app.....");
	}

	@Test(priority=3)
	public void logout()
	{
		System.out.println("logout from app.....");
	}
}
