package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1_GoogleSearch {
    public static void main(String[] args) {
        googleSearch();

    }

    private static void googleSearch(){

        String projectPath = System.getProperty("user.dir");
        //System.setProperty("webdriver.chrome.driver", projectPath +"/Drivers/chromeriver/chromedriver.exe");//Windows
        System.setProperty("webdriver.chrome.driver", projectPath +"/Drivers/chromeriver/chromedriver");//Linux
        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Hello World");

        driver.findElement(By.name("q")).sendKeys(Keys.RETURN);

        driver.close();

        System.out.println("Test Completed Successfully");

    }
}
