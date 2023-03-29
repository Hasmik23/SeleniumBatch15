package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
    public static void main(String[] args) {


        // Tel your project where the webdriver is located
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        //create an instance of WebDriver
        WebDriver driver=new ChromeDriver();  //WebDriver is a return type

        //open smart bear
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fDefault.aspx");

        //find the username
        //method
        WebElement username=driver.findElement(By.xpath("//input[contains(@name,'username')]")); //findElement will return  WebElement
        //WebElement is a return type, username is a variable
        username.sendKeys("Tester");  // on seperate line to be able to use it multiple time

        //find the password
        driver.findElement(By.xpath("//input[@type,'password')]")).sendKeys("test");
// username text box using method clear()
        username.clear();

        //clear the password/ in this case we have to find the element because .sendKeys("test"); is on the same line

        //task- get the text username which is beside the usename text box
        WebElement usenameText=driver.findElement(By.xpath("//label[text()='Username:']"));
        System.out.println(usenameText.getText());

        WebElement passwordText = driver.findElement(By.xpath("//label[text()='Password:']"));
        String pasText = passwordText.getText();
        System.out.println(pasText);






    }
}
