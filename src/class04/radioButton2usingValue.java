package class04;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radioButton2usingValue {
    public static void main(String[] args) {

        // Tel your project where the webdriver is located
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe"); // connect chrome driver to Drivers file on left

        //create an instance of WebDriver
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        // open the website
        driver.get("http://practice.syntaxtechs.net/basic-radiobutton-demo.php");

        //find all the age group radio buttons
        // the xpath is common to all the webElements that have age group
        List<WebElement> radioBtns = driver.findElements(By.xpath("//input[@name='ageGroup']"));
       // iterate over the list to see your desired one
        for(WebElement radioBtn: radioBtns){
            String age=radioBtn.getAttribute("value");
            //if the value of the WebElement is 5-10 click on it
            if(age.equalsIgnoreCase("5-10")){
                radioBtn.click();
            }
        }

    }
}
