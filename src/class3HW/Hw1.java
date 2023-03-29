package class3HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw1 {
    public static void main(String[] args) throws InterruptedException {
       /* use xpath to complete this
    goto http://practice.syntaxtechs.net/basic-first-form-demo.php
        enter the message in the text box
        click on show message
        Enter value of a
        Enter value of B
        click on the button get total
        also please print the value of the attribute type of the button GET TOTAL*/

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe"); // connect chrome driver to Drivers file on left
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://practice.syntaxtechs.net/basic-first-form-demo.php");

        driver.findElement(By.xpath("//input[@id='user-message']")).sendKeys("Hello");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[text()='Show Message']")).click();

        driver.findElement(By.xpath("//input[@id='sum1']")).sendKeys("abc");
        driver.findElement(By.xpath("//input[@id='sum2']")).sendKeys("def");

        driver.findElement(By.xpath("//button[text()='Get Total']")).click();
        WebElement getTotal= driver.findElement(By.tagName("button"));
        String total = getTotal.getText();
        System.out.println(total);

        driver.close();

        /*
          driver.findElement(By.xpath("//input[contains(@id,'sum1')]")).sendKeys("10");
        driver.findElement(By.xpath("//input[contains(@id,'sum2')]")).sendKeys("20");
        driver.findElement(By.xpath("//button[text()='Get Total']")).click();
        List<WebElement> total = driver.findElements(By.xpath("//button[text()='Get Total']"));
        for (WebElement t : total) {
            String sum = t.getAttribute("type");
            System.out.println(sum);

         */


    }
}
