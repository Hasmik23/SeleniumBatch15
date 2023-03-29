package class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class actionClass {
    public static void main(String[] args) {


      //  System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe"); // connect chrome driver to Drivers file on left
     //   WebDriver driver=new ChromeDriver();

        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(co);

        driver.manage().window().maximize();

        //go to syntax project.com
        driver.get("http://amazon.com");

        WebElement en=driver.findElement(By.xpath("//div[text()='EN']"));

        //action class (hoover your mouse) from selenium. declare action
        Actions action=new Actions(driver);

        action.moveToElement(en).perform();



    }
}
