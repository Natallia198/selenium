package test.day4_finfElements_checkbox_radio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class P02_Apple_FindElements {
    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

    // 2.Go to https://www.apple.com
        driver.get("https://www.apple.com");

    // 3.Click to all of the headers one by onea.Mac, iPad, iPhone, Watch, TV, Music, Support
        WebElement iphoneLink=driver.findElement(By.xpath("//span[ .='iPhone']/.."));

        iphoneLink.click();
    // 4.Printout how many links on each pagewiththe titles of the pages
     List<WebElement>allLinks= driver.findElements(By.xpath("//body//a"));//will return all the links
        // 5.Loop through all

        int linksWithoutText=0;
        int linksWithText=0;

        for (WebElement link: allLinks){
            String textOfLinks=link.getText();

            System.out.println(textOfLinks);
            if (textOfLinks.isEmpty()){
                linksWithoutText++;

            }else{
                linksWithText++;
            }

        }

    // how many links missing text
        System.out.println("number links without text" + linksWithoutText);

    // 7.Print out how many link has textTOTAL
        System.out.println("number of links with text" + linksWithText);
    // 8.Print out how many total linkTOTAL
        System.out.println("number of total links" + allLinks.size());


}
}
