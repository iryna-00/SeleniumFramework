import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilities_Demo {
    public static void main(String[] args) {

        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.ie.driver", projectPath +"/Drivers/iedriver/iedriverserver.exe");//Windows
        DesiredCapabilities caps = new DesiredCapabilities();


        caps.setCapability("ignoreProtectedModeSettings", true);
        caps.setCapability("ignoreZoomSetting", true);
        //caps.setCapability("initialBrowserUrl", "https://google.com");

        WebDriver driver = new InternetExplorerDriver(caps);

        driver.get("https://google.com");
        driver.findElement(By.name("q")).sendKeys("Test");
        driver.findElement(By.name("q")).sendKeys(Keys.RETURN);

        driver.close();
        driver.quit();

    }
}
