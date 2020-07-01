package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class SmartBearUtilities {
    public static void login(WebDriver driver) {
        //3. Enter username: “Tester”
        WebElement inputUsername = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_username']"));
        inputUsername.sendKeys("Tester");
        //4. Enter password: “test”
        WebElement inputPassword = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_password']"));
        inputPassword.sendKeys("test");
        //5. Click to Login button
        WebElement loginButton = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_login_button']"));
        loginButton.click();
    }

    public static void verifyOrder(WebDriver driver, String name) {
        //PRACTICE #4: Method: verifyOrder
        // • Create a method named verifyOrder in SmartBearUtils class.
        // • Method takes WebDriver object and String(name).
        // • Method should verify if given name exists in orders.
        // • This method should simply accepts a name(String), and assert whether given name is in the list or not.
        // • Create a new TestNG test to test if the method is working as expected.


        List<WebElement> namesList = driver.findElements(By.xpath("//table[@class='SampleTable']/tbody//td[2]"));
        for (WebElement each : namesList) {
            if (each.getText().equals(name)) {
                Assert.assertTrue(true);
                return;
            }


        }
        Assert.fail("The name doesnt exist in the list");

    }

    ////Practice #5: Method: printNamesAndCities
    // • Create a method named printNamesAndCities in SmartBearUtils class.
    // • Method takes WebDriver object.
    // • This method should simply print all the names in the List of All Orders. • Create a new TestNG test to test if the method is working as expected. • Output should be like:
    // • Name1: name , City1: city
    // • Name2: name , City2: city
    public static void printNamesAndCities(WebDriver driver){
      // the list where we store all of the cities in the web element
        List<WebElement> namesList = driver.findElements(By.xpath("//table[@id='SampleTable']/tbody//td[2]"));
//the list where we store all of the cities in web table
        List<WebElement> citiesList = driver.findElements(By.xpath("//table[@id='SampleTable']/tbody//td[7]"));


    }
}










