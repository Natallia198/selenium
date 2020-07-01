package test.day8_alerts_iframes_windows;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class AlertsPractices {
    WebDriver driver;

//TC #1: Information alert practice1.Open browser
// 2.Go to website: http://practice.cybertekschool.com/javascript_alerts
// 3.Click to “Click for JS Alert”button
// 4.Click to OK button from the alert
// 5.Verify “You successfulyclicked an alert”text is displayed.
    @BeforeMethod
    public void setUp(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/javascript_alerts");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);


    }
    @Test
    public void p1_information_alert_test(){
        //we are locating alert button to be able to click
        WebElement allert1 = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
        //we need to click to allert buton so alert pop pop
        allert1.click();
        // we need to create the alert instance and swith to it
        Alert alert=driver.switchTo().alert();
        //use alert instance to accept the alert
        alert.accept();

        WebElement resultText =driver.findElement(By.xpath("//p[@id='result']"));
        Assert.assertTrue(resultText.isDisplayed());




    }
    @Test
    public void p2_confirmation_alert_test(){
        WebElement confirmationalAlertButton=driver.findElement(By.xpath("//button[.='Click for JS Confirm']"));
        confirmationalAlertButton.click();
        Alert alert =driver.switchTo().alert();
        alert.dismiss();
        WebElement resultText =driver.findElement(By.xpath("//p[@id='result']"));
        Assert.assertTrue(resultText.isDisplayed());

    }



















// TC #2: Confirmationalert practice
// 1.Open browser
// 2.Go to website: http://practice.cybertekschool.com/javascript_alerts
// 3.Click to “Click for JS Confirm” button
// 4.Click to OK button from the alert
// 5.Verify “You clicked: Ok” text is displayed.




// TC #3: Information alert practice1.Open browser2.Go to website: http://practice.cybertekschool.com/javascript_alerts3.Click to “Click for JS Prompt” button4.Send “hello”text to alert5.Click to OK button from the alert
// 6.Verify “You entered:  hello” text is displayed

}
