package test.day6_testing_dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T3_SelectingDateOnDropdown {
    WebDriver driver;

    /*
    TC #3: Selecting date on dropdown and verifying
     */


    //    1.Open Chrome browser
    //    2.Go to http://practice.cybertekschool.com/dropdown
    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");

    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        //Thread.sleep(2000);
        // driver.close();
    }

    // 3.Select “December 1st, 1921” and verify it is selected.
    //   : value attributeSelect day using: index number

    @Test
    public void test1_selecting_date_test() {


        Select yearDropdown = new Select(driver.findElement(By.xpath("//select[@id='year']")));
        Select monthDropdown = new Select(driver.findElement(By.xpath("//select[@id='month']")));
        Select dayDropdown = new Select(driver.findElement(By.xpath("//select[@id='day']")));

        //Seleting year by visable text
        yearDropdown.selectByVisibleText("1921");

        //select month by value
        monthDropdown.selectByValue("11");
        //select day by index number
        dayDropdown.selectByIndex(0);

        //creating expected value
        String expectedYear = "1921";
        String expecteDay = "1";
        String expectedMonth = "December";

        //creating actual value
        String actualYear = yearDropdown.getFirstSelectedOption().getText();
        String actualMonth = monthDropdown.getFirstSelectedOption().getText();
        String actualDay = dayDropdown.getFirstSelectedOption().getText();

        //assertion of actual vs expected
        Assert.assertEquals(expectedYear, actualYear);
        Assert.assertEquals(expectedMonth, actualMonth);
        Assert.assertEquals(expecteDay, actualDay);

    }
    /*
    TC #4: Selecting value from multiple select dropdown
    1.Open Chrome browser
    2.Go to http://practice.cybertekschool.com/dropdown//       FIRST 2 STEPS AUTOMATICALLY DONE, BECAUSE THEY ARE
    DECLARED IN BEFORE METHOD*/


    @Test
    public void test2_multiple_select_dropdown() {
        //3.Select all the options from multiple select dropdown.


        //locating select dropdown

        Select languagesDropdown = new Select(driver.findElement(By.xpath("//select[@name='Languages']")));

        // //Getting all of the options from dropdown and storing them into list of web elements

        //    4.Print out all selected values.
        List<WebElement> allOptions = languagesDropdown.getOptions();
        //Looping through the options and selecting them
        for (WebElement option : allOptions) {
            option.click();
            System.out.println("Selected: " + option.getText());
            Assert.assertTrue(option.isSelected());
        }
        //    5.Deselect all values.TC */
        languagesDropdown.deselectAll();
        //Asserting they are de-selected
        for (WebElement option1 : allOptions) {
            Assert.assertFalse(option1.isSelected());
        }
        // driver.close(); closing the web page

    }
        //TEST5
        /*
        TC #5: Selecting value from non-select dropdown
        1.Open Chrome browser
        2.Go to http://practice.cybertekschool.com/dropdown



         */
        @Test
        public void test5_non_selected_dropdown(){

            //first 2 steps done under before method
            //locating non-selcted dropdown
           // 3.Click to non-select dropdown
            WebElement webSiteDropdown = driver.findElement(By.xpath("//div[class@='dropdown']/a"));

            //Clicking to open the dropdown
            webSiteDropdown.click();

            // 4.Select Facebook from dropdown
            WebElement facebookLink=driver.findElement(By.xpath("//div[class@='Facebook']"));
            //clicking on facebook link
            facebookLink.click();

           // 5. Verify title is “Facebook -Log In or Sign Up”
            //creating acpected text
           String expectedText="Facebook -Log In or Sign Up";
           String actualText=driver.getTitle();
           //assert actual vs expected
            Assert.assertEquals(actualText,expectedText);






        }

    }













