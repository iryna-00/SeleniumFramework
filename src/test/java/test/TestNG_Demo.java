package test;

import config.PropertiesFile;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Properties;

public class TestNG_Demo {

    public static String browserName = null;
    private WebDriver driver = null;

    @BeforeTest
    public void setUpTest() throws NullPointerException {

        String projectPath = System.getProperty("user.dir");
        PropertiesFile.getProperties();

        if(browserName.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", projectPath + "/Drivers/chromeriver/chromedriver.exe");//Windows
            //System.setProperty("webdriver.chrome.driver", projectPath +"/Drivers/chromeriver/chromedriver");//Linux
            driver = new ChromeDriver();
        }
        else if(browserName.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", projectPath + "/Drivers/geckodriver/geckodriver.exe");//Windows
            //System.setProperty("webdriver.chrome.driver", projectPath +"/Drivers/chromeriver/chromedriver");//Linux
            driver = new FirefoxDriver();
        }
    }


    @Test
    private void googleSearch() {

        driver.get("https://google.com");
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Hello World");
        driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
    }

    @AfterTest
    public void tearDownTest() {

        driver.close();
        System.out.println("Test Completed Successfully");
        PropertiesFile.setProperties();


    }
}
