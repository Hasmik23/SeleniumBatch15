package class08HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import javax.swing.*;
import java.util.List;

public class HW1 {
    public static void main(String[] args) {
        /* http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login
              username=Admin        password=Hum@nhrm123
          2. click on PIM option
          3. from the table select or choose Any value of id and click the check box associated with it
              make sure that ur code is dynamic i.e
              changing the id doesnt effect the logic or xpath*/

       // System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe"); // connect chrome driver to Drivers file on left
       // WebDriver driver=new ChromeDriver();
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(co);

        driver.manage().window().maximize();

        //go to syntax project.com
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

        WebElement userName=driver.findElement(By.xpath("//input[@id='txtUsername']"));
            userName.sendKeys("Admin");

        WebElement password = driver.findElement(By.id("txtPassword"));
        password.sendKeys("Hum@nhrm123");

        WebElement login=driver.findElement(By.xpath("//input[@id='btnLogin']"));
        login.click();

        driver.findElement(By.xpath("//a[@class='firstLevelMenu']/b[text()='PIM']")).click();

        //52387A     52122A

        List<WebElement> column=driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));

        for(int i=0; i<column.size();i++){
            String text=column.get(i).getText();
            if(text.equalsIgnoreCase("52122A")){
                System.out.println("location "+i);
                driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+(i+1)+"]/td[1]")).click();
            }
        }

    }
}

/*


           //4318210 Natalia GL

        List<WebElement> row = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));

        for (int i = 0; i < row.size(); i++) {
            String id=row.get(i).getText();
            if(id.equalsIgnoreCase("52483A")){
                System.out.println(id);
                System.out.println("Row of the ID is "+i+1);
                driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+(i+1)+"]/td[1]")).click();
            }
}
}}
 */