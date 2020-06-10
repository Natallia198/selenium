package test.day2_findElement_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class warmUp3 {
    public static void main(String[] args) {
        /*
        TC #5: Basic authentication Zero Bank

         */

        //1.Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2.Go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");
        //3.Enter username: username

        driver.findElement(By.id("user_login")).sendKeys("username");

        //4.Enter password: password
        driver.findElement(By.id("user_password")).sendKeys("password");
        //5.Click sign in button
        driver.findElement(By.name("submit")).click();
        //6.Verify username is displayed on the page
        String actualusername = driver.findElement(By.className("container")).getText();
        String expectedusername = "username";
        if (actualusername.contains(expectedusername)) {
            System.out.println("PASSED!!!!");
        } else {
            System.out.println("FAILED!!");
        }

        //  7.Verify the title Zero –Account Summary
        String actualtitle = driver.getTitle();
        String expectedTitle = "Zero-Account Summary";
        if (actualtitle.equals(expectedTitle)) {
            System.out.println("The title verification PASSED");
        } else {
            System.out.println("The title verification FAILED!!!");
        }

        //  8.Verify the link Account Summary’s href value contains: “account-summary”Print out results in validation formats
        String actualLink = driver.findElement(By.linkText("account summary")).getAttribute("href");
        String expectedLink = "account summary";
        if (actualLink.contains(expectedLink)) {
            System.out.println("The link verification PASSED!!");
        } else {
            System.out.println("The link verification FAILLED");
        }
    }
    // Passed!
    //The title verification PASSED;
//The link ZEro-account summary verification PASSES!;


}