package test.day2_findElement_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1_EtsyTitleVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //2

        /*
       TC #1: EtsyTitle Verification1.Open Chrome browser
       2.Go to https://www.etsy.com
       3.Search for “wooden spoon”
       4.Verify title: Expected: “Wooden spoon | Etsy”
         */
       //2.
         driver.get("https://www.etsy.com");

        //3
        driver.findElement(By.id("global-enhancements-search-query")).sendKeys("wooden spoon" + Keys.ENTER);

        //4

        String expectedTitle="Wooden spoon | Etsy";
        String actualTitle=driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Verification PASSES!");
        }else{
            System.out.println("Verification FAILED!");

        }




            


    }
}
