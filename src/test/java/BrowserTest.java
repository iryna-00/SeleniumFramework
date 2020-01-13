import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTest {
    public static void main(String[] args) {

        String projectPath = System.getProperty("user.dir");
        System.out.println(projectPath +"Drivers/geckodriver/geckodriver.exe");

        System.setProperty("webdriver.gecko.driver", projectPath +"/Drivers/geckodriver/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://mvnrepository.com/");
    }
}
