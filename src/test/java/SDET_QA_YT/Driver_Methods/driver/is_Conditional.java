package SDET_QA_YT.Driver_Methods.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class is_Conditional
{
    public static void main(String[] args)
    {


        System.setProperty("webdriver.chrome.driver","C:\\Users\\saida\\CODING\\IntelliJIDE\\SELENIUM Workspace\\Drivers Folder\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        //// isEnabled is a method to verify that a text box is enabled or not it returns a boolean value
        boolean nameTxt=driver.findElement(By.xpath("//input[@id='name']")).isEnabled();
        System.out.println(nameTxt);

        //// isSelected is a method to verify that a radio button  is selected or not it returns a boolean value
        boolean rdbotton=driver.findElement(By.xpath("//input[@id='male']")).isSelected();
        System.out.println(rdbotton);


        //// isDisplayed  is a method to verify that a webElement is displaying or not it returns a boolean value
        boolean display=driver.findElement(By.xpath("//h1[normalize-space()='Automation Testing Practice']")).isSelected();
        System.out.println(display);

    }
}
