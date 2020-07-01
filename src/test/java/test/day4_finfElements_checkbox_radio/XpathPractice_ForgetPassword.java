package test.day4_finfElements_checkbox_radio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class XpathPractice_ForgetPassword {
    public static void main(String[] args) {
        //#1: PracticeCybertek.com_ForgotPassword WebElement verificatio

        // 1. Open Chrome browser

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        // 2. Go to http://practice.cybertekschool.com/

        driver.get("http://practice.cybertekschool.com/forgot_password");

        // 3. Locate all the WebElements on the page using XPATH locator only (total of 6)
        // a. “Home” link
        WebElement homeLink = driver.findElement(By.xpath("//a[.='Home']"));
        // b. “Forgot password” header
        WebElement forgotPassword = driver.findElement(By.xpath("//h2[.='Forgot Password']"));
        // c. “E-mail” textd. E-mail input boxe. “Retrieve password” buttonf. “Powered byCybertek School” text
        WebElement email = driver.findElement(By.xpath("//label[@for='email']"));

        WebElement Emailinput = driver.findElement(By.xpath("//input[@name='email']"));

        WebElement RetrievePasswordButton = driver.findElement(By.xpath("//button[@id='form_submit']"));

        WebElement footerText = driver.findElement(By.xpath("//a[.='Cybertek School']/.."));

        // 4. Verify all WebElements are displayed.
        if (homeLink.isDisplayed() && forgotPassword.isDisplayed() && email.isDisplayed() && Emailinput.isDisplayed()
                && RetrievePasswordButton.isDisplayed() && footerText.isDisplayed()){
        System.out.println("Verification PASSED");
    }else{
            System.out.println("verification FAILED");
        }




    }
}
