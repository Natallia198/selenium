package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {
    //1-make a constructor private
    private Driver(){

    }
    private static WebDriver driver;
    public static WebDriver getDriver() {

        if (driver == null) {
            //every time we calling this method, we are assuring that our method returnong
            //same method
            String browser = ConfigurationReader.getProperty("browser");
            switch (browser){
                case"chrome":
                    WebDriverManager.chromedriver().setup();
                    driver=new ChromeDriver();
                    break;
                case "FireFox":
                    WebDriverManager.firefoxdriver().setup();
                    driver=new FirefoxDriver();
                case "Edge":
                    WebDriverManager.edgedriver().setup();
                    driver=new EdgeDriver();


            }

        }
        return driver;

    }


}
