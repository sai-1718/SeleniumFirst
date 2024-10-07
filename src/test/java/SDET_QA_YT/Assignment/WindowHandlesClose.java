package SDET_QA_YT.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class WindowHandlesClose {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\saida\\CODING\\IntelliJIDE\\SELENIUM Workspace\\Drivers Folder\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://testautomationpractice.blogspot.com/");

        driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("selenium");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        List<WebElement> links=driver.findElements(By.xpath("//div[@class='wikipedia-search-main-container']/descendant::div[contains(@id,'wikipedia-search-')]/a"));
        for (WebElement link:links)
        {
            link.click();
        }
        Set<String> ids=driver.getWindowHandles();
        for(String id:ids)
        {
            String tile=driver.switchTo().window(id).getTitle();
            if(tile.equals("Selenium - Wikipedia")||tile.equals("Selenium disulfide - Wikipedia"))
             driver.close();
        }
    }
}