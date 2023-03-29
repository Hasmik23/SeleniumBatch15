package class04HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HW2 {
    public static void main(String[] args) {

          /* goto http://practice.syntaxtechs.net/basic-checkbox-demo.php
    1. u need to write down the code that can select  1 check box out of 4 mentioned,
    e.g option1 , option2 , option 3, option 4
    Note write down the logic in dynamic way i.e one change in if else condition can change ur selection
     */

       // System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
       // WebDriver driver = new ChromeDriver();
        ChromeOptions co = new ChromeOptions();

        co.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(co);
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");

        WebElement checkBox2 = driver.findElement(By.cssSelector("input[class='Option-2']"));
        checkBox2.click();

        boolean isSelectedCheckBox = checkBox2.isSelected();
        System.out.println("the check box is selected " + isSelectedCheckBox);

        if (!isSelectedCheckBox) {
            checkBox2.click();
        }
        //check if the check box 2 is selected after the click
        isSelectedCheckBox = checkBox2.isSelected();
        System.out.println("The status of selection is " + isSelectedCheckBox);

        boolean isSelectedcheckBox = checkBox2.isSelected();
        WebElement checkBox4 = driver.findElement(By.cssSelector("input[value='Option-4']"));
        boolean checkBox4Displayed = checkBox4.isDisplayed();
        if (checkBox4Displayed && isSelectedcheckBox) {
            checkBox2.click();

            driver.close();
        }
    }
}
