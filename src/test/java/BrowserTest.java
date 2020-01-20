import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Collections;
import java.util.List;

public class BrowserTest {
    public static void main(String[] args) {

        String projectPath = System.getProperty("user.dir");

        /*FireFox browser settings
        System.out.println(projectPath +"Drivers/geckodriver/geckodriver.exe");
        System.setProperty("webdriver.gecko.driver", projectPath +"/Drivers/geckodriver/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://mvnrepository.com/");
        */


        /*Chrome browser settings*/
        System.setProperty("webdriver.chrome.driver", projectPath +"/Drivers/chromeriver/chromedriver.exe");//Windows
        //System.setProperty("webdriver.chrome.driver", projectPath +"/Drivers/chromeriver/chromedriver");//Linux
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com/");
        WebElement textbox = driver.findElement(By.xpath("//input[@name='q']"));

        List <WebElement> listOfInputElelments = Collections.singletonList(driver.findElement(By.xpath("//input")));
        int count = listOfInputElelments.size();
        System.out.println(count);

        textbox.sendKeys("Test");
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        driver.close();
    }
}
