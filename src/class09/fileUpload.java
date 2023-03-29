package class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class fileUpload {
    public static void main(String[] args) {

       // System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe"); // connect chrome driver to Drivers file on left
       // WebDriver driver=new ChromeDriver();

        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(co);

        driver.manage().window().maximize();

        //go to syntax project.com
        driver.get("https://the-internet.herokuapp.com/upload");

       WebElement chooseFile= driver.findElement(By.xpath("//input[@]id='file-upload']"));
            chooseFile.sendKeys("C:\\Users\\shira\\OneDrive\\Desktop\\Book1.xls");



    }
}
