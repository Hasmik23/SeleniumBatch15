package class02HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {
    public static void main(String[] args) throws InterruptedException {
/*navigate to fb.com. click on create new account
fill up all the textboxes. click on sign up button
close the pop up. close the browser*/

        // Tel your project where the webdriver is located
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        //create an instance of WebDriver
        WebDriver driver=new ChromeDriver();

        //navigate to the website
        driver.get("https://www.facebook.com");

        // maximize the website
        driver. manage().window().maximize();

        Thread.sleep(3000);

        driver.findElement(By.linkText("Create new account")).click();
        driver.findElement(By.name("firstname")).sendKeys("Aaa");
        driver.findElement(By.name("lastname")).sendKeys("Bbb");
        driver.findElement(By.name("reg_email__")).sendKeys("aa@gmail.com");
        driver.findElement(By.id("month")).sendKeys("March");
        driver.findElement(By.id("day")).sendKeys("15");
        driver.findElement(By.id("year")).sendKeys("1995");
        driver.findElement(By.id("day")).sendKeys("15");
        driver.findElement(By.name("sex")).click();
        driver.findElement(By.name("sex")).click();
        driver.findElement(By.name("sex")).click();
        driver.findElement(By.name("preferred_pronoun")).sendKeys("aaa");
        driver.findElement(By.name("custom_gender")).sendKeys("aaa");
        driver.findElement(By.name("websubmit")).click();

        Thread.sleep(2000);
        driver.quit();



    }
}
