package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HW4Student {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");

        List<WebElement> checkBoxes = driver.findElements(By.cssSelector("input[type='checkbox']"));
        checkBoxes.add(driver.findElement(By.cssSelector("input[id='check1']")));
        for (WebElement checkButton : checkBoxes) {
            String options = checkButton.getAttribute("value");
            if (options.equalsIgnoreCase("Option-1")) {
                boolean isSelected = checkButton.isSelected();
                System.out.print("Option-1 is selected :" + isSelected);
                if (!isSelected) {
                    checkButton.click();
                    System.out.print("After Click >>>Lets see");
                    isSelected = checkButton.isSelected();
                    System.out.print(" Option-1 is selected :" + isSelected);
                }
            }
            if (options.equalsIgnoreCase("Option-2")) {
                boolean isSelected = checkButton.isSelected();
                System.out.println("Option-2 is selected :" + isSelected);
                if (!isSelected) {
                    checkButton.click();
                    isSelected = checkButton.isSelected();
                    System.out.println("Option-2 is selected :" + isSelected);
                }
            }
            if (options.equalsIgnoreCase("Option-3")) {
                boolean isSelected = checkButton.isSelected();
                System.out.println("Option-3 is selected :" + isSelected);
                if (!isSelected) {
                    checkButton.click();
                    isSelected = checkButton.isSelected();
                    System.out.println("Option-3 is selected :" + isSelected);
                }
            }
            if (options.equalsIgnoreCase("Option-4")) {
                boolean isSelected = checkButton.isSelected();
                System.out.println("Option-4 is selected :" + isSelected);
                if (!isSelected) {
                    checkButton.click();
                    isSelected = checkButton.isSelected();
                    System.out.println("Option-4 is selected :" + isSelected);
                }


            }
            if(options.equalsIgnoreCase("Check All")){
                checkButton.click();
            } else if (options.equalsIgnoreCase("Uncheck All")) {
                checkButton.click();

            }

        }
    }
}


