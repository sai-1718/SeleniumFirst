package SDET_QA_YT.TestNGDemo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataOroviderDemo
{
    @Test(dataProvider = "dsp")
    void hii(String name,String nam)
    {
        System.out.println(name + nam);
    }

    @DataProvider(name ="dsp")
    String[][] dp()
    {
        String [][]data=
        {
            {"sai","dasri"},
            {"sai","dasri"},
            {"sai","dasri"}
        };
        return  data;
    }
}
