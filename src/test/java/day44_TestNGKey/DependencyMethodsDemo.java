package day44_TestNGKey;

import org.testng.Assert;
import org.testng.annotations.Test;

/*
 * Dependency method = suppose one method is depends on another like 
 *                     (logout method is depends on login) but login is fail
 *                     so logout also fail in this case if we use dependency method
 *                     of TestNG then it will skip logout if login is failed
 * 
 * 
 * 
 * */
public class DependencyMethodsDemo 
{
	@Test(priority=1)
	void openApp()
	{
		Assert.assertTrue(true);
	}

	@Test(priority=2, dependsOnMethods= {"openApp"})
	void login()
	{
		Assert.assertTrue(true);
	}

	@Test(priority=3, dependsOnMethods= {"login"})
	void search()
	{
		Assert.assertTrue(false);

	}

	@Test(priority=4, dependsOnMethods= {"login", "search"})
	void advsearch()
	{
		Assert.assertTrue(true);

	}


	@Test(priority=5, dependsOnMethods= {"login"})
	void logout()
	{
		Assert.assertTrue(true);

	}
}
