package test.day4_finfElements_checkbox_radio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class P06_CheckboxTasks {

  //  TC #3: SeleniumEasy Checkbox Verification

    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);


        //   2.Go to https://www.seleniumeasy.com/test/basic-checkbox-demo.html
        driver.get(" https://www.seleniumeasy.com/test/basic-checkbox-demo.html");

        ////   3.Verify “Check All” button text is “Check All”
        WebElement checkAllButton = driver.findElement(By.xpath("//input[@id='check1']"));
        String actualText = checkAllButton.getAttribute("value");
        String expectedText = "Check All";


        if (actualText.equals(expectedText)) {
            System.out.println("Check button Verification PASSED!");
        } else {
            System.out.println("Check button Verification FAILED");
        }
        //   4.Click to “Check All” button
        checkAllButton.click();

        //   5.Verify all check boxes are checked//
        List<WebElement> checkBoxList = driver.findElements(By.xpath("//input[@class='cb1-element']"));

        for (WebElement checkBox : checkBoxList) {
            if (checkBox.isSelected()){
                System.out.println("Check box is selected. PASSED");
            }else{
                System.out.println("Check box is selected. FAILLED");
            }
             // //6.Verify button text changed to “Uncheck All”
            String actualButtonTextAfterClick=checkAllButton.getAttribute("value");
            String expectedValueAfterClick="Uncheck All";
            if(actualButtonTextAfterClick.equals(expectedValueAfterClick)){
                System.out.println("Final button verification PASSED");
            }else {
                System.out.println("Final button verification FAILLED");

            }


          //  checkBox.click();
            //driver.quit();
        }
    }




    }


