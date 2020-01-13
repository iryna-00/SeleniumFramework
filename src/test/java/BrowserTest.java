import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","C:/Users/Iryna_Baranov/IdeaProjects/Mentoring/SeleniumFramework/Drivers/geckodriver/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://mvnrepository.com/");
    }
}
