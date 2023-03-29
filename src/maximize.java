import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class maximize {
    public static void main(String[] args) {

        // connect to the ebdriver
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        // create an instance of the Webdriver
        WebDriver driver=new ChromeDriver();

        //go to google.com
        driver.get("https://google.com");
       // maximize the window
        driver.manage().window().maximize();
        // full screen
        driver.manage().window().fullscreen();
        // close
        driver.close();

    }
}
