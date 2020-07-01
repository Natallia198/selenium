package test.Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

public class
US11 {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://qa2.vytrack.com/user/login");
    }
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
    @Test
    public void test() throws Exception {
//"1.Verify that authorized user should be able to access and see all Vehicle serviece log
//(Note: authorized:Truck driver, admin)
        WebElement webElementUserName = driver.findElement(By.id("prependedInput"));
        webElementUserName.sendKeys("user40");
        WebElement webElementPassword = driver.findElement(By.id("prependedInput2"));
        webElementPassword.sendKeys("UserUser123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Actions action = new Actions(driver);
        WebElement VehicleServicesLogs = driver.findElement(By.xpath("//span[.='Vehicle Services Logs']"));
        // driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        Thread.sleep(2000);
        // WebDriverWait wait = new WebDriverWait(driver, 3);
        //  wait.until(ExpectedConditions.visibilityOf(VehicleServicesLogs));
        action.moveToElement(driver.findElement(By.xpath("//ul[@class='nav-multilevel main-menu']/li/a/span"))).perform();
        action.moveToElement(VehicleServicesLogs).click().build().perform();
        Thread.sleep(1000);
        String expected = "Vehicle Services Logs";
        String actual = driver.getTitle();
        Assert.assertFalse(actual.contains(expected));
    }
}