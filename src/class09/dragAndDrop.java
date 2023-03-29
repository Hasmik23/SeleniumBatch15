package class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class dragAndDrop {
    public static void main(String[] args) {

       // System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe"); // connect chrome driver to Drivers file on left
       // WebDriver driver=new ChromeDriver();

        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(co);
        driver.manage().window().maximize();


        //go to syntax project.com
        driver.get("https://jqueryui.com/droppable");

       // in inspect it's iframe. we have to switch the focus and we choose index [0] but on the whole page there is only one iframe
        driver.switchTo().frame(0);

      //  1. locate the element which I want to drag
               WebElement draggable= driver.findElement(By.id("draggable"));

               // locate the dropable element
        WebElement droppable= driver.findElement(By.id("droppabl"));

        //action class (hoover your mouse) from selenium. declare action
        Actions action=new Actions(driver);

        action.dragAndDrop(draggable,droppable).perform();

    }
}
