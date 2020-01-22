package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Demo2 {

    private WebDriver driver = null;

    @BeforeTest
    public void setUpTest(){

        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", projectPath +"/Drivers/chromeriver/chromedriver.exe");//Windows
        //System.setProperty("webdriver.chrome.driver", projectPath +"/Drivers/chromeriver/chromedriver");//Linux
        driver = new ChromeDriver();
    }

    @Test
    private void googleSearch(){

        driver.get("https://google.com");
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Hello World");
        driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
    }

    @AfterTest
    public void tearDownTest(){

        driver.close();
        System.out.println("Test Completed Successfully");


    }
}
