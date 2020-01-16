package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GoogleSearchPage;

public class GoogleSearchTest {
    private static WebDriver driver = null;

    public static void main(String[] args) {
        googleSearch();

    }

    private static void googleSearch(){

        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", projectPath +"/Drivers/chromeriver/chromedriver");
        driver = new ChromeDriver();

        driver.get("https://google.com");
        //driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Hello World");

        GoogleSearchPage.textbox_search(driver).sendKeys("Hello World");
        GoogleSearchPage.textbox_search(driver).sendKeys(Keys.RETURN);

        //driver.findElement(By.name("q")).sendKeys(Keys.RETURN);

        driver.close();

        System.out.println("Test Completed Successfully");

    }
}
