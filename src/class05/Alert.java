package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;


public class Alert {
    public static void main(String[] args) throws InterruptedException {

        // Tel your project where the webdriver is located
     //   System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe"); // connect chrome driver to Drivers file on left
        //create an instance of WebDriver
      //  WebDriver driver=new ChromeDriver();

        ChromeOptions co = new ChromeOptions();

        co.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(co);

        driver.manage().window().maximize();

        // open up facebook.com
        driver.get("http://practice.syntaxtechs.net/javascript-alert-box-demo.php");

        //click on click button for simple prompt alert
        driver.findElement(By.xpath("button[text()='myAlertFunction()']")).click();
            //use SwitchTo
       Alert alert = (Alert) driver.switchTo().alert();
       Thread.sleep(2000);

// click on the prompt alert button
     driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']")).click();
       // switch the focus to alert
        Alert alert1 = (Alert) driver.switchTo().alert();
      //  alert.sendKey("qwerty");
       //  alert.accept();






    }
}
