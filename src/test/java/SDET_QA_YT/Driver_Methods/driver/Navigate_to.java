package SDET_QA_YT.Driver_Methods.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.time.Duration;

public class Navigate_to
{
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\saida\\CODING\\IntelliJIDE\\SELENIUM Workspace\\Drivers Folder\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://testautomationpractice.blogspot.com/");
        Thread.sleep(3000);
        /// launching the browser using navigate .to () method
        Thread.sleep(3000);
        driver.navigate().to("https://demo.opencart.com/");
                        ///// Or  by passing url object  //////
        Thread.sleep(3000);
        URL myurl=new URL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.navigate().to(myurl);
        Thread.sleep(3000);
        //////////////// navigating to Back
        driver.navigate().back();
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(3000);
        driver.navigate().back();
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(3000);

        //////////////// navigating to forward
        driver.navigate().forward();
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(3000);
        driver.navigate().forward();
        System.out.println(driver.getCurrentUrl());

        Thread.sleep(3000);
        ///////////  refresh the web page with navigate
        driver.navigate().refresh();

    }
}
