package class02HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    public static void main(String[] args) throws InterruptedException {

   /*navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
         fill out the click on register close the browser*/

        // Tel your project where the webdriver is located
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        //create an instance of WebDriver
        WebDriver driver=new ChromeDriver();

       //navigate to the website
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");

       // maximize the website
        driver. manage().window().maximize();

        //First name
        driver.findElement(By.id("customer.firstName")).sendKeys("Hasmik");
        // Last name
        driver.findElement(By.id("customer.lastName")).sendKeys("Ohannesian");
        driver.findElement(By.id("customer.address.street")).sendKeys("M street");
        driver.findElement(By.id("customer.address.city")).sendKeys("NW");
        driver.findElement(By.id("customer.address.state")).sendKeys("DC");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("654433");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("8765432161");
        driver.findElement(By.id("customer.ssn")).sendKeys("6543256");
        driver.findElement(By.id("customer.username")).sendKeys("aaa");
        driver.findElement(By.id("customer.password")).sendKeys("fghjj");
        driver.findElement(By.id("repeatedPassword")).sendKeys("fghjj");
        driver.findElement(By.className("button")).click();

        Thread.sleep(3000);

        driver.quit();








    }
}
