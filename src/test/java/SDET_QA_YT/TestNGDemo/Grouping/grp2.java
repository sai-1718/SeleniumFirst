package SDET_QA_YT.TestNGDemo.Grouping;

import org.testng.Assert;
import org.testng.annotations.Test;

public class grp2
{

        @Test(priority = 1,groups = {"reggression"})
        void launc()
        {
            System.out.println(" open..");
            Assert.assertTrue(true);
        }
        @Test(priority = 2,groups = {"reggression"})
        void act()
        {
            System.out.println(" log in..");
            Assert.assertTrue(true);
        }

        @Test(priority = 3,groups = {"reggression"})
        void sign()
        {
            System.out.println(" search in..");
            Assert.assertTrue(true);
        }

        @Test(priority = 4,groups = {"reggression"})
        void quit()
        {
            System.out.println(" qt.g.");
            Assert.assertTrue(true);
        }
    }


