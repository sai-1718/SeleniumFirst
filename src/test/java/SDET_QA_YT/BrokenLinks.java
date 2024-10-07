package SDET_QA_YT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.bidi.Connection;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.List;

public class BrokenLinks
{
    public static void main(String[] args) throws InterruptedException, IOException {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\saida\\CODING\\IntelliJIDE\\SELENIUM Workspace\\Drivers Folder\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("http://www.deadlinkcity.com/");
        List<WebElement> links=driver.findElements(By.tagName("a"));
        System.out.println(links.size());

        for (WebElement link : links) {
            String hrefVal = link.getAttribute("href");
            if (hrefVal == null || hrefVal.isEmpty()) {
                System.out.println(" link is not interactable or not present..");
                continue;
            }


            try {
                URL urlLink = new URL(hrefVal);
                HttpURLConnection conn = (HttpURLConnection) urlLink.openConnection();
                conn.connect();

                int EC = conn.getResponseCode();

                if (EC < 400) {
                    System.out.println(urlLink + " of code is " + EC + " NOT a BROKEN link");

                } else
                    System.out.println(urlLink + " of code is " + EC + " is a BROKEN  link");
            } catch (Exception e) {

            }
        }




    }

}
