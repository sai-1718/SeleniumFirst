package SDET_QA_YT;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.time.Duration;

public class Screenshot {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\saida\\CODING\\IntelliJIDE\\SELENIUM Workspace\\Drivers Folder\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://testautomationpractice.blogspot.com/");

        TakesScreenshot sc=(TakesScreenshot)driver;
        File src=sc.getScreenshotAs(OutputType.FILE);
        File locFile=new File("C:\\Users\\saida\\OneDrive\\Pictures\\sc1.png");
        src.renameTo(locFile);

        WebElement ele =driver.findElement(By.xpath("//div[@class='titlewrapper']"));
        File elsc=ele.getScreenshotAs(OutputType.FILE);
        File trg=new File("C:\\Users\\saida\\OneDrive\\Pictures\\sc2.png");
        elsc.renameTo(trg);

    }
}