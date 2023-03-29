package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;


public class DropDown {
    public static void main(String[] args) throws InterruptedException {

        // Tel your project where the webdriver is located
       // System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe"); // connect chrome driver to Drivers file on left
        //WebDriver driver=new ChromeDriver();
        ChromeOptions co = new ChromeOptions();

        co.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(co);

        driver.manage().window().maximize();

        driver.get("http://practice.syntaxtechs.net/basic-radiobutton-demo.php");

        //Locate the web element
        WebElement DD=driver.findElement(By.xpath("//select[@id='select-demo']"));

         Select sel=new Select(DD);  // we pass parameter because of parameterized constructor

        sel.selectByIndex(2);
        Thread.sleep(2000);

       // select By value
        sel.selectByValue("Tuesday");
        Thread.sleep(2000);

        //select by visible text
        sel.selectByVisibleText("Friday");
        Thread.sleep(2000);


    }
}
