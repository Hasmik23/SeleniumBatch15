package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class tagName {
    public static void main(String[] args) {

        // Tel your project where the webdriver is located
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        //create an instance of WebDriver
        WebDriver driver=new ChromeDriver();

        // maximize the website
        driver. manage().window().maximize();

        //navigate to the website
        driver.get("https://www.amazon.com");

        //get all the links
        // we know that all links are in tag <a>. which is also called anchor tag
        //lets use the locator By tagname for this purpose

        List<WebElement> tags=driver.findElements(By.tagName("a"));
        //in order to print we need to iterator
        for(WebElement tag:tags){    //tag to be web elemnt not list
          //  System.out.println(tag);
           String link=tag.getAttribute("href");
            System.out.println(link);
        }


    }
}
