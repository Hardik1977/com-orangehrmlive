package opensource_demo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

    public class MultiBrowserTest {

    static String browser = "Chrome";
    static WebDriver driver;

    static String baseurl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
    //Main method defining
    public static void main(String[] args) {

        //If and else if statements
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong Browser name. ");
        }
        driver.get(baseurl);
        //Maximizing window statement
        driver.manage().window().maximize();
        //Get the title of the page with the method of Get()
        String title = driver.getTitle();
        System.out.println(title);
        //Get the current URL
        System.out.println("Current URl : " + driver.getCurrentUrl());
        //Get the current source
        System.out.println("Current Source : " + driver.getPageSource());
        //Wait statement
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //Find the Username from Username Field
        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("Admin");
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("Admin123");
        //Closing statement
        driver.close();
    }
}
