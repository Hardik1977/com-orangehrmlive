package opensource_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTest {

    public static void main(String[] args) {

        //Launch the browser (How to launch the webbrowser
        String baseUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
        //open the URL at WebBrowser
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);
        //Getting Title for URL
        String title = driver.getTitle();
        System.out.println("Ttile : " + title);
        //getting Current URL
        System.out.println("Current URL : " + driver.getCurrentUrl());
        System.out.println("");
        driver.manage().window().maximize();
        //Getting a page source statement
        System.out.println("Page Source : " + driver.getPageSource());
        //Wait statement
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //Enter the username to username field
        WebElement usernamefield = driver.findElement(By.name("username"));
        usernamefield.sendKeys("Admin");
       //Enter the Password to Password field
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("admin123");
        //closing Browser
        driver.close();
    }

}
