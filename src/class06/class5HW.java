package class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class class5HW {
    public static void main(String[] args) {
        // Tel your project where the webdriver is located
       // System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe"); // connect chrome driver to Drivers file on left
        //create an instance of WebDriver
       // WebDriver driver = new ChromeDriver();

        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(co);

        driver.manage().window().maximize();

        // implicit wait
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        // open up facebook.com
        driver.get("http://www.facebook.com");
        //click on the create new account
        driver.findElement(By.linkText("Create new account")).click();

        // send your firstname
        driver.findElement(By.name("firstname")).sendKeys("Hasmik");

    }
}
