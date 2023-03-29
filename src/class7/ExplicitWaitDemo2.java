package class7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWaitDemo2 {
    public static void main(String[] args) {


        ChromeOptions co = new ChromeOptions();

        co.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(co);
        //max window
        driver.manage().window().maximize();

        // go to syntax project.com
        driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
          //  click on alert button
        driver .findElement(By.xpath("//button[@id='alert']")).click();

         //wait until the alert is present
        //1.
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.alertIsPresent());

        driver.switchTo().alert().accept();


    }
}
