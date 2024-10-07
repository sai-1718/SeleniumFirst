package SDET_QA_YT.Tables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class StaticWebTable {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\saida\\CODING\\IntelliJIDE\\SELENIUM Workspace\\Drivers Folder\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://testautomationpractice.blogspot.com/");

        List<WebElement > colms=driver.findElements(By.xpath("//table[@name='BookTable']//th"));
        int clSize= colms.size();
        int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr//td[1]")).size();
        for (int r=2;r<=rows+1;r++)
        {
            for (int c=1;c<=clSize;c++)
            {
                Thread.sleep(2500);
                String data=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
                System.out.print(data+"\t  ");
            }
            System.out.println();
        }
    }
}