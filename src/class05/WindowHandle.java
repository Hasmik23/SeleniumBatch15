package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Iterator;
import java.util.Set;

public class WindowHandle {
    public static void main(String[] args) {

        // Tel your project where the webdriver is located
        //System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe"); // connect chrome driver to Drivers file on left
        //create an instance of WebDriver
       // WebDriver driver = new ChromeDriver();
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(co);

        driver.manage().window().maximize();
         driver.get("http://practice.syntaxtechs.net/javascript-alert-box-demo.php");

          // click on the help button
        driver.findElement(By.xpath("//a[text()='Help']")).click();
          //click on the privacy
        driver.findElement(By.xpath("//a[text()='Privacy']")).click();

          //get the window handle of the parent window
        String parentWindowhandle=driver.getWindowHandle();  // parent gmail.com
        System.out.println(parentWindowhandle);

       //get window handles of all the windows that have been opened up
        Set<String> windowHandles = driver.getWindowHandles();  //help   privacy
      for(String wh:windowHandles){
          System.out.println(wh);
        }
    }
}
        // Teachers code
        /*   Set<String> windowHandles = driver.getWindowHandles();
            Iterator var4 = windowHandles.iterator();

            while (var4.hasNext()) {
                String wh = (String) var4.next();
                System.out.println(wh);
            }
        }
    }*/

