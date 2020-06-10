package test.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args)  throws InterruptedException{
        //1.set up webdriver
       WebDriverManager.chromedriver().setup();
       //2.create the instance of the chromedriver
        WebDriver driver=new ChromeDriver();//line opening browser session
        //each session is new session, no browser history (cash)is store, will be new every time
        //3.test driver
        driver.manage().window().maximize();//maximaz the page after opening
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        //BROWSER NAVIGATIONS
        Thread.sleep(2000);//this line add 2 sec of waiting time
        driver.navigate().back();//this line will take user to priv page

        Thread.sleep(2000);
        driver.navigate().forward();//will go forward

        Thread.sleep(2000);
        driver.navigate().refresh();//refresh page

        driver.navigate().to("https://www.facebook.com");//acceps the string to take you to URl


        System.out.println(driver.getTitle());

        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());
        driver.close();//will close the page after go over all the steps
        driver.quit();//will end session


    }
}
