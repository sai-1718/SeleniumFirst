package SDET_QA_YT.Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class JsAlert
{
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\saida\\CODING\\IntelliJIDE\\SELENIUM Workspace\\Drivers Folder\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
        driver.findElement(By.xpath("//button[@id='alertBox']")).click();
        Thread.sleep(3000);
        Alert alert=driver.switchTo().alert();
        System.out.println(alert.getText());
        System.out.println(alert.getText());
        Thread.sleep(3000);
        alert.accept();

        driver.findElement(By.xpath("//button[@id='confirmBox']")).click();
        Thread.sleep(3000);
        Alert alert1=driver.switchTo().alert();
        System.out.println(alert1.getText());
        Thread.sleep(3000);
        alert.accept();

        driver.findElement(By.xpath("//button[@id='promptBox']")).click();
        Thread.sleep(3000);
        Alert alert2=driver.switchTo().alert();
        System.out.println(alert2.getText());
        alert2.sendKeys("Sai ");
        Thread.sleep(3000);
        alert.accept();
    }
}
