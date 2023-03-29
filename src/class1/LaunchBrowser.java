package class1;



import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {


    public static void main(String[] args) throws InterruptedException {

        //  System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // WebDriver driver=new ChromeDriver();
        // driver.get("https://www.google.com/");


        // Tel your project where the webdriver ia located
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe"); // connect chrome driver to Drivers

        // create an istance of WebDriver
        WebDriver driver=new ChromeDriver();

        // open the Website google.com
        driver.get("https://www.Facebook.com/");  //open browser

        //grt the current url that is there in the browser
        String URL=driver.getCurrentUrl();  //we saved in URL

        // print out the url
        System.out.println(URL);

        //get the title of thr webpage
        String title=driver.getTitle();
        System.out.println("the title of the page is "+title);  // the main title of that page

        ////to slow downfor 3 sec-millisec
        Thread.sleep(3000);   //when sleep is red- alt ctrl then click on add signature
        // close the driver
        driver.quit();

    }
}
