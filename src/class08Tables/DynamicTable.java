package class08Tables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class DynamicTable {
    public static void main(String[] args) {

       // System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe"); // connect chrome driver to Drivers file on left
       // WebDriver driver=new ChromeDriver();
        ChromeOptions co = new ChromeOptions();

        co.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(co);
        driver.manage().window().maximize();

        //go to syntax project.com
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Default.aspx");

                //        enter the username in the text box
        WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));
          username.sendKeys("Tester");
//        enter the password
        WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
          password.sendKeys("test");

//        click on login button
        WebElement loginButton = driver.findElement(By.id("ctl00_MainContent_login_button"));
          loginButton.click();


//task: get checkbox containing the product screensaver
        List<WebElement> column=driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr/td[3]"));
//iterate through each to see if it contains screen saver
        for (int i = 0; i <column.size() ; i++) {
            //extract the text
            String text= column.get(i).getText();
            if(text.equalsIgnoreCase("ScreenSaver")){ //equal not contains bc it's only one element
                System.out.println(text);

            //after you find i you have to inspect to find the exact location or row number
            //  System.out.println("The screen Saver is located at row number "+i);

              System.out.println("The screen Saver is located at row number "+(i+2));
                //table[@class='SampleTable']/tbody/tr/td[1] //for all checkboxes

                //after we find screen saver
                WebElement checkBox= driver.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr[" + (i+2 ) + "]/td[1]"));
                        checkBox.click();
                System.out.println("check the check box");

            }


        }


    }
}
