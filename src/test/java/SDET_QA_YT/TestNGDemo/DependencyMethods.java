package SDET_QA_YT.TestNGDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyMethods
{
    @Test(priority = 3)
    void openapp()
    {
        System.out.println(" open..");
        Assert.assertTrue(true);
    }
    @Test(priority = 3,dependsOnMethods = "openapp")
    void login()
    {
        System.out.println(" log in..");
        Assert.assertTrue(true);
    }

    @Test(priority = 3,dependsOnMethods = "login")
    void search()
    {
        System.out.println(" search in..");
        Assert.assertTrue(true);
    }

    @Test(priority = 3,dependsOnMethods = {"search","openapp"})
    void close()
    {
        System.out.println(" closi.g.");
        Assert.assertTrue(true);
    }
}
