package SDET_QA_YT.TestNGDemo.POM_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageObjectClass
{
    ///////////// CONSTRUCTOR ///////////
    WebDriver driver;
    PageObjectClass(WebDriver driver)
    {
        this.driver=driver;
    }

    ///////////     FINDING ELEMENTS ///////////
    By uname =By.xpath("//input[@placeholder='Username']");
    By pass= By.xpath("//input[@placeholder='Password']");
    By btn = By.xpath("//button[@type='submit']");

    ///////////////   ACTION METH0DS //////////////

    public void setUname(String name)
    {
        driver.findElement(uname).sendKeys(name);
    }
    public void setPass(String pwd)
    {
        driver.findElement(pass).sendKeys(pwd);

    }
    public void setBtn()
    {
        driver.findElement(btn).click();
    }
}
