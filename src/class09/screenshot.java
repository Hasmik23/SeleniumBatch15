package class09;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class screenshot {
    public static void main(String[] args) throws IOException {

        // Tel your project where the webdriver is located
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe"); // connect chrome driver to Drivers file on left
       // create ab instance of WebDriver
        WebDriver driver = new ChromeDriver();
       // max the window
        driver.manage().window().maximize();

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

        //        username Text Box
        WebElement userName = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$username']"));
        userName.sendKeys("Tester");

//        password field
        WebElement pass = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$password']"));
        pass.sendKeys("test");
        //        password field

        //we will be learning screenshot > interface take screenshot
        //declaire

        // get method

       // save(sourceFile,destinationFile)


//        take screenshot
        TakesScreenshot ss = (TakesScreenshot) driver;  //interface
//        take the scrren shot as file
        File sourceFile = ss.getScreenshotAs(OutputType.FILE);
        System.out.println(sourceFile);
//        save the file in computer
        FileUtils.copyFile(sourceFile,new File("C:/Users/shira/SeleniumBatch15/SS/")); // want to be the screenshot on this location saved
//change the path
        //we take screenshot because this is felling




    }
}
