package test.day8_alerts_iframes_windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class IframePractice {
    WebDriver driver;

    //TC #4: Iframe practice
    // 1.Create a new class called: IframePractice
    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/iframe");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);


    }

    // 2.Create new test and make set ups
    // 3.Go to: http://practice.cybertekschool.com/iframe
    @Test
    public void iframe_practice_test() {
        //locating iframe as webElement, then swithiching to it

        WebElement iframe = driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));
        //second option by using by.tagName
        //  WebElement iframe2=driver.findElement(By.tagName("iframe"));

        //switching to iframe using webElement
        driver.switchTo().frame(iframe);
        // // 4.Assert: “Your content goes here.” Text is displayed.
        WebElement yourContentGoeshereText = driver.findElement(By.xpath("//p"));
        Assert.assertTrue(yourContentGoeshereText.isDisplayed());
        driver.switchTo().parentFrame();
        //switching to iframe using indexes
        //driver.switchTo().frame(0);
        //WE HAVE TO SWITCH DO DEFAULT HTML TO BE ABLE TO LOCATE ANYTHING IN IT
        // 5.Assert: “An iFrame containing the TinyMCEWYSIWYG Editor
        WebElement h3Text = driver.findElement(By.xpath("//h3"));
        Assert.assertTrue(h3Text.isDisplayed());



















    }
}
