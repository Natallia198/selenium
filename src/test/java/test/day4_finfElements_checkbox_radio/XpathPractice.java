package test.day4_finfElements_checkbox_radio;

import org.openqa.selenium.WebDriver;
import utilities.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class XpathPractice {
    public static void main(String[] args) {

        //TC #2: PracticeCybertek.com_AddRemoveElements WebElement verification

        // 4. Verify “Delete” button is displayed after clicking.
        // 5. Click to “Delete” button.
        // 6. Verify “Delete” button is NOT displayed after clicking. USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS

        // 1. Open Chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        // 2. Go to http://practice.cybertekschool.com/add_remove_elements

        driver.get("http://practice.cybertekschool.com/add_remove_elements");

        // 3. Click to “Add Element” button


    }
}
