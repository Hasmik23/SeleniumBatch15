package class5HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class CheckBoxesHW {
    public static void main(String[] args) {

        //Homework

        //System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe"); // connect chrome driver to Drivers
        // create an istance of WebDriver
        //WebDriver driver = new ChromeDriver();

        ChromeOptions co = new ChromeOptions();

        co.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(co);
        // open the Website google.com
        driver.get("http://practice Syntax Automation Platform");  //open browser

        // get all the checkboxes
        List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@class='cb1-element']"));
//to select checkbox
        // iterate through the list
        for (int i = 0; i < checkBoxes.size(); i++) {
            String value = checkBoxes.get(i).getAttribute("value");
//check if this is the desired one
            //if yes click it
            //if no continue to iterate
            //    if(value.equals);
            // form web
            if (value.equalsIgnoreCase("Option-2")) {
                ((WebElement) checkBoxes.get(i)).click();
            }
        }
    }
}

