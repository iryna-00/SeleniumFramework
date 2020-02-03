package listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class TestNGListenersDemo {

    @Test
    public void test1(){
        System.out.println("This is test1");
    }

    @Test
    public void test2(){
        System.out.println("This is test2");
        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", projectPath +"/Drivers/chromeriver/chromedriver.exe");//Windows
        //System.setProperty("webdriver.chrome.driver", projectPath +"/Drivers/chromeriver/chromedriver");//Linux
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com/");
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Test");
        driver.findElement(By.xpath("//input[@name='test']")).sendKeys("Test");
        driver.close();

    }

    @Test
    public void test3(){
        System.out.println("This is test3");
        throw new SkipException("This test is skipped");
    }
}
