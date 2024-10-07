package SDET_QA_YT.TestNGDemo.ListenersANDReports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ExtentRepors1L implements ITestListener
{

    ExtentSparkReporter sparkReporter;
    ExtentReports extentReports;
    ExtentTest extentTest;

    public void onStart(ITestContext context)
    {
        sparkReporter=new ExtentSparkReporter(System.getProperty("usr.dir")+"myReport.html");

        sparkReporter.config().setDocumentTitle("Automation Report");
        sparkReporter.config().setReportName("Sai Dasari Basic");
        sparkReporter.config().setTheme(Theme.DARK);

        extentReports= new ExtentReports();
        extentReports.attachReporter(sparkReporter);

        extentReports.setSystemInfo("name","Sai Dasari");
        extentReports.setSystemInfo("pc","mac");
        extentReports.setSystemInfo("what ","System");
        extentReports.setSystemInfo("bye","Send");
        extentReports.setSystemInfo("OS","Windows");
        extentReports.setSystemInfo("lo","Sai");

    }

    public void onTestStart(ITestResult result)
    {

    }

    public void onTestSuccess(ITestResult result)
    {
        extentTest=extentReports.createTest(result.getName());
        extentTest.log(Status.PASS," the name is "+result.getName());
    }

    public void onTestFailure(ITestResult result)
    {
        extentTest=extentReports.createTest(result.getName());
        extentTest.log(Status.FAIL," the name is "+result.getName());
        extentTest.log(Status.FAIL ," Because "+ result.getName());
    }

    public void onTestSkipped(ITestResult result)
    {
        extentTest=extentReports.createTest(result.getName());
        extentTest.log(Status.SKIP," the name is "+result.getName());
    }


    public void onFinish(ITestContext context)
    {
        extentReports.flush();
    }
}
