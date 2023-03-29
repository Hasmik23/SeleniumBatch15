package class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Frames {
    public static void main(String[] args) {

        // Tel your project where the webdriver is located
       // System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe"); // connect chrome driver to Drivers file on left
        //ebDriver driver=new ChromeDriver();

        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(co);

        driver.manage().window().maximize();

        driver.get("http://www.uitestpractice.com/Students/Switchto");

        //  switch to the iframe which contains the input box
        //   using method : 1. by index
        driver.switchTo().frame(0);

        //   this statement will shift the focus to the first  frame
        WebElement textBox = driver.findElement(By.xpath("//input[@id='name']"));
        //   send some text
        textBox.sendKeys("abracadabra");

       //     get the text click on the below link"
        //    first switch back to parent window
        driver.switchTo().defaultContent();

       //     find the text by this locator which is h3
        WebElement text = driver.findElement(By.xpath("//h3"));
        System.out.println("the text is "+text.getText());

        //    get the text "Enter your name" in iframe
        // using method : 2. use id or name to switch to parent
        driver.switchTo().frame("iframe_a"); //inspect Iframe and use name or id attribute.

       //"Enter your name"
        WebElement getLabel = driver.findElement(By.xpath("//label"));
        System.out.println("the label is :  "+getLabel.getText());

        //switch focus back to main page
        driver.switchTo().defaultContent();


        // clear what ever is written in the text box using 3rd method switch to an iframe using WebElement
        // using method : 3. switch to an iframe using WebElement
        WebElement frame1=driver.findElement(By.xpath("//iframe[@name='iframe_a']"));  //find webelement first
        driver.switchTo().frame(frame1);  //switch to Iframe window
        textBox.clear();    // we do not need to find textBox because we already fount it above

    }
}



