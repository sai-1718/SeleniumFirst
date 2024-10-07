package SDET_QA_YT;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.time.Duration;

public class shadowDoM {
    public static void main(String[] args) throws InterruptedException, IOException {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\saida\\CODING\\IntelliJIDE\\SELENIUM Workspace\\Drivers Folder\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://dev.automationtesting.in/shadow-dom");

        ////////////   1 shadow dom /////////////
        SearchContext shRoot1=driver.findElement(By.cssSelector("#shadow-root")).getShadowRoot();
        WebElement ele1=shRoot1.findElement(By.cssSelector("#shadow-element"));
        System.out.println(ele1.getText());

        ////////////   2 shadow dom /////////////
       SearchContext shRoot2_0=driver.findElement(By.cssSelector("#shadow-root")).getShadowRoot();
       SearchContext shRoot2_1=shRoot2_0.findElement(By.cssSelector("#inner-shadow-dom")).getShadowRoot();
       WebElement ele2=shRoot2_1.findElement(By.cssSelector("#nested-shadow-element"));
        System.out.println(ele2.getText());

        //////////////// 3 shadow dom  ////////////////
        SearchContext shRoot3_0=driver.findElement(By.cssSelector("#shadow-root")).getShadowRoot();
        SearchContext shRoot3_1=shRoot3_0.findElement(By.cssSelector("#inner-shadow-dom")).getShadowRoot();
        SearchContext shRoot3_2=shRoot3_1.findElement(By.cssSelector("#nested-shadow-dom")).getShadowRoot();
        WebElement ele3=shRoot3_2.findElement(By.cssSelector("#multi-nested-shadow-element"));
        System.out.println(ele3.getText());




    }
}