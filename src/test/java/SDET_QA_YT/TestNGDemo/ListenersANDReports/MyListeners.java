package SDET_QA_YT.TestNGDemo.ListenersANDReports;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListeners implements ITestListener
{
    public void onStart(ITestContext context)
    {
        System.out.println("Test started.......");
    }

    public void onTestStart(ITestResult result)
    {
        System.out.println("Test Method started.......");
    }

    public void onTestSuccess(ITestResult result)
    {
        System.out.println("Test Method success.......");
    }

    public void onTestFailure(ITestResult result)
    {
        System.out.println("Test Method Failed.......");
    }

    public void onTestSkipped(ITestResult result)
    {
        System.out.println("Test Method skipped.......");
    }

    public void onFinish(ITestContext context)
    {
        System.out.println("Test Finished.......");
    }

}
