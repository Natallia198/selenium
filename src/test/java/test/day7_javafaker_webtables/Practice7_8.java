package test.day7_javafaker_webtables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Practice7_8 {
    // TC#7: Cybertek “month”dropdown default value
    // 1.Open browser
    // 2.Go to website: http://practice.cybertekschool.com/dropdowns

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }


    @Test
    public void monthDropdown() {
        Select selectYear = new Select(driver.findElement(By.xpath("//select[@id='year']")));
        String actualYear = selectYear.getFirstSelectedOption().getText();
        Select selectMonth = new Select(driver.findElement(By.xpath("//select[@id='month']")));
        String actualMonth = selectMonth.getFirstSelectedOption().getText();
        Select selectDay = new Select(driver.findElement(By.xpath("//select[@id='day']")));
        String actualDay = selectDay.getFirstSelectedOption().getText();
        String expected = "2020 June 25";
        String actual = actualYear + " " + actualMonth + " " + actualDay;
        Assert.assertEquals(actual, expected);
    }



//TC#8: Cybertek “month”dropdown list of default values verification
// 1.Do both verifications in the same test
// 2.Verify list of months are correct as expected.
// oExpected: Options should contain all 12 months of the year.
@Test
public void monthsDropdown() {

    List<String>expectedMonth= Arrays.asList("January","February","March","April","May",
            "June","July","August","September","October","November","December");
    List<String> actualMonth=new ArrayList<>();
    List<WebElement> list=driver.findElements(By.xpath("//select[@id='month']/option"));
    for (WebElement each :list){
        actualMonth.add(each.getText());

    }
    Assert.assertEquals(expectedMonth,actualMonth);
}
@AfterMethod
    public void tearDown(){
        driver.close();
}

}