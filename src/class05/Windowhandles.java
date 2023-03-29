package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Windowhandles {
    public static void main(String[] args) {

        // Tel your project where the webdriver is located
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe"); // connect chrome driver to Drivers file on left
        //create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/javascript-alert-box-demo.php");

        // click on the help button
        driver.findElement(By.xpath("//a[text()=Help']")).click();
        //click on privacy
        driver.findElement(By.xpath("//a[text()=Privacy']")).click();

        //get the window handle of the parent window
        String parentWindowhandle = driver.getWindowHandle();  // parent we saved gmail.com here
        System.out.println(parentWindowhandle);

        //get window handles of all the windows that have been opened up
        Set<String> windowHandles = driver.getWindowHandles();  //help   privacy
        // print all the window handles
        for (String wh : windowHandles) {
            // switch the focus of the window to Help window
            driver.switchTo().window(wh);
            // check the title of the window to which our focus is right now
            String title = driver.getTitle();
            if (title.equalsIgnoreCase("Privacy Policy - Privacy $ Terms - Google")) {
                break;
            }
        }
        //to verify we switched to the right window;
        System.out.println(driver.getTitle());

        driver.switchTo().window(parentWindowhandle);  //back handle to parent window-gmail

    }
}


