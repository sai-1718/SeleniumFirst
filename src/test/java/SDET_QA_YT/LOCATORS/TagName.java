package SDET_QA_YT.LOCATORS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TagName
{
    public static void main(String[] args)
    {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\saida\\CODING\\IntelliJIDE\\SELENIUM Workspace\\Drivers Folder\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        /////////// tag name if multiple tags having same name then driver will go for first occurence
        driver.findElement(By.tagName("input")).sendKeys("by tagName");

    }
}
