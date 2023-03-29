package class04HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HW1 {
    public static void main(String[] args) {

          /* goto http://practice.syntaxtechs.net/basic-checkbox-demo.php
             check if the check box    "click on this check box" is Selected
             if no  Select the check box
             check again if the checkbox is Selected or not */

       // System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
     //   WebDriver driver=new ChromeDriver();
        ChromeOptions co = new ChromeOptions();

        co.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(co);
        driver. manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");

            WebElement checkBox= driver.findElement(By.cssSelector("input#isAgeSelected"));
            boolean isSelectedCheckBox=checkBox.isSelected();
            System.out.println("the check box is selected " + isSelectedCheckBox);

            if(!isSelectedCheckBox) {
                checkBox.click();
            }
            //check if the check box is selected after the click
            isSelectedCheckBox=checkBox.isSelected();
            System.out.println("The status of selection is "+isSelectedCheckBox);

            driver.close();
        }

}
