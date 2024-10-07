package SDET_QA_YT.TestNGDemo.Grouping;

import org.testng.Assert;
import org.testng.annotations.Test;

public class grp1
{
        @Test(priority = 3,groups = {"sanity"})
        void openapp()
        {
            System.out.println(" open..");
            Assert.assertTrue(true);
        }
        @Test(priority = 3,dependsOnMethods = "openapp",groups = {"sanity"})
        void login()
        {
            System.out.println(" log in..");
            Assert.assertTrue(true);
        }

        @Test(priority = 3,dependsOnMethods = "login",groups = {"sanity"})
        void search()
        {
            System.out.println(" search in..");
            Assert.assertTrue(true);
        }

        @Test(priority = 3,dependsOnMethods = {"search","openapp"},groups = {"sanity"})
        void close()
        {
            System.out.println(" closi.g.");
            Assert.assertTrue(true);
        }
    }


