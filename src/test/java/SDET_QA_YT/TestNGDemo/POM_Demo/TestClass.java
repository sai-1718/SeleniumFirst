package SDET_QA_YT.TestNGDemo.POM_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestClass
{
    WebDriver driver;

    @BeforeClass
    void setup()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\saida\\CODING\\IntelliJIDE\\SELENIUM Workspace\\Drivers Folder\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
    }
    @Test
    void  login()
    {
       // PageObjectClass poc=new PageObjectClass(driver);
        PageObjectClass2 poc=new PageObjectClass2(driver);

        poc.setUname("Admin");
        poc.setPass("admin123");
        poc.setBtn();
        ///////////// validation /////////
//        WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(4000));
//        wait.until(ExpectedConditions.alertIsPresent()).accept();
        boolean lo= driver.findElement(By.xpath("//img[@alt='client brand banner']")).isDisplayed();
        Assert.assertTrue(lo);
    }
    @AfterClass
    void teardown()
    {
        driver.close();
    }
}
