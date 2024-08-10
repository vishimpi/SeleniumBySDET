package day43_Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

/*
 * Hard Assertions: these are we can direct access from Assert Class
 *                  There is problem in hard assertion 
 *                 
 * */
public class HardAssertions 
{
@Test
void test()
{
	Assert.assertEquals("vivek", "vivek"); //passed
	Assert.assertNotEquals("vivek", "vivek");//Failed
	
	Assert.assertTrue(false);//failed
	Assert.assertTrue(true);//Passed
	Assert.assertTrue(1==2);//failed
	
	Assert.assertFalse(1==1);//failed
	Assert.fail();//it will fail ur test

}
}
