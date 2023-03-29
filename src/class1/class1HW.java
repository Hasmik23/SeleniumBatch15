package class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.URL;

public class class1HW {
    public static void main(String[] args) {
            // Tel your project where the webdriver ia located
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

   //create instance of webdriver
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.amazon.com");

        //get the current url that is there in the browser
        String URL=driver.getCurrentUrl();

        // print out the url
        System.out.println(URL);

        //get the title of the website
        String title=driver.getTitle();
        System.out.println("the title of the page is "+title);  // the main title of that page

        //close the browser
        driver.close();

    }
}








