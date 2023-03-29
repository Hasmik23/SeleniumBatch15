package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSselector {
    public static void main(String[] args) throws InterruptedException {

        // Tel your project where the webdriver is located
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe"); // connect chrome driver to Drivers file on left

        //create an instance of WebDriver
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        // open up facebook.com
        driver.get("https://www.facebook.com/");

       WebElement createNewBtn=driver.findElement(By.cssSelector("a[data-testid= 'open-registration-form-button']")); //save it in createNewBtn, return type is WebElement

       // click on the button
        createNewBtn.click();
        //sleep
        Thread.sleep(2000); //when we get error then we need to slowdown to locate username asdfghj or to slow
        // down the browser to get window that we are creating the accont If it does not work without sleep

        //fill in the first name
        WebElement firstname=driver.findElement(By.cssSelector("input[name='firstname']"));
        firstname.sendKeys("asdfghj");




    }
}
