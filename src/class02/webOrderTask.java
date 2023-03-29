package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webOrderTask {
    public static void main(String[] args) {

        // Tel your project where the webdriver is located
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe"); // connect chrome driver to Drivers file on left

        //create an instance of WebDriver
        WebDriver driver=new ChromeDriver();

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
       // maximize the screen
        driver.manage().window().maximize();


        //  send the username
                driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
//send the passsend
     //   driver.findElement(By.name(By.name("ctl00_MainContent_password")).sendKeys("test");
                //click on the login button
        driver.findElement(By.className("button")).click();



    }
}
