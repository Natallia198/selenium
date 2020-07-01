/*package test.day8_alerts_iframes_windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.SmartBearUtilities;
import utilities.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

​
​
public class SmartBearDeleteOrder_T9 {
    WebDriver driver;
​
    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        SmartBearUtilities.login(driver);
    }
​
    @Test
    public void task9_deleteOrderTest() {
​
        //Locating Mark Smith checkbox button using "Mark Smith" text with xpath
        WebElement markSmithCheckBox = driver.findElement(By.xpath("//td[.='Mark Smith']/../td[1]"));
​
        //Clicking to the checkbox
        markSmithCheckBox.click();
​
        //Locating the delete button under the table
        WebElement deleteButton = driver.findElement(By.id("ctl00_MainContent_btnDelete"));
​


        //Clicking to the delete button and deleting the Mark Smith from the table
        deleteButton.click();
​
        //Locating all the names from the web table and storing them into a list if web elements
        List<WebElement> allNames = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[2]"));


        //Looping through the list of names, and asserting Mark Smith is not in the table anymore
        for (WebElement name : allNames) {
            Assert.assertFalse(name.getText().equals("Mark Smith"));
        }
    }
​
    }
*/