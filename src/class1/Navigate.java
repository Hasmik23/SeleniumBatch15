package class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
    public static void main(String[] args) throws InterruptedException {

        // connect to webdriver
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        // to get a method from selenium initiate the instance of WebDriver

        WebDriver driver=new ChromeDriver();
        //open google.com
        driver.get("https://google.com");  // can't go back
        // slow down
        Thread.sleep(2000);
        //now navigate to facebook.com
        driver.navigate().to("https://www.facebook.com/");
        Thread.sleep(2000);
        //  driver.navigate() we can use many functions
        //1. go back
        driver.navigate().back();
        Thread.sleep(2000);
        // goto facebook
        driver.navigate().forward();
        Thread.sleep(2000);
        // refresh my page
        driver.navigate().refresh();
        //close the browser
        driver.close();


    }
}

