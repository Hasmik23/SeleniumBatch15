package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;

public class locatingElements {
    public static void main(String[] args) throws InterruptedException {

        // Tel your project where the webdriver is located
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe"); // connect chrome driver to Drivers file on left

        //create an instance of WebDriver
        WebDriver driver=new ChromeDriver();

       // open up facebook.com
        driver.get("https://www.facebook.com/");


        // send in the user name
        driver.findElement(By.id("email")).sendKeys("hasmik");


        //send the password
        driver.findElement(By.id("pass")).sendKeys("asdfghjk");


        //click on the button create New Account
    driver.findElement(By.linkText("Create new account")).click();  //we comment this up to work on forgot password


        //click on forgotten password
      //  driver.findElement(By.partialLinkText("password?")).click();

        driver.quit();
    }

}
