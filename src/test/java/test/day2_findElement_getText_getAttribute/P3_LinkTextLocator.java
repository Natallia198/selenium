package test.day2_findElement_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
TC #3: Back and forth navigation1-Open a chrome browser
2-Go to: https://google.com3-Click to Gmail from top right.
4-Verify title contains:Expected: Gmail
5-Go back to Google by using the .back();
6-Verify title equals:Expected: Google
 */
public class P3_LinkTextLocator {
    public static void main(String[] args) {
        //1- Open a chrome browser and go to google
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        //2- Click to Gmail link from top right
        driver.findElement(By.linkText("Gmail")).click();
        //3- Verify Title contains Gmail, expected: "Gmail"
        String actualGmailTitle = driver.getTitle();
        String expectedInTitle = "Gmail";

        if (actualGmailTitle.contains(expectedInTitle)){
            System.out.println("Gmail title verification passed!");
        }else{
            System.out.println("Gmail title verification failed!!!");
        }

        //4- Go back to Google page by using back()
        driver.navigate().back();

        //5- Verify title equals to Google
        String actualTitle = driver.getTitle();
        String expectedtitle = "Google";

        if (actualTitle.equals(expectedtitle)){
            System.out.println("Google page title verification PASSED!");
        }else{
            System.out.println("Google page title verification FAILED!!!");
        }




    }
}