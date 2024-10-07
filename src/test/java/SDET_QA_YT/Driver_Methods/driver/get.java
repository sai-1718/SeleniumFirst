package SDET_QA_YT.Driver_Methods.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class get
{
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\saida\\CODING\\IntelliJIDE\\SELENIUM Workspace\\Drivers Folder\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        /////////////     to launch  browser   ///////////////
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        System.out.println("-------------------------------------------------------------------------------------------");
        /////////// to get the tittle of current window /////////
        String title=driver.getTitle();
        System.out.println(title);
        System.out.println("-------------------------------------------------------------------------------------------");
        /////////// to get the url of the page //////////////
        String url =driver.getCurrentUrl();
        System.out.println(url);
        System.out.println("-------------------------------------------------------------------------------------------");

        /////////// to get the source code of the page //////////////
        String src =driver.getPageSource();
        System.out.println(src);
        System.out.println("-------------------------------------------------------------------------------------------");

        /////////// to get the url of the page //////////////
        String wh =driver.getWindowHandle();
        System.out.println(wh);

        System.out.println("-------------------------------------------------------------------------------------------");
        /////////// to get the url of the page //////////////
        Set<String> whls =driver.getWindowHandles();
        System.out.println(whls);


    }
}
