package test.day8_alerts_iframes_windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class EditOrderTest {
    WebDriver driver;

    //TC #10: SmartBear edit order
    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

    }

    @Test
    public void task10_editOrderTest() {
        //storing the Steves edit button xpath locator in a string.
        String xpathForSteveEditButon = "//table[@id=''ctl00_MainContent_orderGrid']/tbody/tr/td[.='Steve Johns']/../td[13";
        //passing the locator into driver.findElement method
        WebElement editButtonSteveJohns = driver.findElement(By.xpath(xpathForSteveEditButon));


        // 2.Click to edit button from the right for “Steve Johns”
        editButtonSteveJohns.click();

        // 3.Change name to “Michael Jordan”
        //locating the input box where we enter the new name we want to change to.
        WebElement customerNameInput = driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName"));
        //clearing the priviosly entered name from the input box
        customerNameInput.click();
        // 4.Click Update
        //locating the update button to update the new name
        //  WebElement updateButton=driver.findElement(By.xpath(
        // 5.Assert “Michael Jordan” is in the list

    }
}