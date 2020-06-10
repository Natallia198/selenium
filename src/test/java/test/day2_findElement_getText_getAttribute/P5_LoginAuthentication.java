package test.day2_findElement_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P5_LoginAuthentication {
    public static void main(String[] args) {
       //1
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
       //2
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
//verifyes title equals
        String actualTitle=driver.getTitle();
        String expectedTitle="Web Orders login";

        if(actualTitle.equals(expectedTitle)){
            System.out.println("HomePage title verification PASSED!");
        }else{
            System.out.println("HomePage title verificationFAILED!");
        }

        //4 enter username: Tester
        driver.findElement(By.name("ctl00$MainContent$username")).sendKeys("Tester");
        //5 enter password:test
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
        //6 click "sign in
        driver.findElement(By.name("ctl00$MainContent$login_button")).click();
        //7 verify tittle equals

        //this is actual title   //this is expected title
        if(driver.getTitle().equals("Web Orders")){//or you can work with actul tittle and expected tittle like at line 20
            System.out.println("Home page verification PASSED!");
        }else {
            System.out.println("Home page verification FAILED!");

        }






    }
}
