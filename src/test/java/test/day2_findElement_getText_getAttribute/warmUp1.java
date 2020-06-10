package test.day2_findElement_getText_getAttribute;
/*
C #3: PracticeCybertek/ForgotPassword URL verification
6.Verify textbox displayed the content as expected.Expected: “Your e-mail’s been sent!
”Hint: You need to use getText method for this practice.
 */

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class warmUp1 {

    public static void main(String[] args) {
       //1.Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();


        //2.Go to http://practice.cybertekschool.com/forgot_password
        driver.get( "http://practice.cybertekschool.com/forgot_password");

       // 3.Enter any email into input box
       driver.findElement(By.name("email")).sendKeys("tesh84@yahoo.com");
       //4.click on retrive password
       driver.findElement(By.id("form_submit")).click();

       //5.Verify URL contains: Expected: “email_sent”

        String actualURL=driver.getCurrentUrl();
        String expectedURL="email_sent";

        if(actualURL.contains(expectedURL)){
            System.out.println("URL verification PASSED!!!!");
        }else{
            System.out.println("URL verification FAILED!!!");
        }

           // 6.Verify textbox displayed the content as expected.
        // Expected: “Your e-mail’s been sent!”
        String actualtext=driver.findElement(By.name("confirmation_message")).getText();//returning text webElement
        String expectedText="Your e-mail's been sent!";
        if(actualtext.equals(expectedText)){
            System.out.println("Confirmation message verification PASSES!!!");

        }else{
            System.out.println("Confirmation message verification FAIILED!!");
        }
    }


}
