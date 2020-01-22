package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GoogleSearchPageObjects;

public class GoogleSearchPageTest {

    private static WebDriver driver = null;

    public static void main(String[] args) {
        googleSearchTest();

    }

    private static void googleSearchTest(){

        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", projectPath +"/Drivers/chromeriver/chromedriver.exe");//Windows
        //System.setProperty("webdriver.chrome.driver", projectPath +"/Drivers/chromeriver/chromedriver");//Linux
        driver = new ChromeDriver();

        GoogleSearchPageObjects searchPageObj = new GoogleSearchPageObjects(driver);

        driver.get("https://google.com");
        searchPageObj.setTextbox_serch("Hello World");
        searchPageObj.clickButton_search();

        driver.close();

    }
}
