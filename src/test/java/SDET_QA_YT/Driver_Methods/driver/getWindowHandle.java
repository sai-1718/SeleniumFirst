package SDET_QA_YT.Driver_Methods.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class getWindowHandle
{
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\saida\\CODING\\IntelliJIDE\\SELENIUM Workspace\\Drivers Folder\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();

        Set<String> setid=driver.getWindowHandles();

        /// Converting set to list for perform operations on specific window
        List<String> listid=new ArrayList<String>(setid);
        String  parent=listid.get(0);
        String child=listid.get(1);
        // before switching
        System.out.println(driver.getTitle());
        driver.switchTo().window(child);
        // After switching
        System.out.println(driver.getTitle());

        ///////////////////////////// by using for each
        for(String id:setid)
        {
            String title=driver.switchTo().window(id).getTitle();
            if(title.equals("OrangeHRM"))
            {
                System.out.println(driver.getCurrentUrl());
                //// perform validation
            }else
            {
                System.out.println( driver.getCurrentUrl()+
                driver.getTitle());
            }
        }

        /////////////// closing specific window

        for(String id:setid) {
            String title = driver.switchTo().window(id).getTitle();
            if (title.equals("OrangeHRM")) {
                System.out.println(driver.getCurrentUrl());
                //// perform validation
                driver.close();
            }
        }
    }
}
