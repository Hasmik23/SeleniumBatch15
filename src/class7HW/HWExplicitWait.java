package class7HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HWExplicitWait {
    public static void main(String[] args) {
    /* You have to do all explicit wait examples from the link I used in class .
       For the alert example*/

        // Tel your project where the webdriver is located
       // System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe"); // connect chrome driver to Drivers file on left
        //        create an instance of WebDriver
       // WebDriver driver=new ChromeDriver();

        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(co);

        //max window
        driver.manage().window().maximize();

        // go to syntax project.com
        driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
        //  click on alert button
        driver.findElement(By.xpath("//button[@text()='Click me!']")).click();

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
        //wait until the text become visible
     //   wait.until(ExpectedConditions.alertIsPresent());


      driver.switchTo().alert().accept();
      driver.quit();
}
}
/*public class ExWait {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
//      create an instance of WebDriver
        WebDriver driver = new ChromeDriver();

//      max the window
        driver.manage().window().maximize();

//      implicit wait
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        goto syntax projects.com
        driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");

//        click on alert button
        driver.findElement(By.xpath("//button[@id='alert']")).click();

//        wait until the alert is present
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.alertIsPresent());
        Thread.sleep(1000);
        driver.switchTo().alert().accept();

        driver.findElement(By.xpath("//button[@id='populate-text']")).click();
        WebDriverWait wait1 = new WebDriverWait(driver, 20);
        WebElement msg = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='Selenium Webdriver']")));
        System.out.println(msg.getText());

        driver.findElement(By.xpath("//button[@id='display-other-button']")).click();
        WebDriverWait wait2 = new WebDriverWait(driver, 20);
        WebElement but = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='hidden']")));
        System.out.println("Button enabled: " + but.isEnabled());

        driver.findElement(By.xpath("//button[@id='enable-button']")).click();
        WebDriverWait wait3 = new WebDriverWait(driver, 20);
        WebElement but2 = wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='disable']")));
        System.out.println("Button enabled: " + but.isEnabled());

        driver.findElement(By.xpath("//button[@id='checkbox']")).click();
        WebDriverWait wait4 = new WebDriverWait(driver, 20);
        WebElement cBox = driver.findElement(By.xpath("//input[@id='ch']"));
        wait4.until(ExpectedConditions.elementToBeSelected(cBox));
        System.out.println("Checkbox selected: " + cBox.isSelected());
    }
}
*/