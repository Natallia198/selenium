package test.day7_javafaker_webtables;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class T6_Practice {
    //TC#6: Cybertek registration form confirmationNote: Use JavaFaker when possible.

    WebDriver driver;
    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/registration_form");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    public void test() throws InterruptedException {
        Faker faker = new Faker();
        // 3.Enter first name
        WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
        firstName.sendKeys(faker.name().firstName());
        Thread.sleep(500);
        // 4.Enter last name
        WebElement lastName = driver.findElement(By.xpath("//input[@name='lastname']"));
        lastName.sendKeys(faker.name().lastName());
        Thread.sleep(500);
        // 5.Enter username
        WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
        userName.sendKeys("alpha01");
        Thread.sleep(500);
        // 6.Enter email address
        WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
        email.sendKeys(faker.internet().emailAddress());
        Thread.sleep(500);
        // 7.Enter password
        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys(faker.internet().password());
        Thread.sleep(500);
        // 8.Enter phone number
        WebElement phone = driver.findElement(By.xpath("//input[@name='phone']"));
        phone.sendKeys("911-911-9191");
        Thread.sleep(500);
        // 9.Select a gender from radio buttons
        driver.findElement(By.xpath("//input[@value='male']")).click();
        Thread.sleep(500);
        // 10.Enter date of birth
        WebElement birthday = driver.findElement(By.xpath("//input[@name='birthday']"));
        birthday.sendKeys("10/04/1985");
        Thread.sleep(500);
        // 11.Select Department/Office
        Select departmanDropdown = new Select(driver.findElement(By.xpath("//select[@name='department']")));
        departmanDropdown.selectByVisibleText("MPDC");
        Thread.sleep(500);
        // 12.Select Job Title
        Select jobTitleDropdown = new Select(driver.findElement(By.xpath("//select[@name='job_title']")));
        jobTitleDropdown.selectByIndex(2);
        Thread.sleep(500);
        // 13.Select programming language from checkboxes
        driver.findElement(By.xpath("//input[@value='java']")).click();
        Thread.sleep(500);
        // 14.Clickto sign up button
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        // 15.Verify success message "You've successfully completed registration."is displayed.
        String actual = driver.findElement(By.xpath("//h4[@class='alert-heading']/following-sibling::p")).getText();
        System.out.println(actual);
        String expected = "You've successfully completed registration!";
        Assert.assertEquals(expected, actual);
    }
    @AfterMethod
    public void quit() throws InterruptedException {
        Thread.sleep(500);
        driver.close();
    }
}