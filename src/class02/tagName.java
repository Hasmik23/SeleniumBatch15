package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagName {
    public static void main(String[] args) {

        // Tel your project where the webdriver is located
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        //create an instance of WebDriver
        WebDriver driver=new ChromeDriver();

        //maximize the website
        driver.manage().window().maximize();


//        navigate to the website
        driver.get("https://amazon.com");

        // print all the liks
        driver.findElements(By.tagName("a"));




    }
}

