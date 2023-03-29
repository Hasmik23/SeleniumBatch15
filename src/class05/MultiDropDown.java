package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;


public class MultiDropDown {
    public static void main(String[] args) throws InterruptedException {


        // Tel your project where the webdriver is located
       // System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe"); // connect chrome driver to Drivers file on left
        //create an instance of WebDriver
       //Driver driver=new ChromeDriver();
        ChromeOptions co = new ChromeOptions();

        co.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(co);

        driver.manage().window().maximize();

        // open up facebook.com
        driver.get("http://practice.syntaxtechs.net/basic-select-dropdown-demo.php");

        WebElement DD=driver.findElement(By.xpath("//select[@id='multi-select']"));

        Select sel=new Select(DD);

        //  select by value
        sel.selectByValue("New Jersey");
        Thread.sleep(2000);

        //select by visible text
        sel.selectByVisibleText("Ohio");
        Thread.sleep(2000);

         //select by value
        sel.deselectByValue("New Jersey");

        sel.deselectByVisibleText("Ohio");

        //if we want to check weather it's multiple or not
        System.out.println(sel.isMultiple());

    }


    }

