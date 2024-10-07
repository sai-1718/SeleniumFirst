package SDET_QA_YT.LOCATORS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class PartialLinkText
{

    public static void main(String[] args)
    {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\saida\\CODING\\IntelliJIDE\\SELENIUM Workspace\\Drivers Folder\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        /////////// by partialLinkText . Text present inside an anchor <a> tag with href attribute can be got by sub text

        driver.findElement(By.partialLinkText("HRM")).click();

    }
}
