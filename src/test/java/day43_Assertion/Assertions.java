package day43_Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

/*
 * Assertion - validation point 
 *           - Hard & Soft Assertion
 *           
 * Hard Assertions -
 *                        
 * */


public class Assertions
{
@Test
void testTitle()
{
	String exp_title = "Opencart";
	String act_title = "Opencart";
	
	Assert.assertEquals(act_title, exp_title, act_title);
}
}
