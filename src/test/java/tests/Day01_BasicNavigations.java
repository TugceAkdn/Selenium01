package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_BasicNavigations {

    public static void main(String[] args) {
        //1.Step Set Up
        System.setProperty("webdriver.chrome.driver","./src/resources/drivers/chromedriver");

        //2.Create
        WebDriver driver = new ChromeDriver();

        //3.Write Test Scripts

        driver.manage().window().maximize();


        //Steps:
         //  Create a new class under : BasicNavigations
         //  Create main method
         //  Set Path
        // Create chrome driver
        // Maximize the window
        // Open google home page https://www.walmart.com/.

        driver.get("https://www.walmart.com/");

        // On the same class, Navigate to amazon home page https://www.amazon.com/

        //driver.get("")

        driver.navigate().to("https://www.amazon.com/");

        // Navigate back to walmart

        driver. navigate().back();

        // Navigate forward to amazon

        driver.navigate().forward();

        // Refresh the page

        driver.navigate().refresh();

        // Close/Quit the browser
        //driver.close();

        driver.quit();






    }


}
