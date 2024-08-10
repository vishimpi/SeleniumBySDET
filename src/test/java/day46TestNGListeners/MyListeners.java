package day46TestNGListeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

/*
 * Some time your test case may fail pass or skip and after that i want to take any action 
 * we called that post action.
 * ex - my test got passed = my post action will be update result in reports
 * ex - my test got failed = my post action will be take screenshot
 * ex - mu test got skip = update status in report
 * 
 *  And we can give this post actions by using Listeners implemented ITestListner
 *  ITestListner Interface is there and there methods
 * Steps:
 *       1) create test case
 *       2) create listener class
 *       3) create xml and include both test and listener class
 * */
public class MyListeners implements ITestListener
{
	public void onStart(ITestContext context)
	{
		System.out.println("test execution is started....");
	}

	public void onTestStart(ITestResult result)
	{
		System.out.println("test started....");
	}

	public void onTestSuccess(ITestResult result)
	{
		System.out.println("test passed....");

	}

	public void onTestFailure(ITestResult result)
	{
		System.out.println("test failed....");
	}

	public void onTestSkipped(ITestResult result)
	{
		System.out.println("test skipped....");
	}

	public void onFinish(ITestContext context)
	{
		System.out.println("test execution is completed....");
	}

}
