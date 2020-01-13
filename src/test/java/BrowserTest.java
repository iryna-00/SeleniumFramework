import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

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
        System.setProperty("webdriver.chrome.driver", projectPath +"/Drivers/chromeriver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mvnrepository.com/");
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        driver.close();
    }
}
