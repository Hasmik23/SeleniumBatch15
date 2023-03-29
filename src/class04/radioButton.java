package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class radioButton {
    public static void main(String[] args) {

        // Tel your project where the webdriver is located
      //  System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe"); // connect chrome driver to Drivers file on left
        //create an instance of WebDriver
       // WebDriver driver=new ChromeDriver();

        ChromeOptions co = new ChromeOptions();

        co.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(co);

        driver.manage().window().maximize();

        // open up facebook.com
        driver.get("http://practice.syntaxtechs.net/basic-radiobutton-demo.php");

        // click on the radio button
        WebElement maleBtn=driver.findElement(By.cssSelector("input[value='Male']"));
        //check if the radio button is enable
       boolean isenabledMale=maleBtn.isEnabled();
        System.out.println("the radio button is enabled"+isenabledMale);

        //check if the radio buttin is Display
        boolean isDisplayedMale = maleBtn.isDisplayed();
        System.out.println("the radio button male is displayed" + isDisplayedMale);

        //check if the radio buttin is selected
        boolean isSelectedmale = maleBtn.isSelected();
        System.out.println("the male button is selected " + isSelectedmale);

        //if the radio button of male not selected click on it
        if(!isSelectedmale) {
            maleBtn.click();
        }
//check if the radio button is selected after the click.it's importent to check again to avoid printing previous statement
        isSelectedmale=maleBtn.isSelected();    // no boolean because we are reassigning
        System.out.println("the status of selection is "+isSelectedmale);




    }
}
