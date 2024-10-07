package SDET_QA_YT.Driver_Methods.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class WaitCommands
{
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\saida\\CODING\\IntelliJIDE\\SELENIUM Workspace\\Drivers Folder\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
  //---------------------------------------------------------------------------------------------------------------------//
        /////////// implicit wait declared only once stays alive till driver close
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//---------------------------------------------------------------------------------------------------------------------//

        /////// Explicit wait declaration................//////////////////
        WebDriverWait mywait=new WebDriverWait(driver, Duration.ofSeconds(5));

        ///// Explicit wait usage on specific web element  ...//////////
        WebElement name=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='name']")));
        name.sendKeys("sai");

  //---------------------------------------------------------------------------------------------------------------------//
        ///////////   Fluent wait declaration................. ///////////////////////
        Wait<WebDriver> fWait=new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))
                        .pollingEvery(Duration.ofSeconds(5))
                                .ignoring(NoSuchElementException.class);

        ///////////   Fluent wait usage ........./////////////////////////
        WebElement name2 = fWait.until(new Function<WebDriver, WebElement>() {
            @Override
            public WebElement apply(WebDriver webDriver) {
                return driver.findElement(By.xpath("//input[@id='name']"));
            }

            public WebElement apply() {
                return driver.findElement(By.xpath("//input[@id='name']"));
            }
        });

//---------------------------------------------------------------------------------------------------------------------//

        ////////////// Sleep method is provided by java
        Thread.sleep(5000);






    }
}
