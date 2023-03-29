package class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class TablesDemoPagination {
    public static void main(String[] args) {

        /* Tel your project where the webdriver is located
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe"); // connect chrome driver to Drivers file on left
        WebDriver driver = new ChromeDriver();*/

        ChromeOptions co = new ChromeOptions();

        co.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(co);
        //max
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

            //teacher's code
        //fill out username
        driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("admin");
        //fill out password
        driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("Hum@nhrm123");
        //press the Login button
        driver.findElement(By.xpath("//input[@name='Submit']")).click();
        //find the PIM button
        WebElement pimBtn = driver.findElement(By.xpath("//b[text()='PIM']"));
        //click on it
        pimBtn.click();
        //find the Employee List
        WebElement employeeListBtn = driver.findElement(By.xpath("//a[text()='Employee List']"));
        //click on it
        employeeListBtn.click();

//        ------------------------

//        get the employee id 52396A  and click on the checkbox associated with it

//in order to find the desired id (on the first page)
        boolean idfound=false;
        while(!idfound) {
            //we put inside the loop to find the element again after refresh and discarded
            //as DOM is refreshed after the click button on next page so we find elements in the loop
            List<WebElement> ids = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));
          for (int i = 0; i < ids.size(); i++) {    //i =page number
            String id = ids.get(i).getText();
// scan the whole values on the page
            if (id.equalsIgnoreCase("52396A")) {

                System.out.println("id is on the row " + i);
//                to click on the particular checkbox
                WebElement checkBox = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + (i + 1) + "]/td[1]"));
                checkBox.click();
                idfound=true;
                break;  //(break the inner loop after finding the value)
            }
        }
        //click on the next page
        WebElement nextBtn=driver.findElement(By.xpath("//a[text()='Next']"));
        nextBtn.click(); //if value didn't find go to next page and go to while loop and repeat it
    }
}
}

