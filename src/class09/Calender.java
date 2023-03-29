package class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Calender {

    public static void main(String[] args) {


      //  System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe"); // connect chrome driver to Drivers file on left
      //    WebDriver driver=new ChromeDriver();
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(co);

        driver.manage().window().maximize();

        //go to syntax project.com
        driver.get("/https://www.delta.com/");

        // click on the calender
       WebElement calander = driver.findElement(By.xpath("//span[text()='Depart']"));
        calander.click();

//         get the month from the calander. get the next button
        WebElement month = driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']"));
//        get the next page
        WebElement next = driver.findElement(By.xpath("//span[text()='Next']")); // no need to put WebElement inside the loop because will not refresh
//        click on next button until you find the right month
        boolean isFound=false;

        while(!isFound){
 //good practice to in
            String month_ = month.getText();
            if(month_.equalsIgnoreCase("January")){
//                select the day
                List<WebElement> days = driver.findElements(By.xpath("//table[@class='dl-datepicker-calendar']/tbody/tr/td"));
                for(WebElement day:days){
                    String day_text = day.getText();
                    if(day_text.equalsIgnoreCase("20")){
                        day.click();
                        isFound=true;
                        break;
                    }
                }

            }
            else {
                next.click();
            }

        }
    }
}




