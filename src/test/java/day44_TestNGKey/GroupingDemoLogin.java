package day44_TestNGKey;

import org.testng.annotations.Test;

/*Grouping = here we categories all the test methods into different categories
 *  
 * Example = class1 - m1,m2,m3...
 *           class2 - m4,m5,m6...
 *           class3 - m7,m8,m9...
 *           
 *           Here above we can see methods so on these methods we can do grouping
 *           like sanity-basic function, regression-changes, functional- all test
 * */

public class GroupingDemoLogin
{
	@Test(priority=1, groups = {"sanity"})	
	void loginByEmail()
	{
		System.out.println("this is login by email");
	}
	
	@Test(priority=2, groups = {"sanity"})	
	void loginByFB()
	{
		System.out.println("this is login by FB");
	}

	@Test(priority=3, groups = {"sanity"})	
	void loginByTwitter()
	{
		System.out.println("this is login by Twitter");
	}









}
