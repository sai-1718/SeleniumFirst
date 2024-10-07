package SDET_QA_YT.TestNGDemo.Grouping;

import org.checkerframework.checker.units.qual.A;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;

public class parallelExcution
{
    WebDriver driver;
    @BeforeClass
    @Parameters({"browser"})
    void setup(String brName)
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\saida\\CODING\\IntelliJIDE\\SELENIUM Workspace\\Drivers Folder\\chromedriver.exe");
        System.setProperty("webdriver.edge.driver","C:\\Users\\saida\\CODING\\IntelliJIDE\\SELENIUM Workspace\\Drivers Folder\\msedgedriver.exe");

        switch (brName.toLowerCase())
        {
            case "chrome":
                System.out.println("chromeeee........");driver=new ChromeDriver();break;
            case "edge":
                System.out.println("Edge........");
                driver=new EdgeDriver();break;
            default:
                System.out.println("invalid browser..");return;
        }
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

    }

    @Test(priority = 1)
    void logo() throws InterruptedException {
        Thread.sleep(3000);
        boolean s=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
        if(s)
        {
            System.out.println(" logo is present..");
            Assert.assertTrue(true);
        }
        else {
            System.out.println("logo is not displaying...");
            Assert.fail();
        }
    }
    @Test(priority = 2)
    void title()
    {
        if (driver.getTitle().equals("OrangeHRM")) {
            System.out.println("title is matching..");
            Assert.assertTrue(true);
        } else {
            System.out.println("title not matched..");
            Assert.fail();
        }
    }
    @Test(priority = 3)
    void url()
    {
        boolean url=driver.getCurrentUrl().equals("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        if (url)
        {
            System.out.println(" url is correct");
            Assert.assertTrue(true);
        }
        else {
            System.out.println(" incorrect url..");
            Assert.fail();
        }
    }
    @AfterClass
    void  tearDown()
    {
        driver.close();
    }
}
