package SDET_QA_YT.TestNGDemo;

import org.testng.annotations.*;

import java.util.stream.BaseStream;

public class Annotations
{
    @BeforeSuite
    void bs()
    {
        System.out.println("Before suite/..");
    }
    @BeforeTest
    void bt()
    {
        System.out.println("Before Test...");
    }

    @BeforeClass
    void bc()
    {
        System.out.println("Before Class/..");
    }
    @BeforeMethod
    void bm()
    {
        System.out.println("Before Method...");
    }
    @Test(priority = 1)
    void m1()
    {
        System.out.println(" i am m1");
    }
    @Test(priority = 2)
    void m2()
    {
        System.out.println(" i am m2");
    }

    @AfterMethod
    void am()
    {
        System.out.println("After Method...");
    }
    @AfterClass
    void ac()
    {
        System.out.println("After Class/..");
    }
    @AfterTest
    void at()
    {
        System.out.println("After Test...");
    }
    @AfterSuite
    void as()
    {
        System.out.println("After suite/..");
    }
}
