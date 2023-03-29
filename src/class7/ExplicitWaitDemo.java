package class7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWaitDemo {
    public static void main(String[] args) {

        // Tel your project where the WebDriver is located
        //System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe"); // connect chrome driver to Drivers file on left
        //WebDriver driver=new ChromeDriver();
       ChromeOptions co = new ChromeOptions();

        co.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(co);
        driver.manage().window().maximize();

        //go to syntax website
        driver.get("http://practice.syntaxtechs.net/dynamic-elements-loading.php");
       // click on the start button
        driver.findElement(By.xpath("//button[@id='startButton']")).click();

        // after we click on element start we need to wait
        // as  the element that contains text becomes visible after some time, so first we need to implement the Explicit wait and then get the text
        // WebDriverWait wait= new WebDriverWait(driver,20); //if this line didn't work go with next line
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));   //for selenium 4

        // wait until the text become visible
        WebElement element = driver.findElement(By.xpath("//h4[text()='Welcome Syntax Technologies']"));
        wait.until(ExpectedConditions.visibilityOf(element));

       // once the element is visible then get the text
        WebElement text = driver.findElement(By.xpath("//h4[text()='Welcome Syntax Technologies']"));
        String WelcomeText = text.getText();
        System.out.println(WelcomeText);

    }
}
