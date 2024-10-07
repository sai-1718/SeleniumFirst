package SDET_QA_YT.TestNGDemo.ListenersANDReports;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ListenersDemo
{
    @Test(priority = 1)
    void pass()
    {
        System.out.println("I m passed");
        Assert.assertTrue(true);
    }
    @Test(priority = 2)
    void fail()
    {
        System.out.println("I m failed");
        Assert.fail();
    }

    @Test(priority = 3,dependsOnMethods = "fail")
    void skip()
    {
        System.out.println("I m skipped");
    }
}
