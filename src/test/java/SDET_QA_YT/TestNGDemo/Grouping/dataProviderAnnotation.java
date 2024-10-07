package SDET_QA_YT.TestNGDemo.Grouping;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class dataProviderAnnotation
{
    @BeforeClass
    void lanc()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\saida\\CODING\\IntelliJIDE\\SELENIUM Workspace\\Drivers Folder\\chromedriver.exe");
    }

    WebDriver driver=new ChromeDriver();
    @Test(priority = 1)
    void setip() throws InterruptedException
    {
        Thread.sleep(3000);
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }
    @Test(priority = 2, dataProvider = "dap")
    void login(String in ,String lam) throws InterruptedException
    {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(in);
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(lam);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        System.out.println(in+lam);
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

    }

    @DataProvider(name = "dap",indices = {0,1})
    String[][] DataPro()
    {
        return new String[][]
                {
                        {"sai@gmail.com","hello"},
                        {"Admin","admin123"},
                        {"sai","ram"}

                };
    }


}
