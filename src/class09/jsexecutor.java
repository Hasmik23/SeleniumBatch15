package class09;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jsexecutor {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe"); // connect chrome driver to Drivers file on left
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        //go to syntax project.com
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");




//        find the webEelment username
        WebElement username = driver.findElement(By.id("txtUsername"));
        username.sendKeys("Admin");

        //using js Excecutor.declare it. use it whatever you execute any script
//        to highlight the username box

//        1. declare isntance
        JavascriptExecutor js=(JavascriptExecutor) driver;
//        2.execute script
//        arguments[0].style.border='10px dotted pink'"    draw a box
        js.executeScript("arguments[0].style.border='5px dotted blue'",username);

        //Find the element
        WebElement loginBtn= driver.findElement(By.xpath("//input[@id='btnLogin']"));
       // click the login button
                js.executeScript("arguments[0].click;",loginBtn);


    }
}
