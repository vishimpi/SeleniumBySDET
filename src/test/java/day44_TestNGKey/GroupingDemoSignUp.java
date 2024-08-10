package day44_TestNGKey;

import org.testng.annotations.Test;

public class GroupingDemoSignUp 
{
	
	@Test(priority=1, groups = {"regression"})
	void signUpByEmail()
	{
      System.out.println("This is signUp by Email");
	}
	
	@Test(priority=2, groups = {"regression"})
	void signUpByFB()
	{
      System.out.println("This is signUp by FB");
	}
	
	@Test(priority=3, groups = {"regression"})
	void signUpByTwitter()
	{
      System.out.println("This is signUp by Twitter");
	}
}
