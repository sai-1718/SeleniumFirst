package SDET_QA_YT.TestNGDemo.POM_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectClass2
{
    ///////////// CONSTRUCTOR ///////////
    WebDriver driver;
    PageObjectClass2(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    ///////////     FINDING ELEMENTS ///////////
    @FindBy(xpath = "//input[@placeholder='Username']")
    WebElement uname;
    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement pass;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement btn;
    ///////////////   ACTION METH0DS //////////////

    public void setUname(String name)
    {
        uname.sendKeys(name);
    }
    public void setPass(String pwd)
    {
       pass.sendKeys(pwd);

    }
    public void setBtn()
    {
       btn.click();
    }
}
