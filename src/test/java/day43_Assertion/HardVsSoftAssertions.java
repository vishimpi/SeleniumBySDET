package day43_Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/*
 * Hard Assertions: these are we can direct access from Assert Class
 *                  There is problem in hard assertion 
 *                 
 * */
public class HardVsSoftAssertions
{
  @Test(priority=1)
  void test_Hard()
   {
	  System.out.println("vivek");
   	  Assert.assertEquals(1, 1);
   	  System.out.println("shimpi");
    }
  @Test(priority=2)
  void test_Soft()
  {
	    SoftAssert sa = new SoftAssert();
	    System.out.println("vivek");
	   	sa.assertEquals(1, 6);
	   	System.out.println("shimpi"); 
	   	sa.assertAll();
  }
}
