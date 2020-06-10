package test.day1_selenium_intro;

/*
TC	#1:	Google	Title	Verification1.Open	Chrome	browser
2.Go	to	https://www.google.com3.Verify	title:	Expected:	GoogleTC
#2:	Cybertek	verifications1.Open	Chrome	browser
2.Go	to	https://practice.cybertekschool.com
3.Verify	URL	containsExpected:	cybertekschool
4.Verify	title:	Expected:	Practice
 */

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();//1, sets the driver//will open the browser session

        //2
        WebDriver driver=new ChromeDriver();//will need to run every time
        //3
        driver.manage().window().maximize();

        //go to google
        driver.get("https://www.google.com");//gets the page

        String actualTitle=driver.getTitle();
        String expectedTitle="Google";
        if(actualTitle.equals(expectedTitle)){//expected will be always provide to you in requirement documents
            System.out.println("google title verification PASSED");

        }else{
            System.out.println("google title verification FAILED");
        }


    }
}
