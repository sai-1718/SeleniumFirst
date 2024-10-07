package SDET_QA_YT.TestNGDemo.Grouping;

import org.testng.annotations.Test;

public class grp3
{
    @Test(groups = {"reggression","sanity","func"})
    void money()
    {
        System.out.println("money..");
    }
    @Test(groups = {"reggression","sanity","func"})
    void cash()
    {
        System.out.println("cash......");
    }
}
