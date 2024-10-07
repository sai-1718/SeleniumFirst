package SDET_QA_YT.LOCATORS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Css_Selector
{

    public static void main(String[] args)
    {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\saida\\CODING\\IntelliJIDE\\SELENIUM Workspace\\Drivers Folder\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://bstackdemo.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        ////////////////   By ID with CSS selector  ///////////////////
        driver.findElement(By.cssSelector("a#offers"));
        driver.findElement(By.cssSelector("#offers"));
        driver.findElement(By.cssSelector("a[id='offers']"));

        ////////////////   By Class name with CSS selector  /////////////////////
        driver.findElement(By.cssSelector("a.Navbar_logo__26S5Y"));
        driver.findElement(By.cssSelector(".Navbar_logo__26S5Y"));
        driver.findElement(By.cssSelector("a[class='Navbar_logo__26S5Y']"));

        ////////////////   By Attribute with CSS selector  /////////////////////
        driver.findElement(By.cssSelector("a[href='/favourites']"));

        //////////////////// combined id and attribute  ///////////
        driver.findElement(By.cssSelector("a#offers[href='/offers']"));

        ///////// by substring  with prefix we use '^' symbol   /////////////
        driver.findElement(By.cssSelector("a[class^='Navbar_logo_']"));

        ///////// by substring  with prefix we use '$' symbol  //////////////
        driver.findElement(By.cssSelector("a[class$='26S5Y']"));

        ///////// by substring  contains anywhere in the string we use '*'  ///////////
        driver.findElement(By.cssSelector("a[class*='logo_']"));





    }
}
